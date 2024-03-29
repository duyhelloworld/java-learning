/*
 * Linked List
 */

public class Node {
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
    
    public static Node setNode(int data) {
        Node node = new Node();
        node.setData(data);
        node.setNext(null);
        return node;
    }

    public boolean equal(Node node) {
        return this.getData() == node.getData();
    }
}
