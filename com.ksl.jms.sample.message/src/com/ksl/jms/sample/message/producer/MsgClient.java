package com.ksl.jms.sample.message.producer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ksl.jms.sample.message.producer.SimpleMessageSender;

public class MsgClient {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext jmsContext = null;
		jmsContext = new FileSystemXmlApplicationContext(
				"src/WEB-INF/jmsContext.xml");
		SimpleMessageSender messageSender = (SimpleMessageSender) jmsContext
				.getBean("simpleMessageSender");
 
		// Create a session within the connection.
		messageSender.sendMessage("hello");
		System.out.println("Message sent");

	}

}
