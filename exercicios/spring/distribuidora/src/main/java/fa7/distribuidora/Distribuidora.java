package fa7.distribuidora;

import java.util.List;

public class Distribuidora {
	
	List<Fornecedor> meusFornecedores;
	
	public Distribuidora(List<Fornecedor> fornecedores) {
		meusFornecedores = fornecedores;
	}
	
	public void comprarMercadoria(String mercadoria, int quantidade) {
		int menor = 0;
		double valorAtual = Double.MAX_VALUE;
		Fornecedor forn = null;
		for (int i = 0; i < meusFornecedores.size(); i++) {
			forn = meusFornecedores.get(i);
			double valor = forn.calcularReserva(mercadoria, quantidade);
			System.out.println(forn + " - Mercadoria: " + mercadoria + " Valor: " + valor);
			if(valor < valorAtual) {
				menor = i;
				valorAtual = valor;
			}
		}
		forn = meusFornecedores.get(menor);
		System.out.println(forn + " selecionado.");
		forn.reservar(mercadoria, quantidade);
		System.out.println("Valor gasto na reserva: " + forn.calcularReserva(mercadoria, quantidade));
	}

}
