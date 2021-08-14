package cn.hacklike.fo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan(basePackages = "cn.hacklike.fo.mapper")
@ComponentScan({"cn.hacklike"})
@SpringBootApplication
public class FoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FoApplication.class, args);
    }

}
