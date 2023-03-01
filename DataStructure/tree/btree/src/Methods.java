public interface Methods {
    void add(int value);

    void display();

    int size();

    boolean contains(int value);

    boolean isLeaf(int value);

    Node eldestChild();

    boolean remove(int value);
}
