package springboot06datamysql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(value = "springboot06datamysql")
@SpringBootApplication
public class SpringBoot06DataMysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot06DataMysqlApplication.class, args);
    }

}
