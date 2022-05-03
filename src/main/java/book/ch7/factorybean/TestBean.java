package book.ch7.factorybean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestBean {
    @Test
    public void t1() {
        String file = "book/ch7/factorybean/factorybean.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(file);
        Beanunit b1=ac.getBean("commonBean",Beanunit.class);
        b1.say();
        Beanunit b2=ac.getBean("staticBean",Beanunit.class);
        b2.say();
        Beanunit b3=ac.getBean("instanceBean",Beanunit.class);
        b3.say();
    }
}
