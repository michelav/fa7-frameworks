package uni7;

import org.springframework.stereotype.Component;

@Component("Simples")
public class RegraSimples implements Regra {


	public double calcular(int qtde, double valor) {
		return qtde * valor;
	}

	public String toString() {
		return "Simples";
	}

}
