package book.ch7.scope;
public class SingleBean {
    private static SingleBean bean=null;
    private SingleBean(){
        //这个对象实例化只能一个实例
    }
    public static  synchronized SingleBean getInstance(){
        if(null==bean)
            bean = new SingleBean();
        return  bean;
    }
}
