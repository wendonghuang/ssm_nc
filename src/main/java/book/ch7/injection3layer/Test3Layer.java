package book.ch7.injection3layer;
import book.ch7.injection3layer.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test3Layer {
    @Test
    public void t1(){
        ApplicationContext ac=
                new ClassPathXmlApplicationContext("book/ch7/injection3layer/inject.xml");
       UserController web=ac.getBean("userController",UserController.class);
       web.addUser();
    }
}
