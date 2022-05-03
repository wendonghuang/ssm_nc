package book.ch8.noproxy;

import org.junit.Test;

public class TestProxy {
    @Test
    public void t1(){
        UserService us=new UserNoProxy();
        us.login();
    }
}
