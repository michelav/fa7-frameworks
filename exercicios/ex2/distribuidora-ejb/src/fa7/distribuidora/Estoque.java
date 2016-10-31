package fa7.distribuidora;

public interface Estoque {
	
	public int obterQuantidade(String mercadoria);
	public void retirarEstoque(String mercadoria, int quantidade);

}
