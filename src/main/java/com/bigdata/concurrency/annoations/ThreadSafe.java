package com.bigdata.concurrency.annoations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解:标记线程【安全】的类
 * @author wzt
 * @date 2019/3/30 - 23:39
 */
@Target(ElementType.TYPE)   //注解作用的目标:对应一个类
@Retention(RetentionPolicy.SOURCE)  //注解作用的范围：Annotations are to be discarded(丢弃，忽略) by the compiler
public @interface ThreadSafe {
    String value() default "";
}
