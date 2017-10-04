package uni7;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.ejb.LocalBean;
import javax.ejb.Remove;
import javax.ejb.Stateful;
import javax.inject.Inject;

/**
 * Session Bean implementation class ReservaBean
 */
@Stateful
@LocalBean
public class ReservaBean implements ReservaBeanLocal {

	private Map<String, Integer> reserva = new HashMap<String, Integer>();
	@Inject Estoque meuEstoque;
	
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
    	meuEstoque.retirarEstoque(reserva);
    }
    
    public Estoque obterEstoque() {
    	return meuEstoque;
    }
    
    @Remove
    public void limpar() {
    	reserva.clear();
    }
}
