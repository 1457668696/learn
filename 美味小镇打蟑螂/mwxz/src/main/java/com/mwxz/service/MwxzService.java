package com.mwxz.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.mwxz.pojo.Mwxz;

import java.util.List;

public interface MwxzService extends IService<Mwxz> {
    Mwxz queryOil();

    Mwxz Saveoil();

    Boolean addOil();

    void kill();

    int energy();


}
