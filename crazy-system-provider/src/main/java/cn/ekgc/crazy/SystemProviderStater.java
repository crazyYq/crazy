package cn.ekgc.crazy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <b></b>
 *
 * @author 救赎呐
 * @data 2022/7/13
 */
@MapperScan("cn.ekgc.crazy.*.*.dao")
@EnableEurekaClient
@SpringBootApplication
public class SystemProviderStater {
	public static void main(String[] args) {
		SpringApplication.run(SystemProviderStater.class, args);
	}
}
