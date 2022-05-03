package book.ch7.allproperties;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestBeanProperties {
    @Test
    public void t1(){
        //取得spring中的对象，必须先取得容器
        String file= "book/ch7/allproperties/beanproperties.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(file);
        BeanProperties s=ac.getBean("bean1",BeanProperties.class);
        System.out.println(s);
    }
}
