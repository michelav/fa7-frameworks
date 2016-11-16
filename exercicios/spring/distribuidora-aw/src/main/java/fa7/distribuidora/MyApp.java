package fa7.distribuidora;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-aw.xml");
		Distribuidora dist = context.getBean(Distribuidora.class);
		Fornecedor simples = context.getBean("simples", Fornecedor.class);
		Fornecedor  aleatorio = context.getBean("aleatorio", Fornecedor.class);
		simples.informacoesDetalhadas();
		aleatorio.informacoesDetalhadas();
		dist.comprarMercadoria("lapis", 5);
		dist.comprarMercadoria("caneta", 7);
		dist.comprarMercadoria("papel", 12);
		dist.comprarMercadoria("caderno", 10);
	}

}
