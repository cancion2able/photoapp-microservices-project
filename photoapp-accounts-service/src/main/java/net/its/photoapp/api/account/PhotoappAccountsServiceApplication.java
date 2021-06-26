package net.its.photoapp.api.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PhotoappAccountsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoappAccountsServiceApplication.class, args);
    }

}
