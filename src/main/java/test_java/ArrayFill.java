package test_java;

import java.util.Arrays;

public class ArrayFill {//数组填充
    public static void main(String aegs[]){
        int array[]=new int[6];
        Arrays.fill(array,100);
        for(int i=0,n=array.length;i<n;i++){
            System.out.println(array[i]);
        }
        System.out.println();
        Arrays.fill(array,3,6,50);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
