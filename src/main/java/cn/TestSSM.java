package cn;

import cn.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSSM {
    @Test
    public void t1(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service=ac.getBean("userServiceImp",UserService.class);
        System.out.println(service.selectByPrimaryKey(1));
    }
}
