/*
 * Tính trừu trượng muốn đầy đủ nên xem full clip : https://youtu.be/9jlUoO3e2GY

 * Nó ko quá khó, cũng ko thực tế, nhưng luôn đc vác ra để phỏng vấn, đòng thời làm cleamer code
 * Giới thiệu Clean Code (Viết code sạch, ví dụ = java, của Uncle Bob, 1 trong thất "Kinh thánh" giới cốt đơ ạ

 ! https://cuongquach.com/ebook-clean-code-pdf-download-free.html

 < Trừu trượng trong Java 
 --> Dùng từ khóa abstract đặt sau phạm vi truy cập

 > Với class : 
        -  Class trừu trựong : chỉ dùng để cho các class khác kế thừa lại, 0 thể tạo instance(Object) mới
            * (Việt hóa ra là cha nhưng chỉ để đẻ ra các con chứ ko thể tự tạo ra cái gì cho mình ---> Đàn ông thật tuyệt vời :)) )
            >> VD : đồ án 1 trường đại học cần có : giảng viên, sinh viên, bảo vệ, lao công ... họ đều là con người
            --> class trừu trượng trong đó là con người, các con kế thừa lại là giangVien, baoVe, sinhVien, ...
            --> khởi tạo sẽ ko thể khởi tạo 1 conNguoi mới, ko cụ thể mà chỉ khởi tạo qua các con đc

        - Phương thức trừu trượng : khởi tạo rỗng, méo biết cách gọi luôn, cái abstract nó đòi ở class nên class ko gọi -> ko thử method đc
  */
// > Class bình thường
// class ConNguoi{
//     public String name;

//     public void showInfo(){
//         System.out.println(this.name);
//     }
//     public ConNguoi clone(){
//         ConNguoi other = new ConNguoi();
//         return other;
//     }
// }

// > Class trừu trượng
// abstract class ConNguoi{
//     public String name;

//     public void showInfo(){
//         System.out.println(this.name);
//     }

// }


// > Phương thức trừu trượng
// * Luôn đặt trong class trừu trượng, báo lỗi nếu có body.

abstract class ConNguoi{
    public String name;

    // > Nuột --> Lỗi
    // public abstract void showInfo(){
    //     System.out.println(this.name);
    // }

    public abstract void showInfo();
    // > Nhẵn -> nhận true :)

}

// > Class kế thừa
class giangVien extends ConNguoi{
    String chucVu = "giang vien";

    public void showInfo(){
    // ! Đối với pthuc trừu trượng
        
        // > Méo kế thừa kiểu này đc
        // super.showInfo();

        // > Lại tự build từ đầu
        System.out.println("Tên Ngài : " + this.name);
    }
}


public class Bai17_abtraction {
    
    public static void main(String[] args) {
        // ConNguoi a = new ConNguoi();
        // ! Lỗi khi class ConNguoi là abstract

    }
}
