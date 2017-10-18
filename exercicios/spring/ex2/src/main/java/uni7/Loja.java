package uni7;

import java.util.AbstractMap.SimpleEntry;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Loja {
	
	private List<Regra> regras;
	
	public Loja(List<Regra> regras) {
		this.regras = regras;
	}
	
	private Map<String, Double> estoque = Stream.of(
	new SimpleEntry<String, Double>("tesoura", 6.5),
	new SimpleEntry<String, Double>("papel", 3.4),
	new SimpleEntry<String, Double>("caneta", 4.9),
	new SimpleEntry<String, Double>("borracha", 5.0)).collect(
			Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
	
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
