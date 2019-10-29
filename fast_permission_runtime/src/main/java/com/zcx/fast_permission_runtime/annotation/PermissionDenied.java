package com.zcx.fast_permission_runtime.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * author:  zhouchaoxiang
 * date:    2019/9/26
 * explain: When permission is denied and checked no longer reminded
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PermissionDenied {

    String value() default "";
}
