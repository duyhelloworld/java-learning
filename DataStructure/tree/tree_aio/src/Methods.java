public interface Methods {
    void insertNode(Node root, int value);

    Node insertRecursion(Node root, int value);

    void display();

    int size();

    boolean contains(Node node, int value);

    Node eldestChild(Node node);

    boolean remove(Node node);
}
