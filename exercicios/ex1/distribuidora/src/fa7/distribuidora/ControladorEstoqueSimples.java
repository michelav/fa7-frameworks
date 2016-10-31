package fa7.distribuidora;

public class ControladorEstoqueSimples implements ControladorEstoque {

	@Override
	public String avaliarPedido(String mercadoria) {
		return "Pedido de Reserva para  " + mercadoria  + " - OK";
	}

}
