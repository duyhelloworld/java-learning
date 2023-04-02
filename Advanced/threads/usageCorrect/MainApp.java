package threads.usageCorrect;

public class MainApp {   
        public static void main(String[] args) {
            // Print some student by id


            // Thread1
            // Task1_1 task1_1 = new Task1_1();
            // task1_1.runTask();

            // // Thread2
            // for (int i = 0; i < 5; i++) {
            //     System.out.println("______ Task2 print #" + (i + 1));
            // }

            // // Not until Task1 OK, Task2 is executed.
            // // If task1 is long-duration --> main is pause() long --> task2 never executed
            
            





            // Solution 1 : extend Thread for task1_2 
            // Thread1
            // Task1_2 task1_2 = new Task1_2();
            // task1_2.start();

            // Thread2
            // for (int i = 0; i < 5; i++) {
            //     System.out.println("_____ Task2 print #" + (i + 1));
            // }

            // --> Task1_2 and Task2 is used by speed of OS. 
            // Sometime task1 is exed first, sometime task2

            // ++++>>>>> main and Task1_2 is parallel excuted



            // Solution 2 : use Runnable for task1_2
            // Thread1
            Runnable task1_2 = new Task1_2();
            Thread threadForTask1_2 = new Thread(task1_2);
            threadForTask1_2.start();
            // Thread2
            for (int i = 0; i < 5; i++) {
                System.out.println("_____ Task2 print #" + (i + 1));
            }
        }
    

        // Exercise
    
        // for (int i = 0; i < 15; i++) {
        // System.out.println("We have student #" + i+1);
        // }
        // // Wish "app shutdown" line will show when print all OK
}
