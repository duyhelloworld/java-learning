public class Bai18_interface {
    
    /* 
     * Interface (đối với các ngôn ngữ OOP khác thì nó là đa kế thừa)
     * Nếu nắm cứng về kế thừa & trừu trượng thì mới nên học Interface
     * 
     * Đây là cách để 'kế thừa' abstract method của interface đó
     * 
     * Kiểu như java thấy lớp kế thừa thiếu thiếu "ngừoi phụ nữ" quá, để kế thừa Batman thì tội
     --> đẻ ra cái này để thay thế cho việc kế thừa nhiều cái. hình dưới là hiểu
      */

/** Ko Interface : 
 *              ConNguoi
 *              /       \
 *             /         \
 *         PhuHuynh     HocSinh
 */

 /** Interface : 
 *              ConNguoi            HocHanh (Interface)
 *              /       \          /
 *             /         \        /
 *         PhuHuynh       HocSinh
 */
// > Nhớ, thực ra từ HocSinh thực tế ko hề kế thừa từ HocHanh, nó chỉ 'giả như' đang buliem từ Interface HocHanh thôi
// > Kiểu như HocSinh chưa hẳn lúc nào cũng phải buliem từ học hành

// < Syntax
    // class HocSinh extends ConNguoi implements HocHanh

// - Có thể implement nhiều Interface thỏa thích
    // class HocSinh extends ConNguoi implements HocHanh, ChoiTheThao, Ngu, NguVaAn                             (Ngủ, ngủ và ăn, nghĩ gì z)

// - Nên cẩn thận phạm vi truy cập có thể ảnh hưởng.





/*
* Cụ thể hơn : Cần phân biệt abtract class và Interface
https://viettuts.vn/java/su-khac-nhau-giua-abstract-class-va-interface
*/
}
