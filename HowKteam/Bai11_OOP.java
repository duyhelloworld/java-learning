// package HowKteam;
/*
 * OOP là 1 phong cách code. - Object Oriented Programming
 * Có thể code theo hướng thủ tục(C++, C), hướng hàm(Java) nhưng sẽ gặp các bất lợi :
    - Gặp vấn đề khi đặt tên biến, hàm với quy mô lớn
    - Collab nhiều nguời cùng làm việc chọn quy tác đặt càng khó
--> Ra đời OOP

 * Các khái niệm :
     * Đối tượng : anh "Nguyễn Văn A", chó của nhà Luffy, ... --> cụ thể, đặc trưng và mang dữ liệu phản ánh chính nó (tên, tuổi, số chân , loài  ....)
    
     * Lớp : xây từ điểm chung nhiều đối tượng : lớp ConNguoi, lớp DogHouse, ... --> Khái quát. Lập trình sẽ từ đối tượng cần xử lí mà ra cái này
     
     * Mỗi đối tượng sẽ có các "cháu" dưới nó :
            - Thuộc tính : những cái mà đối tượng có, kiểu thông tin nghe phát biết nuôn thằng nào ấy
            - Phương thức : những cái mà đặc trưng riêng từng cái, tùy đối tượng sẽ có cái ít cái nhiều
            < VD > :
            - Lớp ConNguoi xây từ các THUỘC TÍNH 'tĩnh' mà 'nghe phát biết luôn là con người' : tên, tuổi, địa chỉ, cơ quan, số đt ...
                                    - Còn  các phương thức là hoạt động của con người, vd : diBo(), chay() có thể áp dụng cho đa số mà ko dùng cho què, cụt đc
                                                                                        hay trong anUong() thì sẽ anIt() như mình và anNhieuNhuLon() như bạn chẳng hạn.
        
    * Hướng đối tượng làm java đặc biệt , vì Java là thuần tuý OOP. 
    ! C++, Python có OOP nhưng chỉ là 'hỗ trợ', nên tính OOP của nó ko mạnh

 */

/**
 * Cars
 */
class Cars {
    String name;
    String label;
    int exportInYear;

    public String getName() {
        return name.toUpperCase();
    }
    // ? Tại sao phải lấy tên kiểu này ?
    // - chống kẻ khác truy cập, chỉnh sửa name gốc. cái name trên nếu để privated thì từ main ko truy cập mà sửa nó nổi nữa
    // > Grabber - tính đóng gói của OOP

    public Cars(String name, String label, int exportInYear){
        this.name = name;
        this.label = label;
        this.exportInYear = exportInYear;
        // https://youtu.be/j_zeaTrH0cU?t=614
    }

    



}
public class Bai11_OOP {
    
}
