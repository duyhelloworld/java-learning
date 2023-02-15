package com.datastructure.tree;
import java.util.Stack;

public class Tree implements Methods {

    Node root;
    int level;

    public Tree() {
    }

    @Override
    public Node insertRecursion(Node parent, int value) {
        Node node = new Node(value);
        if (parent == null) {
            this.root = node;
            return node;
        }

        if (parent.value < value) {
            if (parent.right == null) {
                parent.right = node;
                this.level++;
                return node;
            }
            return insertRecursion(parent.right, value);
        }
        if (parent.value > value) {
            if (parent.left == null) {
                parent.left = node;
                this.level++;
                return node;
            }
            return insertRecursion(parent.left, value);
        }
        return null;
    }

    @Override
    public void insertNode(Node parent, int value) {
        Node node = new Node(value);
        Node pointer = parent;
        if (pointer == null) {
            this.root = node;
            return;
        }

        while (true) {
            if (value < pointer.value) {
                if (pointer.left == null) {
                    pointer.left = node;
                    break;
                }
                pointer = pointer.left;
            }
            if (value > pointer.value) {
                if (pointer.right == null) {
                    pointer.right = node;
                    break;
                }
                pointer = pointer.right;
            }
            if (value == pointer.value) {
                break;
            }
        }
    }

    @Override
    public void display() {
        if (this.root == null) {
            System.out.println("Tree empty");
            return;
        }
        
        Stack<Node> treeStack = new Stack<Node>();
        treeStack.push(root);
        int numOfBlanks = 64;
        boolean isRowEmpty = false;
        System.out.println();
        
        while (isRowEmpty == false) {
            Stack<Node> localStack = new Stack<Node>();
            isRowEmpty = true;

            for (int x = 0; x < numOfBlanks; x++)
                System.out.print(" ");

            while (treeStack.isEmpty() == false) {
                Node temp = (Node)treeStack.pop();
                if (temp != null)
                {
                    System.out.print(temp.value);
                    localStack.push(temp.left);
                    localStack.push(temp.right);

                    if (temp.left != null || temp.right != null)
                        isRowEmpty = false;
                }
                    else {
                        System.out.print("__");
                        localStack.push(null);
                        localStack.push(null);
                    }

                    for (int y = 0; y < numOfBlanks * 2 - 2; y++)
                        System.out.print(" ");
                }
                System.out.println();
                numOfBlanks /= 2;
                while (localStack.isEmpty() == false)
                    treeStack.push(localStack.pop());
            }
            System.out.println();

    }

    public Node EldestNode(Node parent) {
        Node tmp = parent;
        if (tmp == null) {
            return null;
        }
        if (tmp.left != null) {
            this.level++;
            return EldestNode(tmp.left);
        }
        return tmp;
    }

    @Override
    public int size() {
        if (this.root == null) {
            return 0;
        } else {
            int size = 0;
            Stack<Node> stack = new Stack<Node>();
            stack.push(this.root);
            while (!stack.isEmpty()) {
                Node top = stack.peek();
                if (top != null) {
                    size++;
                    if (top.left != null) {
                        stack.push(top.left);
                        size++;
                    }
                    if (top.right != null) {
                        stack.push(top.right);
                        size++;
                    }
                }
                stack.pop();
            }
            return size;
        }
    }

    @Override
    public boolean contains(Node node, int value) {
        if (node == null) {
            return false;
        }
        if (value == node.value) {
            return true;
        }
        if (value < node.value) {
            return contains(node.left, value);
        } else {
            return contains(node.right, value);
        }
    }

    @Override
    public Node eldestChild(Node node) {
        return null;
    }

    @Override
    public boolean remove(Node node) {
        return false;
    }
    
}
