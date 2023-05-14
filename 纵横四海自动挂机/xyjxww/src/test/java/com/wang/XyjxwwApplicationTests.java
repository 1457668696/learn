package com.wang;

import com.wang.service.ZhshService;
import com.wang.utils.RedisUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Lazy;

import javax.annotation.Resource;

@SpringBootTest
class XyjxwwApplicationTests {


	@Resource
	private ZhshService zhshService;

	@Resource
	RedisUtils redisUtils;



	void testRedis() {
		//redisUtils.set("name","汪贤民",10);
		//System.out.println(redisUtils.get("name"));
	}



	@Test
	void testOil() {
       //zhshService.getNew();

	}



}
