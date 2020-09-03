package com.example.provide.Compent;



//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.parser.ParserConfig;
//import com.alibaba.fastjson.support.config.FastJsonConfig;

import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {
////    RedisConfig(){
////        //打开autotype功能,需要强转的类一次添加其后
////        ParserConfig.getGlobalInstance()
////                .addAccept("com.example.mypay.entity");
////    }
//
//    @Bean
//    public RedisTemplate<Object,Object> redisTemplate(RedisConnectionFactory redisConnectionFactory){
//        RedisTemplate<Object,Object> template =new RedisTemplate<>();
//        //template .setConnectionFactory(redisConnectionFactory);
//        FastJsonRedisSerializer<Object> fastJsonRedisSerializer=new FastJsonRedisSerializer<>(Object.class);
//        template.setValueSerializer(fastJsonRedisSerializer);
//        template.setKeySerializer(new StringRedisSerializer());
//        template.setHashValueSerializer(fastJsonRedisSerializer);
//        template.setHashKeySerializer(new StringRedisSerializer());
//        template.setConnectionFactory(redisConnectionFactory);
//        return template;
//
//    }


}