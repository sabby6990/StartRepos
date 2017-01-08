package basicstuff;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented // indicates this should be documented by javadoc
@Target(ElementType.METHOD) // this annotation can only be applied in methods
@Inherited // indicates this annotation can be applied to the child classes also
@Retention(RetentionPolicy.RUNTIME) //recorded in class file and retained on runtime

public @interface MyCustomAnnotations {
	int myAge() default 18;

	String myName();
}
