/*
 * Đảm bảo số dấu phẩy động khi cross-platform luôn bảo toàn 
 * Áp dụng chỉ cho class, Interface và method
 * Đã xóa từ java 17
 */
// strictfp class Number{
//     float num;
// } 
public class Bai21_synchronized extends Thread {
    @Override
    public synchronized void run() {
        System.out.println("App running...");
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(), thread0 = new Thread();
        Bai21_synchronized thread2 = new Bai21_synchronized(), thread3 = new Bai21_synchronized();
        thread0.setName("Thread 0");
        thread0.setPriority(MAX_PRIORITY);
        thread0.start();
        thread1.setPriority(7);
        thread2.setPriority(8);
        thread2.start();
        thread3.setPriority(4);
        thread3.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Now is " + Thread.activeCount() + " thread in " + ThreadGroup.class.toGenericString());
    
    }

}
