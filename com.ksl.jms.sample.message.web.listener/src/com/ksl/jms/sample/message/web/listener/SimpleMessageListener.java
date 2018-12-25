package com.ksl.jms.sample.message.web.listener;


import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
 
public class SimpleMessageListener implements MessageListener {
	@Override
	public void onMessage(Message message) {
		try {
			TextMessage msg = (TextMessage) message;
			System.out.println(msg.getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
}