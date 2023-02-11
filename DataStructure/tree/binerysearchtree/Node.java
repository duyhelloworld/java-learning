package binarysearchtree;

public class Node {
    int value;
    Node left, right;

    public static Node newNode(int value) {
        Node node = new Node(value);
        return node;
    }

    public Node(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Node)) {
            return false;
        }
        Node node = (Node) o;
        return value == node.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, left, right);
    }

    @Override
    public String toString() {
        return "{" +
            " value='" + getvalue() + "'" + "}";
    }


}