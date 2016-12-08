package fa7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new 
				AnnotationConfigApplicationContext(AppConfig.class);
	}

}
