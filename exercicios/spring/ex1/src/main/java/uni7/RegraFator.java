package uni7;

public class RegraFator implements Regra {

	private double fator;

	public RegraFator(double fator) {
		this.fator = fator;
	}
	
	@Override
	public double calcular(int qtde, double valor) {
		return qtde * valor * fator;
	}

}
