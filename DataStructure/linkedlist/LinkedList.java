package linkedlist;

/**
 * LinkedList
 */

public class LinkedList {
    private Node head;
    private Node tail;

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

    public void addToHead(Node node) {
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        }
        else {
            node.setNext(this.head);
            this.head = node;
       }
    }

    public void addToTail(Node node) {
        if (this.isEmpty()) {
            this.head = node;
            this.tail = node;
        } else {
            node.setNext(null);
            this.tail.setNext(node);
            this.tail = node;
        }
    }

    public int size() {
        int size = 1;
        Node node_index = this.head;
        if (this.isEmpty()) {
            return 0;
        } else {
            while (node_index.getNext() != null) {
                size++;
                node_index = node_index.getNext();
            }
            return size;
        }
    }

    public void display() {
        if (!this.isEmpty()) {
            Node node_ptr = this.head;
            while (node_ptr != null) {
                System.out.print(node_ptr.getData() + "\t");
                node_ptr = node_ptr.getNext();
            }
            System.out.println();
        } else {
            System.out.println("Empty");
        }
    }

    public boolean isNode(int data) {
        Node ptr = this.head;
        boolean found = false;
        while (ptr.getNext() != null) {
            if (ptr.getData() == data) {
                found = true;
            }
            ptr = ptr.getNext();
        }
        return found;
    }
    
    void remove(int data ) {
        if (this.isNode(data)) {
            Node target = Node.setNode(data);
            Node ptr = this.head;
            while (ptr.getNext() != null) {
                if (ptr.getNext().equals(target)) {
                    ptr.setNext(target.getNext());
                    target.setNext(null);
                    break;
                }
                ptr = ptr.getNext();
            }
        }
        else {
            System.out.println("Not found this node");
        }
    }

 
    public void remove(short index) {
        Node ptr = this.head;
        int i = 0;
        while (ptr.getNext() == null) {
            i++;
            if (i == index) {
                ptr.setNext(ptr.getNext().getNext());
            }
            ptr = ptr.getNext();
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