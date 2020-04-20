package Demo02;

import java.lang.annotation.*;

@Target(value={ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@Documented//注解被抽取到文档中
@Inherited//注解可被集成在子类中
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String name();
    int age() default 18;
    int[] k();
}
/**
 * 注解的本质就是一个继承Annotation接口
 */
