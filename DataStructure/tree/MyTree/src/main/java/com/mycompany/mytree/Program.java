package com.mycompany.mytree;

/**
 * 
 * @author DP
 */
public class Program {
    public static void main(String[] args) {
        Node root = new Node(45);
        root.insertNodeUsingRecursion(root, 15);
        root.insertNodeUsingRecursion(root, 79);
        root.insertNodeUsingRecursion(root, 10);
        System.out.println("ket thuc");
        
    }
}
