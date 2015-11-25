package com.example.rabbitmq;


import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.handler.annotation.SendTo;

/**
 * @author Gary Russell
 * @author Scott Deeg
 */
@Configuration
public class RPCServer {

	
	
	@RabbitListener(queues = "tut.rpc.requests")
	@SendTo("tut.rpc.replies") 
	public String fibonacci(Message name) {
		System.out.println(" [x] Received request for " + name);
		//int result = fib(n);
		String result=new String(name.getBody());
		System.out.println(" [.] Returned " + result);
		return result;
	}

	public int fib(int n) {
		return n == 0 ? 0 : n == 1 ? 1 : (fib(n - 1) + fib(n - 2));
	}

}