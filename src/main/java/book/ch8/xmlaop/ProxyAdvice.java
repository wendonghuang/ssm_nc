package book.ch8.xmlaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class ProxyAdvice {

    @Pointcut("execution(* book.ch8.xmlaop.*.*(..))")
    private void pointcut(){

    }
    @Before("pointcut()")
    public void before(JoinPoint joinPoint){//连接点
        System.out.println("前置通知");
        System.out.println("目标类"+joinPoint.getTarget());;
        System.out.println("目标方法"+joinPoint.getSignature().getName());
    }
    @AfterReturning(value="pointcut()",returning="valuereturn")
    public void afterReturn(JoinPoint joinPoint,Object valuereturn){
        System.out.println("目标方法"+joinPoint.getSignature().getName());

        System.out.println("返回shifangziyuan方法不出现异常会调用");
    }
    @Around("pointcut()")
    public  Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("环绕通知开始");
        Object obj= proceedingJoinPoint.proceed();
        System.out.println("环绕通知结束");
        return obj;
    }

    @AfterThrowing(value="pointcut()",throwing="e")
    public void afterException(JoinPoint joinPoint,Throwable e){//连接点
        System.out.println("异常..."+e.getMessage());
    }
    @After(value="pointcut()")
    // 最终通知
    public void after(){
        System.out.println("shifangziyuan");
    }



}
