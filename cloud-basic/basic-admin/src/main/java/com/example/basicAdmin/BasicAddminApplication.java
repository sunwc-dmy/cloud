package com.example.basicAdmin;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
public class BasicAddminApplication {

    public static void main(String args[]) {
        SpringApplication.run(BasicAddminApplication.class, args);
    }
}
