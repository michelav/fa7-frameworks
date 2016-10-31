package fa7.distribuidora;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EstoqueSimples implements Estoque {

	Map<String, Integer> estoque;
	
	public EstoqueSimples() {
		estoque = new HashMap<String, Integer>();
		estoque.put("lapis", 20);
		estoque.put("caneta", 50);
		estoque.put("borracha", 10);
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
}
