package com.wang.controller;


import com.wang.common.R;
import com.wang.pojo.Zhsh;
import com.wang.service.ZhshService;
import com.wang.utils.RedisUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("/game")
public class GameController {


    @Resource
    private ZhshService zhshService;
    @Resource
    private RedisUtils redisUtils;

    @GetMapping("/start")
    public R<String> queryGame1(){
        log.info("已经启动攻击服务");
        zhshService.attack();
        return R.success("失败");
    }

    @GetMapping("/stop")
    public R<String> queryGame2(){
         zhshService.stop();
        log.info("已经停止");
        return R.success("停止成功");
    }

    @GetMapping("/zhsh")
    public R<Zhsh> queryGame3(){

        Zhsh aNew = zhshService.getNew();
        return R.success(aNew,"最新数据");
    }


}




















/*写参数前RequestBody,把传入时body转为java对象*/
/*声明控制层和设置响应返回的内容为body，而不是视图页面*/