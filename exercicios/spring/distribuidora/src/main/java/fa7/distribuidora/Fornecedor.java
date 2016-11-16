package fa7.distribuidora;

import java.util.List;

public interface Fornecedor {
	
	public List<String> listarMercadorias();
	
	public double calcularReserva(String mercadoria, int quantidade);
	
	public boolean reservar(String mercadoria, int quantidade);

}
