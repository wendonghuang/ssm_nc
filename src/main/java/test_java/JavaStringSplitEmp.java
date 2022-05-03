package test_java;

public class JavaStringSplitEmp {//字符串分隔；
    public static void main(String[] args){


    String str="www-runoob-com";
    String[] temp;
    String delimeter="-";//指定分割字符
    temp=str.split(delimeter);
    for(int i=0;i<temp.length;i++){
        System.out.println(temp[i]);
        System.out.println("");
    }

}}
