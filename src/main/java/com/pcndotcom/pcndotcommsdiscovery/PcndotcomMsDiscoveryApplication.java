package com.pcndotcom.pcndotcommsdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PcndotcomMsDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(PcndotcomMsDiscoveryApplication.class, args);
	}
}
