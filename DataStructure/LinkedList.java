/**
 * LinkedList
 */
class Node {
    private Node next;
    private int data;

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }
    
    
}



public class LinkedList {
    private Node head;
    private Node tail;
    
    public static Node setNode(int data) {
        Node node = new Node();
        node.setData(data);
        node.setNext(null);
        return node;
    }

    public void init() {
        this.head = null;
        this.tail = null;
    }
    public Boolean isEmpty() {
        if (this.head == null) {
            return true;
        }
        return false;
    }

    public void add(int data) {
        Node node = setNode(10);
        node.setData(data);
        node.setNext(node.getNext());
    }

    public void display() {
        if (!this.isEmpty()) {
            Node node_ptr = this.head;
            while (node_ptr != null) {
                System.out.println(node_ptr.getData() + "\t");
                node_ptr.setNext(node_ptr);
            }
        }
    }
 
    public Node getHead() {
        return this.head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return this.tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }
}