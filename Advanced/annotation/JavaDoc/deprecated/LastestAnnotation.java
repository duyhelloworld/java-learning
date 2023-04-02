package deprecated;
@SuppressWarnings(value = "Provide lastest method to access DateTime")
public @interface LastestAnnotation {
    int getSeconds() default 0;

    String formatDDmmYYYY();
}
