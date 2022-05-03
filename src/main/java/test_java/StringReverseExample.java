package test_java;

public class StringReverseExample {
    public static void main(String[] args){
        String string="runoob";
        String reverse=new StringBuffer(string).reverse().toString();
        System.out.println(string+reverse);
    }
}
