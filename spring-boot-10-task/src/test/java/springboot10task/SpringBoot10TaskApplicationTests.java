package springboot10task;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
class SpringBoot10TaskApplicationTests {

    @Autowired
    JavaMailSender javaMailSender;

    @Test
    void contextLoads() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("发送邮箱号");
        message.setTo("接受邮箱号");
        message.setSubject("邮件服务测试");
        message.setText("你好！");
        javaMailSender.send(message);
    }

    @Test
    public void test02() throws Exception{
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage,true);
        mimeMessageHelper.setFrom("发送邮箱号");
        mimeMessageHelper.setTo("接受邮箱号");
        mimeMessageHelper.setSubject("邮件服务测试");
        mimeMessageHelper.setText("<h1>你好！</h1>",true);
        mimeMessageHelper.addAttachment("1.jpg",new File("D:\\Desktable\\假期_腾讯2020校园招聘-后台.zip"));
        javaMailSender.send(mimeMessage);
    }

}
