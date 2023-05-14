package com.mwxz.task;

import com.mwxz.service.MwxzService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Slf4j
@Component
public class AutoKill {
    private int count = 0;

    @Resource
    private MwxzService mwxz;

    @Scheduled(cron = "0 0 0/6 * * ? ")
    public void kill() {
        mwxz.kill();
        count++;
        log.info("第{}次打蟑螂", count);

    }
}