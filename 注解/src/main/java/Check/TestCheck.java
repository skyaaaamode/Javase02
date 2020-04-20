package Check;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 简单的测试框架,主方法执行后，会自动检测所有的方法，加了注解的方法，自动生成测试报告
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestCheck {
}
