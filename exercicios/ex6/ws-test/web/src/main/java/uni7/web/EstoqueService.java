package uni7.web;

import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;

import uni7.core.EstoqueBean;
import uni7.core.Item;

@WebService
public class EstoqueService {
	
	@EJB EstoqueBean bean;

	@WebMethod
	public List<Item> list() {
		return bean.list();
	}
}
