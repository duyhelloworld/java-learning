import java.util.Date;
// > dùng lib có sẵn trong java
import java.util.Calendar;
// > hoặc dùng đồ mới trong bản java5 

import java.util.Random;
// > generate number auto
import java.util.TimeZone;

public class Bai22_getDateTime {
    
    public static void main(String[] args) {
        
        Date date = new Date();
        // System.out.println(date.toString());

        // > Phương thức sẵn của Date
        // + after() : check chậm ngày
        // + clone()
        // + compareTo(Date date) : - 0 +
        // + equals(Date date)
        // + getTime() : milisecond from  1/1/1970
        // + setTime() : 
        // + toString()
        
        // > Calendar là abtract class
        // Calendar current = new Calendar();
        Calendar current = Calendar.getInstance();
        // System.out.println(current);

        // TimeZone zone = TimeZone.getDefault();
        // System.out.println(zone);

        // > Cách lấy các đơn vị mình cần
        int year = current.get(Calendar.YEAR);
        // System.out.println(year);
        
        // > test
        int milisecond = current.get(Calendar.MILLISECOND);
        Random rand = new Random();
        rand.nextInt(milisecond);
        // System.out.println(milisecond);

        // > Set range
            // - for Math.random : return 0 -> 1
            int byMath = (int)Math.random();
            // ! Wrong code  
            double byMathD = Math.random();
            System.out.println(byMathD);

            // + Now, we set 1 - 10
            int numRand = (int)(Math.random()* (10 - 1) + 1);
            System.out.println(numRand);

            // - for Random
            Random random = new Random();
            int randInt = (int)(random.nextInt(10 - 1) + 1);
            System.out.println(randInt);
            
        // > seed = time
        int result = 1, sec = current.get(Calendar.SECOND);
        Random srand = new Random();
        result = srand.nextInt(sec);
        // System.out.println(result);

    }
}
