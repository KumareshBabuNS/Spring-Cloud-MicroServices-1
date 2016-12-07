package com.github.izhangzhihao.APIGateway;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 服务网关
 */
@EnableDiscoveryClient
@EnableZuulProxy
@SpringCloudApplication //等同于@SpringBootApplication、@EnableDiscoveryClient、@EnableCircuitBreaker
public class Application {
    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }
}
