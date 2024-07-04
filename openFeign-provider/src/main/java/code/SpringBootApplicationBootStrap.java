package code;

// Copyright (c) 2024, NoCodeNoLife-cloud. All rights reserved.
// Author: NoCodeNoLife-cloud
// stay hungry，stay foolish
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
public class SpringBootApplicationBootStrap {
	/**
	 * Entry point of the application.
	 * @param args The command line arguments.
	 */
	@SneakyThrows
	public static void main(String[] args) {
		// Run the Spring Boot application
		SpringApplication.run(SpringBootApplicationBootStrap.class, args);
	}
}