/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datastructure.tree;

/**
 *
 * @author bannguyen
 */
public class Program_Of_Teacher {

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        tree.insert(44);
        tree.insert(17);
        tree.insert(78);
        tree.insert(32);
        tree.insert(50);
        tree.insert(88);
        tree.insert(48);
        tree.insert(62);
        tree.searchInOrder(tree.getRoot());
        System.out.println("");
        System.out.println("Them moi node 54 cho tree:");
        tree.insert(54);
        System.out.println("Ket qua tree sau khi them:");
        tree.searchInOrder(tree.getRoot());
//        System.out.println("");
//        tree.searchInOrder(tree.getRoot());
    }

}
