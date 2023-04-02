import java.util.Scanner;
public class Bai15_setter_getter {
    
    public static void main(String[] args)
      {
        Scanner scan = new Scanner(System.in);

        /*
         * Bình thường, hàm khởi tạo sẽ nhận giá trị ko qua chọn lọc
         * VD : private int age thì ta phải xét tuổi trong khoảng của người, ko để âm hay quá tuổi MAX
         !  Nhưng constructor nói dell, xét đk trong constructor hóa bằng thừa vì nó luôn gán cho thuộc tính, ko có tác dụng yêu cầu user nhập lại --> hỏng private
         
         --> Chỉ còn cách xét ở phương thức lập ra 
         * Quy ước ở đây là hàm public, chữ đầu là set + value
         * nhìn class dứoi để cụ thể. Chạy thì vác ra file khác chạy
         */
        class Student {

            private String name;
            private int age;
            private String soDT;

            public Student() {
            };

            // > Setter
            public void setAge(int age) {
                if (0 < age && 100 >= age) {
                    this.age = age;
                }
            }

            public void setName(String name) {
                this.name = name;
            }

            public boolean setSoDT(String soDT) {
                if (soDT.length() <= 10) {
                    return false;
                } else {
                    int numb = Integer.parseInt(soDT);
                    if (numb > 0 && numb <= 999999999) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }

            public void setScanNum() {
                System.out.println("Nhap SDT : ");
                String soDT = scan.nextLine();
                while (!setSoDT(soDT)) {
                    System.out.println("Nhap lai SDT : ");
                    soDT = scan.nextLine();
                }
                this.soDT = soDT;
            }

            // > Getter
            // public int getAge(){
            //     return this.age;
            // }
            // public String getName(){
            //     return this.name;
            // }
            public String getNumberPhone() {
                return this.soDT;
            }
        }

        // < Code áp dụng

        Student hocSinhA = new Student();
        hocSinhA.setName("Pham Duy");
        hocSinhA.setAge(19);
        hocSinhA.setScanNum();
        hocSinhA.getNumberPhone();

    }
    
    // > Các vấn đề của setter, getter
    // * Để mất rieng tư giá trị của private khi dùng với mảng
    class Arr{
    //     private int[] arr;

    //     public void setArray(int[] arr){
    //         this.arr = arr;
    //     }

    //     public void showArray(){
    //         for (int i : arr) {
    //             System.out.println(i);
    //         }
    //         System.out.println();
    //     }
    // }
    // Arr arrI = new Arr();
    // int[] arr = {0, 2, 35, 40};
    // arrI.setArray(arr);
    // arrI.showArray();
    // arr[0] = 3;
    // arrI.showArray();
    
    // ! biến private vẫn bị phá - mảng là kiểu tham chiếu
    // > setter, getter vô dụng ở đây vì truy cập, sửa biến qua thuộc tính luôn r, ko còn qua setter getter nữa

    // < Giải pháp >
    // > Dùng pthuc clone() của java tạo bộ nhớ khác, copy giá trị vào
    /* Hay code trên sửa thành 
     * class Arr{
    private int[] arr;
    public void setArray(int[] arr){
    this.arr = arr.clone();
    }
    public void showArray(){
    for (int i : this.arr) {
        System.out.println(i);
    }
    System.out.println();
    }
    }
    Arr arrI = new Arr();
    int[] arr = {0, 2, 35, 40};
    arrI.setArray(arr);
    arrI.showArray();
    arr[0] = 3;
    arrI.showArray();
    
    
    > Riêng vs String, nó như kiểu data nguyên thủy -> 0 cần clone()
    
    ! Có thể tự build clone() cho class :
    - Thêm vào class 1 phương thức sau :
    public <class_name> clone(){
        return new <class_name>(this.pthuc1, this.pthuc2, ... );
    }
    */

    }
}