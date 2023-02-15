package com.datastructure.tree.myavl;

public class MyAVLTree implements MethodOfAVL {
    private Node root;

    public Node getRoot() {
        return this.root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        } else if (root.value > value) {
            root.left = insert(root.left, value);
        } else if (root.value < value) {
            root.right = insert(root.right, value);
        } else {
            throw new RuntimeException("Something wrong happened!");
        }
        return rebalance(root);
    }

    public Node rebalance(Node node) {
        return null;
    }

    @Override
    public void add(Node node) {
        root = insert(root, node.value);
    }

    @Override
    public void add(int value) {
        root = insert(root, value);
    }

    @Override
    public boolean searchNode(Node node) {
        return false;
    }

    @Override
    public boolean searchNode(int value) {
        return false;
    }

    @Override
    public boolean delete(int value) {
        return false;
    }

    @Override
    public String checkBalanceStatus(Node root) {
        return null;
    }
}
