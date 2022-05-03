package book.ch7.factorybean;
public class InstanceBeanFactory {
    //实例工厂类
    public  Beanunit newBeanUnit(){
        System.out.println("实例工厂类");
        return new Beanunit();
    }
}
