package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by peng_huang on 2017/4/14.
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoConfiguration
public class RandomApp {

    public static void main(String[] args) {
        SpringApplication.run(RandomApp.class, args);
    }
}
