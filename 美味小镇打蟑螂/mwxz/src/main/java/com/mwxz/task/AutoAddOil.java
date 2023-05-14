package com.mwxz.task;


import com.mwxz.service.MwxzService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


//自动加油脚本
@Component
@Slf4j
public class AutoAddOil {

    private int count=0;

    @Resource
    private MwxzService mwxz;

    @Scheduled(cron = "0 0/30 * * * ? ")
    public void addOil(){
        Boolean state=mwxz.addOil();
        count++;
        if(state){
            log.info("第{}次加油",count);
        }
        log.info("定时任务执行中，但却失败了，因为返回false，body无内容");
    }


}
