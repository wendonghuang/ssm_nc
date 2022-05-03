package book.ch7.scope;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSingle {
    @Test
    public void t1(){
        SingleBean s1=SingleBean.getInstance();
        SingleBean s2=SingleBean.getInstance();
        System.out.println(s1==s2);
        Student stu1=new Student();
        Student stu2=new Student();
        System.out.println(stu1==stu2);
    }
    @Test
    public void t2(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("book/ch7/scope/scope.xml");
        Student s1=ac.getBean("stu1",Student.class);
        Student s2=ac.getBean("stu1",Student.class);
        System.out.println(s1==s2);
    }
}
