package fa7;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component
public class MessageProcessor {
	
	@Autowired
	JmsTemplate template;

	@JmsListener(destination="in-queue", containerFactory="jmsListenerContainerFactory")
	public void processMessage(TextMessage message) throws JMSException {
		System.out.println("Texto Recebido: " + message.getText());
		template.send(new MessageCreator() {
			
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage("Mensagem recebida!");
			}
		});
	}
}
