package com.wang.common;

import com.wang.service.Impl.ZhshServiceImpl;
import com.wang.service.ZhshService;
import kong.unirest.UnirestException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.net.UnknownHostException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//为什么没有生效呢
@Slf4j
@RestControllerAdvice
public class WebExceptionAdvice {



    @ExceptionHandler({UnirestException.class,UnknownHostException.class})
    public R<String> handleRuntimeException(UnirestException e,UnknownHostException e1) {
        //匹配异常网址
        Matcher matcher = Pattern.
                compile("HostException:(.+)").
                matcher(e.toString());
        //分支
            String errURl=matcher.group(1);
            return R.error(errURl);


    }

    @ExceptionHandler(DuplicateKeyException.class)
    public R<String> handleRuntimeException(DuplicateKeyException  e) {
        System.out.println("数据库异常，已存在");
        return R.error("数据库异常");
    }

    @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
    public R<String> handleRuntimeException(ArrayIndexOutOfBoundsException e) {
        log.error(e.toString(), e);
        System.out.println("数组越界异常");
        return R.error("数组异常");
    }



    @ExceptionHandler(RuntimeException.class)
    public R<String> handleRuntimeException(RuntimeException e) {
        System.out.println("服务器异常");
        log.error(e.toString(), e);
        return R.error("服务器异常");
    }


}
