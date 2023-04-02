package threads;

/**
 * @author DuyPham
 * 
 *         States :
 * 
 *         --> New
 *         --> Runnable
 *         --> Running
 *         --> Waiting
 *         --> Time_Waiting
 *         --> Blocked
 *         --> Terminated
 * 
 * 
 *         TLC (Thread Life Cycle)
 *         _____New :
 *         Khởi tạo 1 Object mới, mở đầu 1 life cycle. Nó sẽ ở đây đến khi nào
 *         chương trình gọi start()
 *         _____Runnable :
 *         Đã gọi start(). Lúc này đã có thể chạy.
 *         _____Running :
 *         Chạy hàm run().
 *         _____Waiting :
 *         Gọi từ Running về Runnable. Hàm wait có sẵn, truyền vào timewait là
 *         đc.
 *         _____Terminated :
 *         Đóng thread
 * 
 * 
 * 
 *         VD : Nghe "Waiting For You"
 * 
 *         1. Bật app (Soundcloud)
 *         --> Bắt đầu 1 process.
 * 
 *         2. Mở nhạc tới bài W4U --> app gọi đến DB, trả về dữ liệu bài, trong
 *         lúc đò FE lo phần hiển thị loading
 * 
 *         3. Load đc bài đó --> Hiện menu đĩa nhạc + các chức năng chính, nút
 *         play có thể bấm bây h.
 *         --> Thread "nghe nhạc" ở trạng thái Runnable
 * 
 *         4. Khi click play --> Nghe đc nhạc
 *         ---> Thread ở Running
 * 
 *         5. Khi ấn pause / muốn dki tài khoản --> dừng phát nhạc.
 *         ---> Thread ở Waiting.
 *         Có thể Waiting vô thời hạn nếu App đc cho quyền, hoặc set thời gian
 *         giới hạn cho đến khi máy quá nặng RAM
 * 
 *         6. Khi người dùng chuyển App/tắt APP/ sang trang signup...
 *         Phải tắt nhạc hoàn toàn --> Đóng thread nghe nhạc này , lưu thông tin
 *         bài nhạc hiện tại + số phút đã nghe bài nhạc.
 *         ---> Thread vào Terminated
 * 
 */

public class EasyUnderstand extends Thread {
    @Override
    public void run() {
        System.out.println("Running");
    }

    // @Override
    // public void wait() throws InterruptedException {
    //     System.out.println("Waiting");
    // }

    public static void main(String[] args) {
        EasyUnderstand thread1 = new EasyUnderstand();
        thread1.start();

        // Xem states : System.out.println(Thread.State);

        // -- Tạo APp download file 
    }    
}
