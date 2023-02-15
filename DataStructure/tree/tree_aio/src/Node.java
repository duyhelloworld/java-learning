public class Node {
    int value;
    Node left, right;
    int level;

    public Node(int value) {
        this.value = value;
    }

    public Node insertNode(Node root, int value) {
        Node node = new Node(value);
        if (root == null) {
            return node;
        } else {
            Node temp = root;

            while (true) {
                if (value < temp.value) {
                    if (temp.left == null) {
                        temp.left = node;
                        break;
                    } else {
                        temp = temp.left;
                    }
                } else if (value > temp.value) {
                    if (temp.right == null) {
                        temp.right = node;
                        break;
                    } else {
                        temp = temp.right;
                    }
                }
            }
            return root;
        }
    }

    public Node insertRecursion(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.value) {
            root.left = insertRecursion(root.left, value);
        }
        if (value > root.value) {
            root.right = insertRecursion(root.right, value);
        }
        return root;
    }

    public void display(Node root) {
        // Node temp = root;
        // int lv = 0;
        // while (true) {
        // System.out.println(temp.value);
        // System.out.print("Level " + lv + " : ");

        // for (int k = 0; k < Math.pow(k, lv); k++) {
        // System.out.println();
        // }
        // }
    }

    // size
    // isExist
    public boolean isNull(Node root) {
        return root == null;
    }

    public int size(Node root) {
        if (isNull(root)) {
            return 0;
        } else {
            return size(root.left) + size(root.right) + 1;
        }
    }

    public int sizeTree(Node root) {
        if (root == null) {
            
        } else {
            // while (true) {
            //     st.push(root);
            //     if (root.left != null) {
            //         st.push(root.left);
            //     } else if (root.right != null) {
            //         st.push(root.right);
            //     } else if (root == null) {

            //     }
            // }
        }
        return 0;
        // return st.size();
    }

    public boolean isExist(Node root, int value) {
        if (root == null) {
            return false;
        } else {
            if (root.value > value) {
                if (root.left == null) {
                    return false;
                } else {
                    return isExist(root.left, value);
                }
            } else if (root.value < value) {
                if (root.right == null) {
                    return false;
                } else {
                    return isExist(root.right, value);
                }
            } else {
                return true;
            }
        }
    }

    public boolean searchNode(Node root, int value) {
        if (root == null) {
            return false;
        }
        if (value == root.value) {
            return true;
        } else {
            if (value < root.value) {
                return searchNode(root.left, value);
            } else {
                return searchNode(root.right, value);
            }
        }
    }

    // @Override
    public String toString(Node root) {
        String text = null;
        while (true) {

        }

        // return text;
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
        } else {
            // System.out.print("_");
        }
    }

    // public void 
    public boolean isLeaf(Node node) {
        return node.left == null && node.right == null;
    }

    public Node findLeftSmallest(Node node) {
        if (node.left == null) {
            return node;
        } else {
            return findLeftSmallest(node.left);
        }
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
            // + Leaf
            if (isLeaf(cur)) {
                return null;
            }
            // + 1 child
            if (isNull(cur.left)) {
                return cur.left;
            }
            if (isNull(cur.right)) {
                return cur.right;
            }
            // + 2 child
            Node nodeSmallest = findLeftSmallest(cur.right);
            cur.value = nodeSmallest.value;

            cur.right = delNode(cur.right, nodeSmallest.value);
        }
        return cur;
    }
}
