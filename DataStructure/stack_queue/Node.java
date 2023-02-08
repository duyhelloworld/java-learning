public class Node <T> {
    private T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public Node() {
        
    }


    @Override
    public String toString() {
        return "{" +
            " data='" + getData() + "'" +
            "}";
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
