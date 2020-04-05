package springboot09amqp;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot09AmqpApplicationTests {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Autowired
    AmqpAdmin amqpAdmin;

    @Test
    void Create(){
        //创建一个交换器
        amqpAdmin.declareExchange(new DirectExchange("zjc"));
        //创建一个队列
        amqpAdmin.declareQueue(new Queue("firstqueue"));
        //将交换器和队列进行绑定
        amqpAdmin.declareBinding(new Binding("firstqueue", Binding.DestinationType.QUEUE,"zjc","amqp.hh",null));
    }

    @Test
    void contextLoads() {
        //Message需要自己构造一个；可以自定义消息头和消息体
        //rabbitTemplate.send(exchange,routeKey,message);

        //object默认当成消息体，只需要传入要发送的对象，自动序列化发送给RabbitMQ
        //rabbitTemplate.convertAndSend(exchange,routeKey,object);

        //接受消息队列中的数据，并自动完成转换
        //Object o = rabbitTemplate.receiveAndConvert("xxx");
    }

}
