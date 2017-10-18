package uni7;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex3App {
	
	@SuppressWarnings("serial")
	private static Map<String, Integer> compra = 
			Collections.unmodifiableMap(new HashMap<String, Integer>() {

				{
	                put("tesoura", 8);
	                put("papel", 10);
	                put("caneta", 3);
	                put("borracha", 20);
	            }
	        });
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("components.xml");
		Loja loja = context.getBean("loja", Loja.class);
		loja.calcularPedido(compra);
		context.close();
	}

}
