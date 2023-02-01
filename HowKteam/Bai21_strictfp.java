/*
 * Đảm bảo số dấu phẩy động khi cross-platform luôn bảo toàn 
 * Áp dụng chỉ cho class, Interface và method
 * Đã xóa từ java 17
 */
strictfp class Number{
    float num;
} 
public class Bai21_strictfp {
    Number num = new Number();
}
