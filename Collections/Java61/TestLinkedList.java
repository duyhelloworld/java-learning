import java.util.LinkedList;
// import java.util.List;

public class TestLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(7);
        // System.out.println(list.size());
        // System.out.println(list.iterator().next());

        // list.remove(0);
        // System.out.println(list.listIterator().hasPrevious());

        list.addFirst(10);
        list.addLast(102);

        while (list.iterator().hasNext()) {
            System.out.println("Cur : " + list.getFirst());
            list.removeFirst();
        }

    }    
}
