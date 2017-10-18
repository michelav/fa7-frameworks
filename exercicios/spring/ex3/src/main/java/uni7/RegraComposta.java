package uni7;

import org.springframework.stereotype.Component;

@Component("composta")
public class RegraComposta implements Regra {

	private double fator = 1.3;
	
	@Override
	public double calcular(int qtde, double valor) {
		return qtde * valor * fator;
	}

	public String toString() {
		return "Composta";
	}
	
}
