package fortree;

/**
 *
 * @author bannguyen
 */

 /*
Bài toán:
Cho 1 mảng số nguyên.
Tạo ra một cấu trúc dữ liệu sao cho, mỗi khi cần lấy ra 1 phần tử
Thì phần tử đó luôn đảm bảo là phần tử có giá trị lớn nhất (Max Heap)
--
Về mặt kỹ thuật:
Coi CTDL này là 1 mảng.
cung cấp phương thức insert
cung cấp phương thức lấy ra phần tử max
*/

public class MaxHeap {

    private int[] Heap;
    private int size;
    private int maxsize;

    // Constructor to initialize an empty max-heap with given maximum capacity
    public MaxHeap(int maxsize) {
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[this.maxsize];
    }

    // Method 1
    // Returning position of parent
    
    private int parent(int pos) {
        return (pos - 1) / 2;
    }

    // Method 2
    // Returning left children
    private int leftChild(int pos) {
        return (2 * pos)+1;
    }

    // Method 3
    // Returning left children
    private int rightChild(int pos) {
        return (2 * pos) + 2;
    }

    // Method 4
    // Returning true of given node is leaf
    private boolean isLeaf(int pos) {
        if (pos > (size / 2) && pos <= size) {
            return true;
        }
        return false;
    }

    // Method 5
    // Swapping nodes
    private void swap(int fpos, int spos) {
        int tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }

    // Method 6
    // Recursive function to max heapify given subtree
    private void maxHeapify(int pos) {
        if (isLeaf(pos)) {
            return;
        }

        if (Heap[pos] < Heap[leftChild(pos)]
                || Heap[pos] < Heap[rightChild(pos)]) {

            if (Heap[leftChild(pos)]
                    > Heap[rightChild(pos)]) {
                swap(pos, leftChild(pos));
                maxHeapify(leftChild(pos));
            } else {
                swap(pos, rightChild(pos));
                maxHeapify(rightChild(pos));
            }
        }
    }

    // Method 7
    // Inserts a new element to max heap
    public void insert(int element) {
        Heap[size] = element;

        // Traverse up and fix violated property
        int current = size;
        while (Heap[current] > Heap[parent(current)]) {
            swap(current, parent(current));//doi cho
            current = parent(current);//di chuyen current len node cha
        }
        size++;//tang so luong phan tu mang
    }

    // Method 8
    // To display heap
    public void print() {

        for (int i = 0; i < size / 2; i++) {

            System.out.print("Parent Node : " + Heap[i]);
            System.out.println("");

            if (leftChild(i) < size) //if the child is out of the bound of the array
            {
                System.out.print(" Left Child Node: " + Heap[leftChild(i)]);
            }

            if (rightChild(i) < size) //if the right child index must not be out of the index of the array
            {
                System.out.print(" Right Child Node: " + Heap[rightChild(i)]);
            }

            System.out.println(); //for new line

        }

    }

    // Method 9
    // Remove an element from max heap
    public int extractMax() {
        int popped = Heap[0];
        Heap[0] = Heap[size--];//doi cho phan tu dau tien cho phan tu cuoi cung
        maxHeapify(0);//vun dong cho phan tu goc
        print();
        return popped;
    }

    // Method 10
    // main dri er method
    public static void main(String[] arg) {
        // Display message for better readability
        System.out.println("The Max Heap is ");

        MaxHeap maxHeap = new MaxHeap(15);

        // Inserting nodes
        // Custom inputs
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);

        // Calling maxHeap() as defined above
//        maxHeap.print();

        // Print and display the maximum value in heap
        System.out.println("The max val is "
                + maxHeap.extractMax());
        System.out.println("Get max value again: ");
        System.out.println("The max val is "
                + maxHeap.extractMax());
    }

}
