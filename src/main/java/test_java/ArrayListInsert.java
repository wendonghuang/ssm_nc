package test_java;


import java.util.Arrays;

public class ArrayListInsert {//数组插入元素
    public  static void main(String args[]) {
        int array[] = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
        Arrays.sort(array);
        printArray("数组排序", array);
        int index = Arrays.binarySearch(array, 1);
        System.out.println("元素1所在的位置（附属为不存在）：" + index);
        int newIndex=-index-1;
        array=insertElement(array,1,newIndex);
        printArray("数组添加元素1",array);

    }
    private static void printArray(String message,int array[]){
        System.out.println(message+array.length);
        for(int i=0;i<array.length;i++){
            if(i!=0){
                System.out.print(",");
            }
            System.out.print(array[i]);
        }
    }
    private static int[] insertElement(int array[],int element,int index){
        int length=array.length;
        int destination[]=new int[length+1];
        System.arraycopy(array,0,destination,0,index);
        destination[index]=element;
        System.arraycopy(array,index,destination,index+1,length-index);
        return destination;
    }
}