package com.github.izhangzhihao.APIGateway;


import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * APIGateway
 */
@EnableZuulProxy
@SpringCloudApplication //等同于@SpringBootApplication、@EnableDiscoveryClient、@EnableCircuitBreaker
public class Application {
    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }

    /**
     * 注册过滤器
     */
    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }
}