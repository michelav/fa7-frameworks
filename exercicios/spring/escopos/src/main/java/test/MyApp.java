package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Mensagem m1 = (Mensagem) context.getBean("m1");
        m1.setTexto("M1 Alterada");
        Mensagem m1a = (Mensagem) context.getBean("m1");
        System.out.println(m1);
        System.out.println(m1a);

        Mensagem m2 = (Mensagem) context.getBean("m2");
        m2.setTexto("M2 Alterada");
        Mensagem m2a = (Mensagem) context.getBean("m2");
        System.out.println(m2);
        System.out.println(m2a);


	}

}
