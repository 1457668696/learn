package com.mwxz.task;


import com.mwxz.pojo.Mwxz;
import com.mwxz.service.MwxzService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

@Slf4j
@Component
public class AutoUpdateSql {

    @Autowired
    private MwxzService mwxzService;

    private int count = 0;

    @Scheduled(cron = "0 0/30 * * * ? ")
    public void save() {
        Mwxz saveoil = mwxzService.Saveoil();
        if (saveoil.getId() != null) {
            count++;
            log.info("更新到数据库：" + count + "次");
        } else {
            log.info("插入失败，检查实现类");
        }


    }
}