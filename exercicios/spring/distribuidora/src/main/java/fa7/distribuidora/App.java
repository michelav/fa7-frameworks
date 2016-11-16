package fa7.distribuidora;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		Distribuidora dist = context.getBean(Distribuidora.class);
		dist.comprarMercadoria("lapis", 5);
		dist.comprarMercadoria("caneta", 7);
		dist.comprarMercadoria("papel", 12);
		dist.comprarMercadoria("caderno", 10);
	}
}
