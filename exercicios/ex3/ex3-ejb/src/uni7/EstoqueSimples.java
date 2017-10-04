package uni7;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EstoqueSimples implements Estoque, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 678085865060330861L;
	Map<String, Integer> estoque;
	
	public EstoqueSimples() {
		estoque = new HashMap<String, Integer>();
		estoque.put("lapis", 20);
		estoque.put("caneta", 50);
		estoque.put("borracha", 10);
		estoque.put("calculadora", 50);
	}
	@Override
	public int obterQuantidade(String mercadoria) {
		return estoque.getOrDefault(mercadoria, 0);
	}
	
	@Override
	public void retirarEstoque(String mercadoria, int quantidade) {
		int qtdeEstoque = estoque.getOrDefault(mercadoria, 0);
		if (qtdeEstoque > quantidade) {
			estoque.put(mercadoria, qtdeEstoque - quantidade);
		}
		System.out.println("Quantide de estoque da mercadoria " 
				+ mercadoria + " atualizado para " + 
				Integer.toString(qtdeEstoque - quantidade));
	}
	@Override
	public void retirarEstoque(Map<String, Integer> req) {
		req.forEach((k, v) -> retirarEstoque(k, v));
	}
	
	public Set<Entry<String, Integer>> listar() {
		return estoque.entrySet();
	}
}
