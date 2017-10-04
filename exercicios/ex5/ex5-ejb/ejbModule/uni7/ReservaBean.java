package uni7;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.ejb.LocalBean;
import javax.ejb.Remove;
import javax.ejb.Stateful;
import javax.inject.Inject;
import javax.jms.JMSConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.JMSProducer;
import javax.jms.Queue;
import javax.jms.TextMessage;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;


/**
 * Session Bean implementation class ReservaBean
 */
@Stateful
@LocalBean
public class ReservaBean implements ReservaBeanLocal {

	private Map<String, Integer> reserva = new HashMap<String, Integer>();
	
	@Inject Estoque meuEstoque;
	
	@Inject @JMSConnectionFactory("java:/ConnectionFactory") 
	private JMSContext ctx;
	
	@Resource(lookup="java:/jms/queue/pedidos")
	private Queue filaPedidos;
    
	/**
     * Default constructor.
     */
    public ReservaBean() {
    }
    
    public void incluir(String merc, int qtde) {
    	int qtdeFinal = qtde;
    	if (reserva.containsKey(merc)) {
    		qtdeFinal += reserva.get(merc);
    	} 
    	reserva.put(merc, qtdeFinal);
    }
    
    public void reservar() {
    	Map<String, Integer> pedido = new HashMap<>();
    	reserva.forEach((k, v) -> {
    		try {
    			meuEstoque.retirarEstoque(k, v);
    		} catch (MercadoriaIndisponivelException e) {
    			pedido.put(k, v);
    		}
    	});
    	if (!pedido.isEmpty()) {
    		JsonObjectBuilder builder = Json.createObjectBuilder();
    		pedido.forEach((k, v) -> builder.add(k, v));
    		JsonObject pedidoJson = builder.build();
    		TextMessage pedidoMsg = ctx.createTextMessage(pedidoJson.toString());
    		JMSProducer producer = ctx.createProducer();
    		producer.send(filaPedidos, pedidoMsg);
    	}
    }
    
    public Estoque obterEstoque() {
    	return meuEstoque;
    }
    
    @Remove
    public void limpar() {
    	reserva.clear();
    }
}
