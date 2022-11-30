// package W3_School;

public class Strings_Type {
    
    public static void main(String[] args) {
    // > Tất cả method phổ biến
// > Not change the source string
    String str = "   Helo ban nho, lau_roi minh    ";
        
    // * indexOf() - trả về int
        // System.out.println(str.indexOf("_"));
        // < Tra vị trí đầu tiên xuất hiện 1 dãy nào đó
        // System.out.println(str.indexOf("_", 22));
        // < Tra từ vị trí đứng sau (Cho phép âm)
            // - Check đơn giản = bôi cái đấy, nhìn status bar của VS

    // * charAt() - trả về 1 kí tự char
        // < str.charAt(i) giống str[i] của C++
        // System.out.println(str.charAt(4));

        // < char() trả về vị trí luồng của nó
        // System.out.println(str.chars());

    // * codePoint_*() - trả về 1 số int 
        // < str.codePointAt() -- mã Unicode tại vị trí nào đó
        // System.out.println(str.codePointAt(14));

        // < str.codePointBefore -- giống cái trên, index -1. cấm khi index = 0
        // System.out.println(str.codePointBefore(15));

        // < str.codePointCount() -- trả về số kí tự thuộc mã unicode trong 1 string nhỏ
        // System.out.println(str.codePointCount(0, str.length()));  // 0, 0;    -1,  4

    // * compareTo() - return 1 số int
        // < số kí tự khác nhau . case sensitive ko ý nghĩa
        System.out.println(str.compareTo("Helo")); // "", ", "helo", "Helo"

        System.out.println(str.compareToIgnoreCase("Helo"));

        // < tương tự, thay thế đc : contains(str) - true/false khi check 1 cái chứa cái kia
        
    // * str1.concat(str2) = str1 + str2


    // * 
    }
}
