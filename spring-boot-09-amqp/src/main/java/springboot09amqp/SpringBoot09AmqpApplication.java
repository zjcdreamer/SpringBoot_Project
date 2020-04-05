package springboot09amqp;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit //开启基于配置的RabbitMQ模式
@SpringBootApplication
public class SpringBoot09AmqpApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot09AmqpApplication.class, args);
    }

}
