package com.lagou.utils;

import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;


/*
日志管理工具类:
      所使工具:
         使用log4j日志框架进行日志的记录
         Logger Log4j进行日志输出的的类
   正常输出级别:
         * log.debug("debug"); // 对应debug输出级别
         * log.info("info"); // 对应info输出级别
         * log.warn("warn"); // 对应warn输出级别
         * log.error("error"); // 对应error输出级别
    异常输出类型:
 */
@Component("logPrintManager") //组件扫描
@Aspect  //升级为切面类
public class LogPrintManager {
    private Logger logger=Logger.getLogger(LogPrintManager.class);
    @Pointcut("execution(* com.lagou.service.Impl.AccountServiceImpl.accounttransfer(..))")
    public void log(){}
    @Before("LogPrintManager.log()")
    public void logPrint(JoinPoint joinPoint){
        System.out.println(joinPoint);
        //获取切面类名
        //获取目标对象
        Object target=joinPoint.getTarget();
        //由对象获取这个对象所在类的类名 getName()获取的包.类名的字符串getSimpleName()获取类名
        String className=target.getClass().getSimpleName();
        //获取方法名
        //得到正在执行的目标方法的签名（例：public int findUserById(int id)）
        String methodName=joinPoint.getSignature().getName();
        Object args[] =joinPoint.getArgs();
        logger.info("增加为："+className+"的"+methodName+",传递的参数"+ Arrays.asList(args));
    }
    //异常增强方法
    //指定异常(exception\SQLException
}

