public class Program {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add( 48);
        tree.add( 50);
        tree.add( 32);
        tree.add( 14);
        tree.add( 42);
        tree.add( 45);
        tree.add( 10);
        tree.add( 40);
        tree.add( 38);
        tree.add( 41);
        tree.add(21);
        tree.add(39);
        tree.add(44);
        // System.out.println(tree.level());
        // tree.display();
        // System.out.println(tree.size());    
        // System.out.println(tree.contains(tree.root, 10));
        
        // System.out.println(tree.remove(10));

        // System.out.println(tree.remove(38));
        System.out.println(tree.remove(45));

        // System.out.println(tree.remove(42));
        tree.display();
        // tree.root.preOrder(tree.root);
    }
}
