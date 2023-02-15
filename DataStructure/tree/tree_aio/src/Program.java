public class Program {
    public static void main(String[] args) {
        // Node root = new Node(45);
        Tree tree = new Tree();
        tree.insertNode(tree.root, 48);
        tree.insertNode(tree.root, 50);
        tree.insertNode(tree.root, 32);
        tree.insertNode(tree.root, 14);
        tree.insertNode(tree.root, 41);
        tree.insertNode(tree.root, 45);
        tree.insertNode(tree.root, 10);
        tree.insertNode(tree.root, 40);
        tree.insertNode(tree.root, 38);
        tree.insertNode(tree.root, 34);
        tree.insertNode(tree.root, 36);

    // Display test 
        // System.out.println(tree.EldestNode(tree.root).value);
        // System.out.println(tree.EldestNode(tree.root).level);
        // System.out.println(tree.level);
        // tree.display();

    // Size
        System.out.println(tree.size());    

        // System.out.println(tree.contains(tree.root, 10));
        // System.out.println(tree.contains(tree.root, 0));

        // tree.insertRecursion(tree.root, 48);
        // tree.insertRecursion(tree.root, 50);
        // tree.insertRecursion(tree.root, 32);
        // tree.insertRecursion(tree.root, 14);
        // tree.insertRecursion(tree.root, 41);
        // tree.insertRecursion(tree.root, 45);
    }
}
