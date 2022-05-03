package test_java;

import org.junit.Test;


public class test_1 {
    public test_1() {
    }
    public static void main(String[] args){
    String str="Hello World";
    String anotherString="hello world";
    Object objStr=str;
    System.out.println(str.compareTo(anotherString));
    System.out.println(str.compareToIgnoreCase(anotherString));//忽略大小写
    System.out.println(str.compareTo(objStr.toString()));}
}
