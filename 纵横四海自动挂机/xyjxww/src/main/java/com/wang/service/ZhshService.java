package com.wang.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.pojo.Zhsh;

import java.util.List;

public interface ZhshService extends IService<Zhsh> {
    void attack();

    Zhsh getGame();

    void stop();

    Zhsh getNew();


}
