package springboot10task.Service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledService {

    @Scheduled(cron = "0 * * * * TUE")
    public void test01(){
        System.out.println("定时任务");
    }
}
