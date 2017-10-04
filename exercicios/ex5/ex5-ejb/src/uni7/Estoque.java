package uni7;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public interface Estoque {
	
	public int obterQuantidade(String mercadoria);
	public void retirarEstoque(String mercadoria, int quantidade) throws MercadoriaIndisponivelException;
	public void retirarEstoque(Map<String, Integer> req);
	public Set<Entry<String, Integer>> listar();

}
