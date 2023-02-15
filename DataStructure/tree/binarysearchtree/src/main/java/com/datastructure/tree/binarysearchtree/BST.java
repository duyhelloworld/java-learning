public class BST {
    Node root;

    public BST() {
        root = null;
    }
    
    public BST(int data) {
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
