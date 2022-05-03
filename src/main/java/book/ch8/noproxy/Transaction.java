package book.ch8.noproxy;
//公用类 -该类用于插入到其它模块中
public class Transaction {
    public void startTrans(){
        System.out.println("startTrans...");
    }
    public void commitTrans(){
        System.out.println("commitTrans...");
    }
    public void closeTrans(){
        System.out.println("closeTrans...");
    }
}
