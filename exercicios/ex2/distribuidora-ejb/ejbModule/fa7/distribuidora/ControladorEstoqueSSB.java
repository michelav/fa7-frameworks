package fa7.distribuidora;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Session Bean implementation class ControladorEstoqueSSB
 */
@Stateless
public class ControladorEstoqueSSB {
	
	@Inject private Estoque meuEstoque;
	
    /**
     * Default constructor. 
     */
    public ControladorEstoqueSSB() {
    	
    }
    
	public int reservarMercadoria(String mercadoria, int qtde) {
    	int qtdeEstoque = meuEstoque.obterQuantidade(mercadoria);
    	int reservado = (qtdeEstoque - qtde) >= 0 ? qtde : 0;
    	if (reservado >= 0) {
    		meuEstoque.retirarEstoque(mercadoria, qtde);
    	}
    	return reservado;
    }
}
