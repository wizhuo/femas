package com.tencent.tsf.femas.gray.example.springcloud;

import com.tencent.tsf.femas.common.constant.FemasConstant;
import com.tencent.tsf.femas.common.context.FemasContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;




@EnableFeignClients(basePackages = "com.tencent.tsf.femas.gray.example.springcloud.hoxton.feign")
@SpringBootApplication
@EnableDiscoveryClient
public class FemasGrayConsumerServiceC2 {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "c2");
        System.setProperty(FemasConstant.FEMAS_APPLICATION_VERSION_KEY, "2.0");
        SpringApplication.run(FemasGrayConsumerServiceC2.class, args);
    }



}
