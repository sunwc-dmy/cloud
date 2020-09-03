package com.hc360.amqp.rabbitmq.config;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.InputStream;
import java.util.Properties;

/**
 * @author xiangp
 * @date 2020/7/3 2:52
 */
@Configuration
public class RabbitMqConfig {

    @Bean
    public ConnectionFactory connectionFactory() {

        CachingConnectionFactory cachingConnectionFactory = new CachingConnectionFactory();
        RabbitProperties rabbitProperties = getRabbitProperties();
        cachingConnectionFactory.setHost(rabbitProperties.getHost());
        cachingConnectionFactory.setPort(rabbitProperties.getPort());
        cachingConnectionFactory.setUsername(rabbitProperties.getUsername());
        cachingConnectionFactory.setPassword(rabbitProperties.getPassword());
        return cachingConnectionFactory;
    }
    private RabbitProperties getRabbitProperties(){
        RabbitProperties rabbitProperties = new RabbitProperties();
        try {
            InputStream resourceAsStream = RabbitMqConfig.class.getClassLoader().getResourceAsStream("rabbitmq.properties");
            Properties properties = new Properties();
            properties.load(resourceAsStream);
            rabbitProperties.setHost(properties.getProperty("rabbitmq.host"));
            String port = properties.getProperty("rabbitmq.port");
            if (null != port && !"".equals(port)) {
                rabbitProperties.setPort(Integer.valueOf(port));
            }
            rabbitProperties.setUsername(properties.getProperty("rabbitmq.username"));
            rabbitProperties.setPassword(properties.getProperty("rabbitmq.password"));
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("rabbitmq.properties");
        }
        return rabbitProperties;
    }
    @Bean
    public AmqpAdmin amqpAdmin() {
        return new RabbitAdmin(connectionFactory());
    }

    @Bean
    public RabbitTemplate rabbitTemplate() {
        return new RabbitTemplate(connectionFactory());
    }
}
