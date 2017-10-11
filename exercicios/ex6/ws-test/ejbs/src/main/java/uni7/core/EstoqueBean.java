package uni7.core;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Session Bean implementation class EstoqueBean
 */
@Stateless
@LocalBean
public class EstoqueBean {

	@Inject Estoque meuEstoque;
	
    /**
     * Default constructor. 
     */
    public EstoqueBean() {
        // TODO Auto-generated constructor stub
    }
    
    public Item createItem(String name, int quant) {
    	return meuEstoque.createItem(name, quant);
    }
    
    public List<Item> list() {
    	return meuEstoque.items();
    }

}
