public class HelloTree {
    // public static void preOrder(Node root) {
    //     if (root != null) {
    //         System.out.print(root.data + "\t");
    //         preOrder(root.left);
    //         preOrder(root.right);
    //     }
    // }
    public static void main(String[] args) {
        // Node root = new Node(45);

        // root.insertNode(root, 15);
        // root.insertNode(root, 79);
        // root.insertNode(root, 10);
        // root.insertNode(root, 16);
        // root.insertNode(root, 100);
        // root.insertNode(root, 60);

        // System.out.println(root.size(root));
        // System.out.println(root.isExist(root, 15));
        // System.out.println(root.isExist(root, 0));
        
        // root.inOrder(root);

        Node root = new Node(6);

        root.insertNode(root, 4);
        root.insertNode(root, 8);
        root.insertNode(root, 3);
        root.insertNode(root, 5);
        root.insertNode(root, 7);
        root.insertNode(root, 9);
        root.preOrder(root);
        root.delNode(root, 1);
        root.preOrder(root);
    }
}
