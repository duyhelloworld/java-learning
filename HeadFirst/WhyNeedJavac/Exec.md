
<pre>
<code>
public class Test {
    public static void main(String args) {
     int x = 0, y = 0;
     while(x < 5 ) {
        // ........
        System.out.println(x + "" + y + " ");
        x++;
     }   
    }
}
</code>
</pre>

|    Code |    Output  |
|----|----|
|y = x - y;|00 11 21 32 42|
|y = y + x;|00 11 23 36 410|
|y = y + 2;<br>if(y > 4) y = y - 1;|02 14 25 36 47|
