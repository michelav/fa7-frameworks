package uni7.api;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import uni7.core.EstoqueBean;
import uni7.core.Item;

@Path("/estoque")
public class EstoqueRest {
	
	@EJB EstoqueBean bean;
	
	@GET
	@Path("items")
	@Produces(MediaType.APPLICATION_JSON)
	public Response list() {
		List<Item> lista = bean.list();
		return Response.status(200).entity(lista).build();
	}

	@POST
	@Path("items")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createItem(Item item) {
		Item created = bean.createItem(item.getName(), item.getQuantity());
		return Response.status(201).entity(created).build();
	}
}
