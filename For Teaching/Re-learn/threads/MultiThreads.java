package threads;

public class MultiThreads extends Thread {
    @Override
    public void run() {
        System.out.println("\nRunning...");
        System.out.println("ID : " + Thread.currentThread().getId());
        System.out.println("Name : " + Thread.currentThread().getName());
        System.out.println("Priority : " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(MAX_PRIORITY);
        System.out.println("State : " + Thread.State.values().toString() + "\t" + Thread.currentThread().getState());
    }

    public static void main(String[] args) throws InterruptedException {
        MultiThreads jvm1 = new MultiThreads();
        jvm1.start();

        MultiThreads jvm2 = new MultiThreads();
        jvm2.start();

        Thread.sleep(1000);
        // jvm.join(10);
        jvm1.setPriority(MAX_PRIORITY);
        jvm2.setPriority(MIN_PRIORITY);
    }
}