package com.example.task.demos.web.config;

import com.example.task.demos.web.quartz.MyQuartz;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzConfig {



//    任务明细，绑定工作
    @Bean
    public JobDetail jobDetail(){
        return JobBuilder.newJob(MyQuartz.class).storeDurably().build();
    }

//    触发器，绑定明细
    @Bean
    public Trigger trigger(){
        ScheduleBuilder scheduleBuilder=CronScheduleBuilder.cronSchedule("0/5 * * * * ?");
        return TriggerBuilder.newTrigger().forJob(jobDetail()).withSchedule(scheduleBuilder).build();
    }



}
