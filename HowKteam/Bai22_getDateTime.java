import java.util.Date;
import java.util.Formatter;
import java.util.Locale;
// > dùng lib có sẵn trong java. Phần lớn phương thức đã cũ
import java.util.Calendar;
// > hoặc dùng đồ mới trong bản java5

import java.util.Random;
// > generate number auto
import java.util.TimeZone;

public class Bai22_getDateTime {
    
    public static void main(String[] args) {
        
        Date date = new Date();
        System.out.println("Time by date : " + date.toString() + "\nTime by number : " + date.getTime());

        // > Phương thức sẵn của Date
        // + after() : check chậm ngày
        // + clone()
        // + compareTo(Date date) : - 0 +
        // + equals(Date date)
        // + getTime() : milisecond from  1/1/1970
        // + setTime() : 
        // + toString()
        

        // > Dùng Calendar
        // > Calendar là abtract class
        // !!! Calendar current = new Calendar(); 
        Calendar current = Calendar.getInstance();
        // System.out.println(current);

        TimeZone zone = TimeZone.getDefault();
        System.out.println("TimeZone : " + zone.getDisplayName() + "\n\tOptions : " + zone);

        // > Cách lấy các đơn vị mình cần
        int year = current.get(Calendar.YEAR);
        System.out.println("Year : " + year);

        Calendar birthday = Calendar.getInstance(Locale("vi", "Viet Nam"));
        birthday.clear();

        // birthday.setFirstDayOfWeek(2);
        // birthday.setMinimalDaysInFirstWeek(7);
        
        birthday.set(2003, 12, 9);
        birthday.set(Calendar.YEAR, 2003);
        birthday.set(Calendar.MONTH, Calendar.DECEMBER);
        birthday.set(Calendar.DATE, 9);
        birthday.set(Calendar.DAY_OF_WEEK, 7);
        birthday.set(Calendar.DAY_OF_YEAR, 365);
        

        System.out.println("My birthday : " + birthday.getTime() + "\t" + birthday.get(0) + "\t" + birthday.get(1) + "\t" + +birthday
                .get(2) + "\t" + birthday.get(3) + "\t" + birthday.get(4) + "\t" + birthday.get(5));
        
        
        System.out.println("Distance from my birthday to now : ");

        // TimeZone utc = TimeZone.getTimeZone("UTC");
        // birthday.setTimeZone(utc);
        // > test
        int milisecond = current.get(Calendar.MILLISECOND);
        Random rand = new Random();
        rand.nextInt(milisecond);
        // System.out.println(milisecond);

        // > Set range
            // - for Math.random : return 0 -> 1
            // int byMath = (int)Math.random();

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
        System.out.println(result);

    }
}
