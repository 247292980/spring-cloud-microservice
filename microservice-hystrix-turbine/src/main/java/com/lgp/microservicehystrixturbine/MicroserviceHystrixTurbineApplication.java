package com.lgp.microservicehystrixturbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * 通过@EnableTurbine接⼝，激活对Turbine的⽀持。
 */
@SpringBootApplication
@EnableTurbine
public class MicroserviceHystrixTurbineApplication {

    public static void main(String[] args) {
//		SpringApplication.run(MicroserviceHystrixTurbineApplication.class, args);
        new SpringApplicationBuilder(MicroserviceHystrixTurbineApplication.class).web(true).run(args);
    }
}
