class SinhVat{
    private String name;
    private String species;
    private int age;

    public SinhVat(String name, String species, int age){
        this.age = age;
        this.name = name;
        this.species = species;
    }

    public void show(){
        System.out.println("Name : " + this.name );
        System.out.println("Species : " + this.species );
        System.out.println("Age : " + this.age );
    }
}

// ! Overriding - định nghĩa con mới hơn cha, phương thức to khỏe hơn cha nó
// Dòng show ở dươi là 1 overRiding 
class LinhTruong extends SinhVat{
    private String branch;

    public LinhTruong(String name, String species, int age, String branch){
        super(name, species, age);
        this.branch = branch;
    }
// @Override  // < @ chỉ làm tag thui :)
    public void show(){
        // > show() ở đây giống cha nó ở trên, nhưng có thể sửa phá --> Lợi và hại đều có
        // < Nếu Object của LinhTruong gọi show(), luôn gọi LinhTruong.show() ko phải SinhVat.show()
        super.show();
        System.out.println("Branch : " + this.branch);

        // ->  Chống overriding bằng gắn hằng (final) cho các phương thức bạn muốn bảo vệ
        // ở SinhVat sửa show() thành 
        // public final void show(){ ... }; 
    }
}

// ! OverLoading
// ! Class này 0 liên quan 2 cái class trên

class tinhDiem{
    private String tenSV;
    private int diem;
    private String maSo;

    // > Overloading là nhều phương thức giống nhau, khác mỗi kiểu data truyền vào
    // -> Tạo ra sự an toàn khi khởi tạo object với nhiều kiểu data đều nhận đc
    public void setMark(int diem){
        if (diem >= 0 && diem <= 10) {
            this.diem = diem;
        }
    }

    public void setMark(float diem){
        if (diem >= 0 && diem <= 10) {
            this.diem = (int)diem;
        }
    }

    public void setMark(byte diem){
        if (diem >= 0 && diem <= 10) {
            this.diem = (int)diem;
        }
    }
}

public class Bai16_overRiding_overLoadng {

    public static void main(String[] args) {
        
    }
}
