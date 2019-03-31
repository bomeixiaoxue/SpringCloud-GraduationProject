package com.hao.competitionservice;

import com.hao.base.MapperFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
@EnableHystrixDashboard
@EnableOAuth2Sso
@EnableGlobalMethodSecurity(prePostEnabled = true)
@MapperScan("com.hao.base.dao")
public class CompetitionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompetitionServiceApplication.class, args);
    }

    /**
     * 这样其他类才能注入OAuth2RestTemplate，@LoadBalanced实现ribbon负载均衡
     * @param oAuth2ClientContext
     * @param details
     * @return
     */
    @Bean
    @LoadBalanced
    OAuth2RestTemplate oAuth2RestTemplate(OAuth2ClientContext oAuth2ClientContext, OAuth2ProtectedResourceDetails details) {
        return new OAuth2RestTemplate(details, oAuth2ClientContext);
    }

    /**
     * 创建mybatis的mapper工厂
     * @return
     */
    @Bean
    MapperFactory mapperFactory() {
        return new MapperFactory();
    }

}
