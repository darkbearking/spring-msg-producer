package org.dark;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.stream.annotation.EnableBinding;


@SpringBootApplication
@EnableEurekaClient
//指定接口類 
@EnableBinding(SendService.class)
public class ProducerApp {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ProducerApp.class).run(args);
	}

}
