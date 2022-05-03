package book.ch8.noproxy;
//公用类 -该类用于插入到其它模块中
public class Logging {
    public void startLogging(){
        System.out.println("startLogging...");
    }
    public void closeLogging(){
        System.out.println("closeLogging,store file...");
    }
}
