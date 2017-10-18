package uni7;

import java.util.AbstractMap.SimpleEntry;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Loja {
	
	private Regra regra;
	
	public Loja(Regra regra) {
		this.regra = regra;
	}
	
	private Map<String, Double> estoque = Stream.of(
	new SimpleEntry<String, Double>("tesoura", 6.5),
	new SimpleEntry<String, Double>("papel", 3.4),
	new SimpleEntry<String, Double>("caneta", 4.9),
	new SimpleEntry<String, Double>("borracha", 5.0)).collect(
			Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
	
	public void calcularPedido(Map<String, Integer> pedido) {
		double valorPedido = 0.0;
		for (Map.Entry<String, Integer> item : pedido.entrySet()) {
			valorPedido += 
					regra.calcular(item.getValue(), estoque.getOrDefault(item.getKey(), 0.0));
		}
		System.out.println("O valor do pedido foi: " + valorPedido);
	}
}
