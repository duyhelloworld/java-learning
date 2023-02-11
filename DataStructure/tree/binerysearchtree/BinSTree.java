public class BinSTree {
    Node root;

    public BinSTree() {
        root = null;
    }
    
    public BinSTree(int data) {
        this.root = Node.newNode(data);
    }

    public void preOrder(Node node) {
        if (node != null) {
            preOrder(node.left);
            System.out.println(node.value + " ");
            preOrder(node.right);
        }
    }

    public void preOrder() {
        preOrder(this.root);
    }

    public Node insertNode(Node node, int value) {
        return node;
    }

}
