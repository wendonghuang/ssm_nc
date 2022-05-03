package book.ch8.xglibProxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class UserCglibProxy implements MethodInterceptor {
    private UserService userService;
    private Logging logging=new Logging();
    private Transaction transaction=new Transaction();
    public Object createProxy(Object obj){
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(obj.getClass());
        enhancer.setCallback(this);
        return enhancer.create();

    }
    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        logging.startLogging();
        transaction.startTrans();

       // Object obj=method.invoke(userService,objects);//真正访问
        Object obj=methodProxy.invokeSuper(proxy,args);
        transaction.commitTrans();
        transaction.closeTrans();
        logging.closeLogging();
        return obj;

    }
}
