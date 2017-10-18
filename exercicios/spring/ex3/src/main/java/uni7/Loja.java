package uni7;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("loja")
public class Loja {
	
	private List<Regra> regras;
	
	@Autowired
	public Loja(List<Regra> regras) {
		this.regras = regras;
	}
	
	@SuppressWarnings("serial")
	private Map<String, Double> estoque = 
			Collections.unmodifiableMap(new HashMap<String, Double>() {

				{
	                put("tesoura", 6.5);
	                put("papel", 3.4);
	                put("caneta", 4.9);
	                put("borracha", 5.0);
	            }
	        });
			
	public void calcularPedido(Map<String, Integer> pedido) {
		double valorPedidoRegra;
		for (Regra regra : regras) {
			valorPedidoRegra = 0.0;
			for (Map.Entry<String, Integer> item : pedido.entrySet()) {
				valorPedidoRegra += 
						regra.calcular(item.getValue(), estoque.getOrDefault(item.getKey(), 0.0));
			}
			System.out.format("O valor do pedido para Regra %s foi %.2f\n", regra, valorPedidoRegra);
		}
	}
}
