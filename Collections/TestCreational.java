import java.util.*;

public class TestCreational {
    // List : interface 

    // * Cannot create object only List
    // * Use to access by index accurately. start from 0
    // * Allow duplicated E

    // List<Integer> list = new List<Integer>();
    // Method "of" use to make it constant

    List<Long> list1 = new LinkedList<>();
    // Use for add/remove
    List<Long> list2 = new Vector<>();
    // Thread Safe
    List<Long> list3 = new ArrayList<>();
    // size() can return value dynamically
    Vector<Long> stack = new Stack<>();

    // Vector > Stack
    // Stack<Long> vector = new Vector<>();
    Stack<Long> st = new Stack<>();

    // Queue : interface
    // Queue<Long> queue = new Deque<Long>();
    // Queue<Long> queue = new AbstractQueue<Long>();

    // Queue<Integer> queue = new Queue<Integer>();
    // AbstractQueue<Long> queue = new PriorityQueue<Long>();

    // Deque < Queue
    // public static void main(String[] args) {
    //     Queue<String> queue = new PriorityQueue<>();
    //     queue.add("Hello");
    //     System.out.println(queue.poll()); 
    //     System.out.println(queue.peek());

    // Poll = Pop
    // }

    // Deque<Long> queue = new ArrayDeque<Long>();

    // Set
    public static void main(String[] args) {
        Set<Integer> Hset = new HashSet<>();
        // Hashing to store unique element
        Set<Integer> Tset = new TreeSet<>();
        //  sorted ascending, unique element, hierarchy
        Set<Integer> LHset = new LinkedHashSet<>();
        // Hash table and implement LinkedList --> unordered, random element
        AbstractSet<Integer> Aset = new HashSet<Integer>();
        Aset.add(110);
        Aset.add(101);
        Aset.add(11);
        Aset.add(1);
        Aset.add(100);

        LHset.addAll(Aset);
        Hset.addAll(Aset);
        Tset.addAll(Aset);

        // Iterator<Integer> itr = Aset.iterator();
        // while (itr.hasNext()) {
        //     System.out.println(itr.next());
        // }

        System.out.println("Abtract Set :\t" + Aset.toString());
        System.out.println("Hash :\t" + Hset.toString());
        System.out.println("Tree :\t" + Tset.toString());
        System.out.println("LinkedHash :\t" + LHset.toString());
    }

    // Map 
    // https://stackoverflow.com/questions/2651819/why-doesnt-java-map-extend-collection
        
}