import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_USE)
@Documented
public @interface Author {
    long serial();
    String name();
    String dob();
    int age() default 18;

    String[] bookType();
}