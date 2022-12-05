package co.stay.prj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@MapperScan(basePackages = "co.stay.prj.**.mapper")

public class YoUrUstayApplication {
	public static void main(String[] args) {
		SpringApplication.run(YoUrUstayApplication.class, args);
	}

}