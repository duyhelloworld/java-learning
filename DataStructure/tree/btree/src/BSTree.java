import java.util.Stack;

public class BSTree implements Methods {

    Node root;

    public BSTree() {
    }

    @Override
    public void add(int value) {
        Node node = new Node(value);
        Node pointer = this.root;
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
    public int size() {
        return this.root.size(root);
    }

    @Override
    public boolean contains(int value) {
        return root != null && root.quickSearch(this.root, value);
    }

    @Override
    public boolean remove(int value) {
        if (contains(value)) {
            return this.root.delNode(this.root, value) != null;
        }
        return false;
    }

    @Override
    public boolean isLeaf(int value) {
        return false;        
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
                Node temp = (Node) treeStack.pop();
                if (temp != null) {
                    System.out.print(temp.value);
                    localStack.push(temp.left);
                    localStack.push(temp.right);

                    if (temp.left != null || temp.right != null)
                        isRowEmpty = false;
                } else {
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
}
