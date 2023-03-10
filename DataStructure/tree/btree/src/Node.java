public class Node {
    int value;
    Node left, right;
    int level;

    public Node(int value) {
        this.value = value;
    }

    public int size(Node root) {
        if (root == null) {
            return 0;
        } else {
            return size(root.left) + size(root.right) + 1;
        }
    }

    public boolean lowSearch(Node root, int value) {
        if (root == null) {
            return false;
        } else {
            if (root.value > value) {
                if (root.left != null) {
                    return lowSearch(root.left, value);
                }
                return false;
            } else if (root.value < value) {
                if (root.right != null) {
                    return lowSearch(root.right, value);
                }
                return false;
            } else {
                return true;
            }
        }
    }

    public boolean quickSearch(Node root, int value) {
        if (root == null) {
            return false;
        }
        if (value == root.value) {
            return true;
        } else {
            if (value < root.value) {
                return quickSearch(root.left, value);
            } else {
                return quickSearch(root.right, value);
            }
        }
    }

    public void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.value + "\t");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.value + "\t");
            inOrder(root.right);
        }
    }

    public void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.value + "\t");
        }
    }

    private boolean isLeaf(Node node) {
        return node.left == null && node.right == null;
    }

    public Node elsdetNode(Node node) {
        if (node.left == null) {
            return node;
        } else {
            return elsdetNode(node.left);
        }
    }

    private Node oldestNode(Node node){
        if (node.right == null) {
            return node;
        }
        return oldestNode(node.right);
    }

    public Node delNode(Node cur, int value) {
        
        if (cur == null) {
            return null;
        }

        if (value < cur.value) {
            cur.left = delNode(cur.left, value);
        } else if (value > cur.value) {
            cur.right = delNode(cur.right, value);
        } else {
            // + Case 1 : leaf
            if (isLeaf(cur)) {
                return null;
            }

            // + Case 2 : 1 child
            if (cur.left == null) {
                return cur.right;
            }
            if (cur.right == null) {
                return cur.left;
            }
            // + Case 3 : 2 child
            // Node nodeSmallest = elsdetNode(cur.right); // trái cùng của con bên phải
            // cur.value = nodeSmallest.value; // no swap. assign and delete

            // cur.right = delNode(cur.right, nodeSmallest.value);
            Node biggestNode = oldestNode(cur.left);
            cur.value = biggestNode.value;

            // Re balance
            cur.left = delNode(cur.left, biggestNode.value);
        }
        return cur;
    }
}
