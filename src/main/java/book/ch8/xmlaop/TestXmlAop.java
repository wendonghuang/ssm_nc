package book.ch8.xmlaop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXmlAop {
    @Test
    public void t1(){
        String file="book/ch8/xmlaop/xmlaop.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(file);
        Userdao userdao=ac.getBean("userDao",Userdao.class);
        userdao.delete();
    }
    @Test
    public void t2(){
        String file="book/ch8/xmlaop/proxyaop.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(file);
        Userdao userdao=ac.getBean("userDao",Userdao.class);
        userdao.select();
    }
}
