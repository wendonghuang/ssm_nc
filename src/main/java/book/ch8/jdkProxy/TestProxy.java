package book.ch8.jdkProxy;

import org.junit.Test;

public class TestProxy {
    @Test
    public void t1(){
        UserJdkProxy jdkProxy=new UserJdkProxy();
        UserService service=new UserServiceImp();
        UserService bill=(UserService)jdkProxy.createProxy(service);
        bill.insert();
    }
}
