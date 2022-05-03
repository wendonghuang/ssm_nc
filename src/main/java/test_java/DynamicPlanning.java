package test_java;

import org.junit.Test;

public class DynamicPlanning {
    //给定一个字符串s和一个字符串t，计算在s的子序列中t出现的个数。
    public Integer dp(String s,String t){
        int sLength=s.length();
        int tLength=t.length();
        int[][] dp=new int[sLength+1][tLength+1];
        //初始化
        for(int j=0;j<=tLength;j++){

            dp[0][j]=1;

        }
        for(int i=1;i<=sLength;i++)
            for(int j=1;j<=tLength;j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+dp[i][j-1];
                }else{
                    dp[i][j]=dp[i][j-1];
                }
        }
        return dp[sLength][tLength];
    }
    @Test
    public void t1(){
        String s="d";
        String t="ds";
        System.out.println(dp(s,t));
    }
}
