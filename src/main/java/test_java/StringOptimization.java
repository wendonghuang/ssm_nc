package test_java;

public class StringOptimization {//字符串优化
    public static  void main(String[] args){
        String variables[]=new String[50000];
        for(int i=0;i<50000;i++){
            variables[i]="s"+i;
        }
        long startTime0=System.nanoTime();
        for(int i=0;i<50000;i++){
            variables[i]="hello";
        }
        long endTime0=System.nanoTime();
        System.out.println("直接使用字符串："+(endTime0-startTime0)+"ms");
        long startTime1=System.nanoTime();
        for(int i=0;i<50000;i++){
            variables[i]=new String("hello");
        }
        long endTime1=System.nanoTime();
        System.out.println("直接使用字符串："+(endTime1-startTime1)+"ms");
    }
}
