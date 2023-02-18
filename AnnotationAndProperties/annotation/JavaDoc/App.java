public class App {
    public static void main(String[] args) {
        @Author(age = 10, bookType = {"romance", "comedy", "romcom"}, name = "Pham Duy", dob = "2003/12/09", serial = 1) String authorString;
        final String duy = "duyhelloworld";
        System.out.println(duy);

        // Should not use
        // @DeprecatedAnnotation(getTime = 10)
        // String time;

        


    }  
}
