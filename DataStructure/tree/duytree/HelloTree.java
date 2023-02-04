package tree.DuyTree;

import tree.Node;

public class HelloTree {
    public static void main(String[] args) {
        Node root = new Node(45);

        root.insertNode(root, 15);
        root.insertNode(root, 79);
        root.insertNode(root, 10);
        root.insertNode(root, 16);
        root.insertNode(root, 100);
        root.insertNode(root, 60);

        // System.out.println(root.size(root));
        // System.out.println(root.isExist(root, 15));
        // System.out.println(root.isExist(root, 0));
        
        root.inOrder(root);
    }
}
