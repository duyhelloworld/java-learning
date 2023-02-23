// import deprecated.DeprecatedAnnotation;

public class App {
    public static void main(String[] args) {
        @Author(age = 10, bookType = {"romance", "comedy", "romcom"}, name = "Pham Duy", dob = "2003/12/09", serial = 1)
        final String user1 = "duyhelloworld";
        System.out.println(user1);
        

        // Should not use
        // @DeprecatedAnnotation(getTime = 10)

        // Remove suppress  warning
        // @SuppressWarnings("deprecation")
        // @DeprecatedAnnotation(getTime = 10)
        // String time;

        // @LastestAnnotation(formatDDmmYYYY = "12/08/1992", getSeconds = 100)
        // String time;
    }  
}
