package springboot09amqp.Service;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import springboot09amqp.Entity.Book;

@Service
public class BookService {

    @RabbitListener(queues = "xxx要监听的队列的名字")
    public void receive01(Book book){
        System.out.println("接收到一条消息："+book);
    }

    @RabbitListener(queues = "xxx要监听的队列的名字")
    public void receive02(Message message){
        System.out.println(message.getBody());
        System.out.println(message.getMessageProperties());
    }
}
