package Test_th.Mapper;

import Test_th.Mapper.Controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    @Test
    public void t1(){
        ApplicationContext ac=
                new ClassPathXmlApplicationContext("Test_th/Mapper/Test3.xml");
        UserController we=ac.getBean("userController",UserController.class);
        we.addUser();
        we.dlUser();
        we.seUser();
        we.upUser();
    }
}
