package test_java;

public class StringComparePerformance {//字符串性能比较测试
    public static void main(String[] args){
        long startTime=System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            String s1="hello";
            String s2="hello";
        }
        long endTime=System.currentTimeMillis();
        System.out.println("通过String关键词创建字符串"+":"
                +(endTime-startTime)+"毫秒");
        long startTime1=System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            String s3=new String("hello");
            String s4=new String("hello");

        }
        long endTime1=System.currentTimeMillis();
        System.out.println(endTime1-startTime1);
    }
}
