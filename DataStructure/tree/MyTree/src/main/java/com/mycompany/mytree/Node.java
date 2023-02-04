/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mytree;


/**
 *
 * @author HP
 */

    //cai dat cau truc du lieu dang tree, moi thanh phan goi la 1 node
public class Node{
    int value;//luu du lieu cua node
    Node left;
    Node right;
    //viet ham tao de moi khi tao moi 1 node thi co cac gia tri mac dinh
    public Node(int value){
       this.value = value ;       
    }
    //ham them moi 1 node vao trong tree
    public Node insertNode(Node root, int value){
        //neu cau chua ton tai.
        Node newNode = new Node(value);
        //kiem tra tree da ton tai chua
        if(root==null){
           return newNode; 
        }else{
            //cay da ton tai node goc
            //Nhieu cach to chuc tree trong may tinh
            //co nhieu cach de viet cac phuong thuc.
            Node temp = root;//muc dich de duyet
            while(true){
                if(value < temp.value){
                    if(temp.left == null){
                        temp.left = newNode;
                        break;
                    }else{
                        temp = temp.left;
                    }
                }else{
                    //code here.
                    if(temp.right ==null){
                        temp.right = newNode;
                        break;
                    }else{
                        temp = temp.right;
                    }
                }
            }
        }
        return root;
    }
    //insert a node using recursion
    public Node insertNodeUsingRecursion(Node root, int value){
        if(root == null){
            return new Node(value);
        }
        if(value<root.value){
            root.left = insertNodeUsingRecursion(root.left, value);
        }
        if(value>root.value){
            root.right = insertNodeUsingRecursion(root.right, value);
        }                
        return root;
    }
    //Dem xem trong tree co bao nhieu node
    //Tim xem co node nao do ton tai trong tree hay khong
}
  






