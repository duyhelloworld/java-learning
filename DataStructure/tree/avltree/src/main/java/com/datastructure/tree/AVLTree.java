package com.datastructure.tree;

/**
 * @author banguyen
 */
import java.util.Stack;

public class AVLTree {
    
    public class Node {
    
        int value;
        int height;
        Node left;
        Node right;
    
        Node(int value) {
            this.value = value;
        }
    }

    private Node root;
    public Node getRoot() {
        return root;
    }

    public Node find(int value) {
        Node current = root;
        while (current != null) {
            if (current.value == value) {
                break;
            }
            current = current.value < value ? current.right : current.left;
        }
        return current;
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    public void delete(int value) {
        root = delete(root, value);
    }


    private Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        } else if (root.value > value) {
            root.left = insert(root.left, value);
        } else if (root.value < value) {
            root.right = insert(root.right, value);
        } else {
            throw new RuntimeException("duplicate Key!");
        }
        return rebalance(root); 
//        updateHeight(node);
//        return root;
    }

    private Node delete(Node root, int value) {
        if (root == null) {
            return root;
        } else if (root.value > value) {
            root.left = delete(root.left, value);
        } else if (root.value < value) {
            root.right = delete(root.right, value);
        } else {
            if (root.left == null || root.right == null) {
                root = (root.left == null) ? root.right : root.left;
            } else {
                Node mostLeftChild = mostLeftChild(root.right);
                root.value = mostLeftChild.value;
                root.right = delete(root.right, mostLeftChild.value);
            }
        }
        if (root != null) {
            root = rebalance(root);
//            updateHeight(node);
        }
        return root;
    }

    private Node mostLeftChild(Node node) {
        Node current = node;
        /* loop down to find the leftmost leaf */
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    public void searchInOrder(Node node) {
        if (node != null) {
            searchInOrder(node.left);
            System.out.print(" " + node.value);
            searchInOrder(node.right);
        }
    }

    private Node rebalance(Node z) {
        updateHeight(z);                // cap nhat chieu cao cua node
        int balance = getBalance(z);    // tinh balance factor
        if (balance > 1) {              // mat can bang ve phia ben phai
            if (height(z.right.right) > height(z.right.left)) {
                                        // mat can bang han ve ben phai
                z = rotateLeft(z);      // thuc hien thao tac quay trai
            } else {                    // mat can bang ve phia ben phai va cay con bi lech trai
                z.right = rotateRight(z.right);
                                        // thuc hien phep quay phai
                z = rotateLeft(z);      // thuc hien phep quay trai
            }
        } else if (balance < -1) {//mat can bang ve phia ben trai
            if (height(z.left.left) > height(z.left.right)) {
                z = rotateRight(z);
            } else {
                z.left = rotateLeft(z.left);
                z = rotateRight(z);
            }
        }
        return z;
    }

    public String checkUnBalance(Node root) {
        // khai bao stack de luu tru cac node da duyet qua
        Stack<Node> stack = new Stack<>();
        Node current = root;
        //kiem tra xem node dang xet co null hay khong, hoac stack co trong hay khong
        while (current != null || !stack.isEmpty()) {
            //bat dau di ve phia ben trai de dua tat cac cac node vao trong stack: LIFO
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            Node top = stack.pop();
            //kiem tra can bang
            if (checkBalance(top)) {
                return "Mat can bang tai node: " + top.value;
            }
            current = top.right;//xet cho cay con ben phai.            
        }
        return "Cay can bang";
    }

    /*
     *          y
     *      x
     *          z
     */
    private Node rotateRight(Node y) {
        Node x = y.left;
        Node z = x.right;
        x.right = y;
        y.left = z;
        updateHeight(y);
        updateHeight(x);
        return x;
    }
    /*
     *          x
     *      y   
     *          z
     */

    private Node rotateLeft(Node y) {
        Node x = y.right;
        Node z = x.left;
        x.left = y;
        y.right = z;
        updateHeight(y);
        updateHeight(x);
        return x;
    }

    private void updateHeight(Node n) {
        n.height = 1 + Math.max(height(n.left), height(n.right));
    }

    private int height(Node n) {
        return n == null ? -1 : n.height;
    }

    private boolean checkBalance(Node z) {
        // can phai di qua tat ca cac node de kiem tra
        // Su dung ham nay trong truong hop can test insert va delete node tren tree ma ko goi ham rebalance
        updateHeight(z);
        int balance = getBalance(z);
        if (Math.abs(balance) > 1) {
            return true;
        }
        return false;
    }

    public int getBalance(Node n) {
        return (n == null) ? 0 : height(n.right) - height(n.left);
    }
}
