package book.ch8.xglibProxy;

import org.junit.Test;

public class TestUserProxyCglib {
    @Test
    public  void t1() {
        UserCglibProxy userCglibProxys = new UserCglibProxy();
        UserService Service = new UserService();
        UserService userService=(UserService)userCglibProxys.createProxy(Service);
        userService.insert();
        userService.login();
    }
}
