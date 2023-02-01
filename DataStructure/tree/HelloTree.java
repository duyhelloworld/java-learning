// package tree;

public class HelloTree {
    public static void main(String[] args) {
        Node root = new Node(45);

        root.insertNode(root, 15);
        root.insertNode(root, 79);
        root.insertNode(root, 10);

        root.display(root);
    }
}
