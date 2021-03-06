package nuc.txjg10.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: jurui
 * @Email: acescen@foxmail.com
 * @ProjectName: txjg10
 * @Package: nuc.txjg10.adapter
 * @Description:
 * @Date: Created in 14:53 2019-12-26
 */

@Target({ElementType.METHOD})// 可用在方法名上
@Retention(RetentionPolicy.RUNTIME)// 运行时有效
public @interface AddUser {
}
