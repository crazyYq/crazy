package cn.ekgc.crazy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <b>系统模板启动类</b>
 *
 * @author 救赎呐
 * @data 2022/7/13
 */
@EnableFeignClients(basePackages = "cn.ekgc.crazy.system.admin.transport")
@EnableEurekaClient
@SpringBootApplication
public class SystemConsumerStarter {
	public static void main(String[] args) {
		SpringApplication.run(SystemConsumerStarter.class, args);
	}
}
