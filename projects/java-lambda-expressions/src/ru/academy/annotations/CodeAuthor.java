package ru.academy.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;

@Inherited
@Target({ ElementType.TYPE, ElementType.METHOD })
public @interface CodeAuthor {
    String firstName();
    int version() default 1;
    String editedAt() default "01.01.1970";
    String[] asisstants();
}
