package cn.ekgc.crazy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心启动类
 * @author crazy
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class CrazyRegisterStarter {
    public static void main(String[] args) {
        SpringApplication.run(CrazyRegisterStarter.class, args);
    }
}
