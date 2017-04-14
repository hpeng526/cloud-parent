package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by peng_huang on 2017/4/14.
 */

@SpringBootApplication
@EnableEurekaClient
public class RandomApp {

    public static void main(String[] args) {
        SpringApplication.run(RandomApp.class, args);
    }
}
