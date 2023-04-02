class Employee{
    String name;
    public String getName(){
        return this.name;
    }
}

public class Bai20_Object {
    
    public static void main(String[] args) throws InterruptedException {
        
        // > Lớp Object là parent của all lớp trong java - như kiểu root ấy
        // < là cha của các cha, đúng ra code khi gọi mọi class sẽ là 
            // class Students extends Object { ... }
        // < Nhưng vì java cho phép rút gọn --> bỏ cú pháp kế thừa này đc

        // > Gọi khi muốn chung chung xem đối tượng nào đc trả về, có kiểu Employ, Student hay ..., hoặc là 0 gì cả
        // Object some = getName();

        // > Cái này chủ yếu so sánh trong luồng và quản lí tiến trình

        // < Nhân tiện học về throws
        Thread.sleep(3000);
        // ! Lỗi nếu 0 có throw

        System.out.println("Hello Geeks");

        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',  
                'i', 'n', 'a', 't', 'e', 'd' };  
        char[] copyTo = new char[7];  
  
        System.arraycopy(copyFrom, 2, copyTo, 1, 7);  
        System.out.println(new String(copyTo)); 
    }
}
