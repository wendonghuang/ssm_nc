package test_java;

public class SearchStringEmp {
    public static void main(String[] args){
        String strOrig="Google Runoob Taobao";
        int intIndex=strOrig.indexOf("Runoob");
        if(intIndex==-1){
            System.out.println("没有找到字符串Runoob");
        }else{
            System.out.println("Runoob的位置："+intIndex);
        }
    }
}
