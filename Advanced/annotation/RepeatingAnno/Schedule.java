package annotation.RepeatingAnno;

import java.lang.annotation.Repeatable;

/**
 * @implSpec Set a time to alway run doCleanup() on the last day of month and every Friday at 13h
 */
@Repeatable(Schedules.class)
public @interface Schedule {
    String dayOfMonth() default "first";
    String dateOfWeek() default "Mon";
    int hour() default 0;
}
