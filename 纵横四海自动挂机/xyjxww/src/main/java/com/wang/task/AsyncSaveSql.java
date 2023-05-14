package com.wang.task;


import com.wang.pojo.Zhsh;
import com.wang.service.ZhshService;
import kong.unirest.UnirestException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.net.UnknownHostException;

@Service
public class AsyncSaveSql {


    @Autowired
    @Lazy
    private ZhshService zhshService;



    @Async
    @Transactional
    public void saveSqlTask(){
        Zhsh game = zhshService.getGame();
        try{

            zhshService.save(game);

        }catch (DuplicateKeyException e){
            System.out.println("数据已存在，无需第二次插入");
        }catch (UnirestException e){
            System.out.println("服务器错误,准备重启");
            zhshService.attack();
        }



        System.out.println(Thread.currentThread().getName()+"插入成功");


    }




}
