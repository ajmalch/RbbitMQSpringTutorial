package com.example.rabbitmq;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Ajmal Cholassery
 *
 */
@SpringBootApplication
@EnableScheduling
@RestController
public class RabbitMQTutorialsApplication extends SpringBootServletInitializer{

    public static void main(String[] args) throws Exception {
        SpringApplication.run(RabbitMQTutorialsApplication.class, args);
    }
    @Autowired
    RabbitConfigProperties configProperties;
    @RequestMapping("/")
    ModelAndView rabbit(){
    	return new ModelAndView("redirect:http://"+configProperties.getHost()+":"+configProperties.getManagementpluginport());
    }
}