package uni7;

public class RegraSimples implements Regra {

	private String nome; 
	
	private double fator;

	public RegraSimples(double fator) {
		this.fator = fator;
	}
	
	@Override
	public double calcular(int qtde, double valor) {
		return qtde * valor * fator;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return nome;
	}

}
