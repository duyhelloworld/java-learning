package com.datastructure.tree.myavl;

public interface MethodOfAVL {
    public void add(Node node);
    
    public void add(int value);

    public boolean searchNode(Node node);
    
    public boolean searchNode(int value);

    public boolean delete(int value);

    public String checkBalanceStatus(Node root);

    // public void inOreder(Node root)
}
