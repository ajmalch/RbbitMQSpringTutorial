package com.example.rabbitmq;


import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author Gary Russell
 * @author Scott Deeg
 *
 */
@Profile({"tut6","rpc"})
@Configuration
@EnableRabbit
public class RPCConfig {

	@Profile("server")
	private static class ServerConfig {

		@Bean
		public Queue requestQueue() {
			return new Queue("tut.rpc.requests",true);
		}
		@Bean
		public Queue responseQueue() {
			return new Queue("tut.rpc.replies",true);
		}

		@Bean
		public DirectExchange exchange() {
			return new DirectExchange("tut.rpc");
		}

		@Bean
		public Binding binding(DirectExchange exchange, Queue requestQueue) {
			return BindingBuilder.bind(requestQueue).to(exchange).with("rpc");
		}

		@Bean
		public RPCServer server() {
			return new RPCServer();
		}

	}

}