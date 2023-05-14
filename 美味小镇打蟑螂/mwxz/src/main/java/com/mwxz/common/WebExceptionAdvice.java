package com.mwxz.common;


import kong.unirest.UnirestException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestControllerAdvice
@Slf4j
public class WebExceptionAdvice {


    //网址异常
    @ExceptionHandler({UnirestException.class,UnknownHostException.class})
    public R<String> handleRuntimeException(UnirestException e,UnknownHostException e1) {
        //匹配异常网址
        Matcher matcher = Pattern.
                compile("HostException:(.+)").
                matcher(e.toString());
        //分支
        if(matcher.find()){
            String errURl=matcher.group(1);
            return R.error(errURl,"请求网址错误");
        }

            return R.error("未匹配到异常网址");

    }

    @ExceptionHandler(RuntimeException.class)
    public R<String> handleRuntimeException(RuntimeException e) {
        System.out.println("服务器异常");
        log.error(e.toString(), e);
        return R.error("服务器异常");

    }
}