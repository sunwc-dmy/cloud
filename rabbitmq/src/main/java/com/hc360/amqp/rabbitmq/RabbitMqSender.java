package com.hc360.amqp.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * RabbitMQ 发送端
 * @author xiangp
 * @date 2020/7/2 14:38
 */
@Component
public class RabbitMqSender {

    @Autowired
    RabbitTemplate rabbitTemplate;

    /**
     *  发送消息
     * @author xiangp
     * @date 2020/7/2 14:45
     * @param exchange  交换器
     * @param routingKey 路由键
     * @param msg  消息内容
     * @return void
     */
    public void convertAndSend(String exchange, String routingKey, Object msg) {
        rabbitTemplate.convertAndSend(exchange,routingKey,msg);
    }

    /**
     *  发送消息
     * @author xiangp
     * @date 2020/7/2 14:45
     * @param exchange  交换器
     * @param routingKey 路由键
     * @param msg  消息内容
     * @return void
     */
    public void convertAndSend(String exchange, String routingKey, String msg) {
        rabbitTemplate.convertAndSend(exchange,routingKey,msg);
    }
}
