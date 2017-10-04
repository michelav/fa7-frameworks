package uni7;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Message-Driven Bean implementation class for: ProcessaPedidosMDB
 */
@MessageDriven(activationConfig = { @ActivationConfigProperty(propertyName = "destination", propertyValue = "pedidos"),
		@ActivationConfigProperty(propertyName = "destinationJndiName", propertyValue = "java:/jms/queue/pedidos"),
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue") })
public class ProcessaPedidosMDB implements MessageListener {

	/**
	 * Default constructor.
	 */
	public ProcessaPedidosMDB() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see MessageListener#onMessage(Message)
	 */
	public void onMessage(Message message) {
		TextMessage msg = (TextMessage) message;
		try {
			System.out.println(msg.getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

}
