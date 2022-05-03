package book.ch8.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class UserJdkProxy implements InvocationHandler{
    private Transaction transaction=new Transaction();
    private Logging logging=new Logging();
    private UserService userService;
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


        logging.startLogging();
        transaction.startTrans();

       Object obj=method.invoke(userService,args);//真正访问
        transaction.commitTrans();
        transaction.closeTrans();
        logging.closeLogging();
        return obj;
    }
    public  Object createProxy(UserService userService){
        this.userService=userService;
        //加载当前类
        ClassLoader classLoader=UserJdkProxy.class.getClassLoader();
        Class[] clazz=userService.getClass().getInterfaces();



        return Proxy.newProxyInstance(classLoader,clazz,this);
    }
}
