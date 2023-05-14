package com.mwxz.controller;


import cn.hutool.core.bean.BeanUtil;
import com.mwxz.common.R;
import com.mwxz.dto.MwxzDto;
import com.mwxz.pojo.Mwxz;
import com.mwxz.service.MwxzService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

@RestController
@RequestMapping("/mwxz")
public class MwxzController {


    @Resource
    private MwxzService mwxz;

    @GetMapping("/oil")
    public R<String> addOil(){

       if ( mwxz.addOil()){
           return R.success("添加成功");
        }

       return R.error("服务错误，请检查服务器");

    }


    @GetMapping("/save")
    public R<Mwxz> saveGame() {
        Mwxz saveoil = mwxz.Saveoil();
        return R.success("查询成功",saveoil);

    }


    @GetMapping("/all")
    public R<MwxzDto> queryGame() {

        //只返回必要的信息
        MwxzDto mwxzDto = BeanUtil.toBean(mwxz.queryOil(), MwxzDto.class);
        return R.success("查询成功",mwxzDto);

    }


}
