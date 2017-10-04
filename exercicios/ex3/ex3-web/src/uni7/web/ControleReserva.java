package uni7.web;

import java.io.Serializable;
import java.util.Map.Entry;
import java.util.Set;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;

import uni7.ReservaBeanLocal;

@SessionScoped
public class ControleReserva implements Serializable {

	@EJB
	ReservaBeanLocal bean;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7683876648488364696L;

	public void incluir(String mercadoria, int qtde) {
		bean.incluir(mercadoria, qtde);
	}
	
	public void reservar() {
		bean.reservar();
	}
	
	public Set<Entry<String, Integer>> listar() {
		return bean.obterEstoque().listar();
	}
}
