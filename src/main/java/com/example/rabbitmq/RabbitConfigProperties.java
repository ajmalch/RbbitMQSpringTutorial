package com.example.rabbitmq;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix="spring.rabbitmq")
@Configuration
public class RabbitConfigProperties {

	private String host;
	private String port;
	private String managementpluginport;
	
	public String getManagementpluginport() {
		return managementpluginport;
	}
	public void setManagementpluginport(String managementpluginport) {
		this.managementpluginport = managementpluginport;
	}
	public String getHost() {
		return this.host;
	}
	public String getPort() {
		return this.port;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public void setPort(String port) {
		this.port = port;
	}
	
	
}
