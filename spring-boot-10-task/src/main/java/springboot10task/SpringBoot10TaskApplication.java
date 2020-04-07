package springboot10task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableAsync
@SpringBootApplication
public class SpringBoot10TaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot10TaskApplication.class, args);
    }

}
