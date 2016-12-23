package com.github.izhangzhihao.LoadBalanceService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 负载均衡 & 断路器
 */
@EnableHystrixDashboard
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix //expose stream
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/")
    public String home() {
        return "forward:/hystrix.stream";
    }
}
