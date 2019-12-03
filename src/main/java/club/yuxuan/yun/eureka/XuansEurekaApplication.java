package club.yuxuan.yun.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class XuansEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(XuansEurekaApplication.class, args);
    }

}
