package fortree.duycode;

public class App {
    public static void main(String[] args) {
        int[] source = { 5, 7, 1, 8, 6, 9, 4, 2, 3 };
        HeapTree tree = new HeapTree(source);
        tree.print();
        tree.sort(tree.heaptree);
        tree.print();
    }
}
