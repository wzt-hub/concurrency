package com.bigdata.concurrency.annoations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 标记线程【不推荐】使用的类
 * @author wzt
 * @date 2019/3/30 - 23:49
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface NotRecommend {
    String value() default "";
}
