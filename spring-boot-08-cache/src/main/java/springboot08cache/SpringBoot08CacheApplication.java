package springboot08cache;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@MapperScan("springboot08cache.DAO")
@SpringBootApplication
@EnableCaching
public class SpringBoot08CacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot08CacheApplication.class, args);
    }

}
