package book.ch8.xmlaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class XmlAdvice {//切面
    public void before(JoinPoint joinPoint){//连接点
        System.out.println("前置通知");
        System.out.println("目标类"+joinPoint.getTarget());;
        System.out.println("目标方法"+joinPoint.getSignature().getName());



    }
    //返回通知
    public void afterReturn(JoinPoint joinPoint){
        System.out.println("目标方法"+joinPoint.getSignature().getName());

        System.out.println("返回shifangziyuan方法不出现异常会调用");
    }
    //环绕通知 ProceedingJoinPoint是JoinPoint的子接口
    public  Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("环绕通知开始");
       Object obj= proceedingJoinPoint.proceed();
        System.out.println("环绕通知结束");
        return obj;
    }
    //异常通知

    public void afterException(JoinPoint joinPoint,Throwable e){//连接点
        System.out.println("异常..."+e.getMessage());
    }

    // 最终通知
    public void after(){
        System.out.println("shifangziyuan");
    }
    //

}
