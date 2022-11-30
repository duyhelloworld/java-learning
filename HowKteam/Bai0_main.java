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
    //     System.out.println("Hello Baby");
    // }
    /*
     * Main is not static, please blah blah
     --> JRE chạy nhưng JVM ko load đc class nào --> nên để static
     */

    
    // public static int main(String[] args) {
    //     System.out.println("Hello Baby");
    //     return 0;
    // }
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
    
    public static void main() {
            System.out.println("str");
    }
    /*
     ! Error: Main method not found in class Bai0_main, please define the main method as:
                public static void main(String[] args)
     ! or a JavaFX application class must extend javafx.application.Application 
     */
    // --> Méo xóa cái String[] args đc nhá
    
// > More
    //  https://www.digitalocean.com/community/tutorials/public-static-void-main-string-args-java-main-method
}
