package org.example.annotation.method;

import java.lang.annotation.*;

/**
 * параметри для методу додавання 2-х чисел
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface Math {
    int num1() default 0;
    int num2() default 0;
}
