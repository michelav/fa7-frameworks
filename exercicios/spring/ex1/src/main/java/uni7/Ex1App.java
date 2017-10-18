package uni7;

import java.util.AbstractMap.SimpleEntry;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex1App {

	private static Map<String, Integer> compra = Stream.of(
	new SimpleEntry<String, Integer>("tesoura", 8),
	new SimpleEntry<String, Integer>("papel", 10),
	new SimpleEntry<String, Integer>("caneta", 3),
	new SimpleEntry<String, Integer>("borracha", 20)).collect(
			Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
	

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("components.xml");
		Loja loja = context.getBean("loja", Loja.class);
		loja.calcularPedido(compra);
		context.close();
	}

}
