/* 
 * LinkedList
 */

public class LinkedList {
    private Node head;
    private Node tail;

    public void init() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        }
        return false;
    }

    public void addToHead(Node node) {
        if (this.isEmpty()) {
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
        Node curr = this.head;
        if (this.isEmpty()) {
            return 0;
        } else {
            while (curr.getNext() != null) {
                size++;
                curr = curr.getNext();
            }
            return size;
        }
    }

    public void display() {
        if (!this.isEmpty()) {
            Node curr = this.head;
            while (curr != null) {
                System.out.print(curr.getData() + "\t");
                curr = curr.getNext();
            }
            System.out.println();
        } else {
            System.out.println("Empty");
        }
    }

    public boolean contains(int data) {
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
    
    void remove(int data) {
        if (this.contains(data)) {
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

 
    public int indexOf(Node node) {
        Node ptr = this.head;
        int i = 0;
        while (ptr.getNext() != null) {
            if (ptr.equal(node) || ptr.getNext() == null) {
                return i;
            }
            i++;
            ptr = ptr.getNext();
        }
        return 0;
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