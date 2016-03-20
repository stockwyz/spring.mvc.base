package com.seawave.mybatis;


import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.seawave.entity.UserT;
import com.seawave.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml", "classpath:spring-mvc.xml"})  
public class TestMyBatis {
    @Resource  
    private IUserService userService = null; 
    
	@Test  
    public void test1() {  
        UserT user = userService.getUserById(1);  
        System.out.println(user.getUserName());
        // System.out.println(user.getUserName());  
        // logger.info("值："+user.getUserName());  
        //logger.info(JSON.toJSONString(user));  
    }
	
	@Test  
    public void test2() {
		UserT user = new UserT();
		user.setUserName("zht");
		user.setPassword("abc");
		user.setAge(36);
        userService.insertUser(user);
        // System.out.println(user.getUserName());  
        // logger.info("值："+user.getUserName());  
        //logger.info(JSON.toJSONString(user));  
    }
}
