package com.lgp.microservicehystrixdashboard;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
/**
 * 测试步骤:
 * 1. 访问http://localhost:8030/hystrix.stream 可以查看Dashboard
 * 2. 在上⾯的输⼊框填⼊: http://想监控的服务:端⼝/hystrix.stream进
 ⾏测试
 * 注意：⾸先要先调⽤⼀下想监控的服务的API，否则将会显示⼀个空的图表.
 */
@SpringBootApplication
@EnableHystrixDashboard
public class MicroserviceHystrixDashboardApplication {

	public static void main(String[] args) {
//		SpringApplication.run(MicroserviceHystrixDashboardApplication.class, args);
		new SpringApplicationBuilder(MicroserviceHystrixDashboardApplication.class).web(true).run(args);
	}

}
