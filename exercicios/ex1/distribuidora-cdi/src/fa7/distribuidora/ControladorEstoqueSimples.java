package fa7.distribuidora;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class ControladorEstoqueSimples implements ControladorEstoque {

	@Override
	public String avaliarPedido(String mercadoria) {
		return "Pedido de Reserva para  " + mercadoria  + " - OK";
	}

}
