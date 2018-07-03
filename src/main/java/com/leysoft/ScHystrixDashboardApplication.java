package com.leysoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

//@EnableTurbine
@EnableHystrixDashboard
@SpringBootApplication
public class ScHystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScHystrixDashboardApplication.class, args);
	}
}
