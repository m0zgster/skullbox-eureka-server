package ru.skullbox.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SkullboxEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkullboxEurekaServerApplication.class, args);
	}
}
