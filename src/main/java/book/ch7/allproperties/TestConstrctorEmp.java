package book.ch7.allproperties;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstrctorEmp {
    @Test
    public void t1(){
        //取得spring中的对象，必须先取得容器
        String file= "book/ch7/allproperties/constrctorEmp.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(file);
        ConstrctorEmp con1=ac.getBean("con1",ConstrctorEmp.class);
        System.out.println(con1);
        ConstrctorEmp con2=ac.getBean("con2",ConstrctorEmp.class);
        System.out.println(con2);
        ConstrctorEmp con3=ac.getBean("con1",ConstrctorEmp.class);
        System.out.println(con3);
    }
}
