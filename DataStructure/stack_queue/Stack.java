/**
 * @param <T> : Stack type by generic
 */
public class Stack<T> {
    Node<T> head = new Node<T>(null);
    int length;

    public Stack() {
        this.head = null;
        this.length = 0;
    }

    void push(Node<T> node) {
        if (this.head == null) {
            head = node;
            head.next = node;
        } else {
            node.next = head;
            this.head = node;
            this.length++;
        }
    }

    void display() {
        if (this.head == null) {
            System.out.println("Empty");
            return;
        }
        Node<T> tmp = this.head;
        // while (tmp.next != null) {
        //     System.out.println(tmp.getData());
        //     tmp = tmp.next;
        // }
        for (int i = 0; i < this.length; i++) {
            System.out.println(tmp.getData() + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        // st.display();
        Node<String> node = new Node<>(null);
        node.setData("Haloo");
        st.push(new Node<String>("Hello"));
        st.display();
        st.push(node);
        st.display();
    }

}
