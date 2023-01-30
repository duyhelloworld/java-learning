package threads;

public class MultiThreads extends Thread {
    @Override
    public void run() {
        System.out.println("Running...");
    }

    public static void main(String[] args) throws InterruptedException {
        MultiThreads jvm = new MultiThreads();

        
        jvm.join(10);
    }
}
