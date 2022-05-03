package book.ch7.factorybean;
public class StaticBeanFactory {
    //静态工厂类
    public static Beanunit newBeanUnit(){
        System.out.println("静态工厂类");
        return new Beanunit();
    }
}
