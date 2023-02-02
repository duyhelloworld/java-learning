public class Bai0_main {
    
    // static void main(String[] args) {
    //     System.out.println("Hello Baby");
    // }
    /*
     ! Error: Main method not found in class Bai0_main, please define the main method as:
     ! public static void main(String[] args) or a JavaFX application class must extend javafx.application.Application
     * Lỗi JRE ko truy cập đc vào main  đc -> báo lỗi ko tồn tại main 
     */
   
   
   
    // public void main(String[] args) {
        // System.out.println("Hello Baby");
    // }
    /*
     * Main is not static, please blah blah
     --> JRE chạy nhưng JVM ko load đc class nào --> nên để static
     */

    
    public static int main(String[] args) {
        System.out.println("Hello Baby");
        return 0;
    }
    /*
     ! Error: Main method must return a value of type void in class Bai0_main, please 
     ! define the main method as:
            public static void main(String[] args)
    
        - Nó bảo nó méo phải c++, c nên ngài đừng bỏ cú pháp bắt buộc thế. 
     */


    // public static void main(String[] args) {
    //     for (String str : args) {
    //         System.out.println(str);
    //     }
    // }
    // > Chạy lệnh như cái bài blog dưới ấy. Có thể thay thế cái này đc nhá
    
    // public static void main() {
    //      System.out.println("Deleted args");
    // }
    /*
     ! Error: Main method not found in class Bai0_main, please define the main method as:
                public static void main(String[] args)
     ! or a JavaFX application class must extend javafx.application.Application 
     */
    // --> Méo xóa cái String[] args đc nhá
    // -- Theo tìm hiểu thì cụ args là 1 đặc trưng của Java version 5, cho phép nhận nhiều giá trị vào 1 method
    // ---> Mảng có thể truyền thẳng vào hàm, khác C++

    // - Có thể thay String[] args thành String... args
    // public static void main(String... args) {
        // System.out.println("... do the rest");

        // ! NOT ... trong main. Cụ thể thì keyword : ELLIPSIS in java
        // String... newStr = new String();
    // }
    
    


    // + Usage of "String[] args"
    // https://www.scaler.com/topics/string-args-in-java/

    // public static void main(String... args) {
    //     System.out.println("String Arguments:");
    //     for(String i : args)
    //     {
    //         System.out.println(i);
    //     }
        
        // Run : javac Bai0_main.java && java Bai0_main Line1 Line2 100 ... // LineN "End Line, Nothing will be printed"
        // *** Special : javac Bai0_main.java && java Bai0_main /**/
        // Line, Nothing will be printed"
        // ---     /* */ = lệnh in folder trong / của Ubuntu
    // }    

    
// > More
    //  https://www.digitalocean.com/community/tutorials/public-static-void-main-string-args-java-main-method
}
