package tree;

import java.util.Stack;
import java.util.TreeSet;

public class Node {
    int data;
    Node left, right, parent;

    public Node(int data) {
        this.data = data;
    }

    public Node insertNode(Node root, int data) {
        Node node = new Node(data);
        if (root == null) {
            return node;
        } else {
            Node temp = root;

            while (true) {
                if (data < temp.data) {
                    if (temp.left == null) {
                        temp.left = node;
                        break;
                    } else {
                        temp = temp.left;
                    }
                } else if (data > temp.data) {
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

    public Node insertRecursion(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insertRecursion(root.left, data);
        }
        if (data > root.data) {
            root.right = insertRecursion(root.right, data);
        }
        return root;
    }

    public void display(Node root) {
        // Node temp = root;
        // int lv = 0;
        // while (true) {
        // System.out.println(temp.data);
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
        Stack<Node> st = new Stack<Node>();
        if (root == null) {
            
        } else {
            while (true) {
                st.push(root);
                if (root.left != null) {
                    st.push(root.left);
                } else if (root.right != null) {
                    st.push(root.right);
                } else if (root == null) {
                    
                }
            }
        }
        return st.size();
    }

    public boolean isExist(Node root, int data) {
        if (root == null) {
            return false;
        } else {
            if (root.data > data) {
                if (root.left == null) {
                    return false;
                } else {
                    return isExist(root.left, data);
                }
            } else if (root.data < data) {
                if (root.right == null) {
                    return false;
                } else {
                    return isExist(root.right, data);
                }
            } else {
                return true;
            }
        }
    }

    public boolean searchNode(Node root, int value) {
        if (rott == null) {
            return false;
        }
        if (value == root.data) {
            return true;
        } else {
            if (value < root.data) {
                return searchNode(root.left, value);
            } else {
                return searchNode(root.right, value);
            }
        }
    }

    // @Override
    public String toString(Node root) {
        String text = null;
        Set<String> set = new TreeSet<>();
        while (true) {

        }

        return text;
    }

    public void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + "\t");
            preOrder(root.left);
            preOrder(root.right);
        } else {
            // System.out.print("_");
        }
    }

    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + "\t");
            inOrder(root.right);
        } else {
            // System.out.print("_");
        }
    }

    // public void 
}
