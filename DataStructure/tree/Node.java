// package tree;

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
                        temp.left = temp;
                        break;
                    } else {
                        temp = temp.left;
                    }
                } else if (data > temp.data) {
                    if (temp.right == null) {
                        temp.right = temp;
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
            Node temp = root;
            int lv = 0;
            while (true) {
                System.out.println(temp.data);
                System.out.print("Level " + lv + " : ");

                for (int k = 0; k < Math.pow(k, lv); k++) {

                }
            }
        }
    
        // size
        // isExist
}
