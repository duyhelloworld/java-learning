/**
 * Main : DynamicBiding
 */

class Example{
    String name;
    int age;
}
class Student extends Example{
    String myClass;

    static void convert(Example ex){
        if (ex instanceof Student) {
            Student st = (Student)ex;
            // > DownCasting
            System.out.println(st + "Da downcasting");
        }
    }
}

public class ConvParToChi {

    // > Hiểu đơn giản : ko thể ghi đè (override) với các static binding (các method/properties static của class cha)

    // < InstanceOf -- Check Kiểu
    // --> null -> false
    public static void main(String[] args) {
        
        Example exam = new Example();
        // System.out.println(exam instanceof Example);
        // < Downcasting -- kiểu con tham chiếu tới instance của cha
        
        // < Downcasting directly
        // Student exam1 = new Example();

        // < Convert data Type - type casting
        // Student a = (Student)new Example();
        // -->  Dịch đc nhưng run lỗi ClassCastException
        // System.out.println(a);

        // < Dùng instanceof
        // exam.age = 100;
        // Student stu = new Student();
        // stu.convert(exam);
        // ! Wrong

        // + Right
        Example exc = new Student();
        Student.convert(exc);

        // https://vietjack.com/java/interface_trong_java.jsp
    }
}