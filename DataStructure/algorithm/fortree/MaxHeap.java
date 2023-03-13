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

    // Init empty max-heap with given maximum capacity
    public MaxHeap(int maxsize) {
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[this.maxsize];
    }

    // Returning position of parent
    private int parent(int pos) {
        return (pos - 1) / 2;
    }

    // Returning position of left children
    private int leftChild(int pos) {
        return (2 * pos)+1;
    }

    // Returning position of right children
    private int rightChild(int pos) {
        return (2 * pos) + 2;
    }

    private boolean isLeaf(int pos) {
        if (pos > (size / 2) && pos <= size) {
            return true;
        }
        return false;
    }

    private void swap(int fpos, int spos) {
        int tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }

    // Max heapify given subtree
    private void maxHeapify(int pos) {
        if (isLeaf(pos)) {
            return;
        }

        if (Heap[pos] < Heap[leftChild(pos)]
                || Heap[pos] < Heap[rightChild(pos)]) {

            if (Heap[leftChild(pos)]  > Heap[rightChild(pos)]) {
                swap(pos, leftChild(pos));
                maxHeapify(leftChild(pos));
            } else {
                swap(pos, rightChild(pos));
                maxHeapify(rightChild(pos));
            }
        }
    }

    public void insert(int element) {
        Heap[size] = element;

        // Traverse up and fix violated element position
        int Icurrent = size;
        while (Heap[Icurrent] > Heap[parent(Icurrent)]) {
            swap(Icurrent, parent(Icurrent));
            Icurrent = parent(Icurrent);
        }
        size++;
    }

    public void print() {

        for (int i = 0; i < size / 2; i++) {

            System.out.print("Parent Node : " + Heap[i] + "\n");

            if (leftChild(i) < size)
                System.out.print(" Left Child Node: " + Heap[leftChild(i)]);

            if (rightChild(i) < size)
                System.out.print(" Right Child Node: " + Heap[rightChild(i)]);

            System.out.println();
        }

    }

    public int extractMax() {
        int popped = Heap[0];
        Heap[0] = Heap[size--];
        maxHeapify(0);
        System.out.println("\nPopped " + popped + "!\n");
        print();
        return popped;
    }

    public static void main(String[] arg) {
        // Better readability
        System.out.println("The initial Max-Heap is\n");

        MaxHeap maxHeap = new MaxHeap(15);

        // Inserting nodes
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);

        // Call result after input
        maxHeap.print();

        System.out.println("The max value of Max-heap is "
                + maxHeap.extractMax());
        System.out.println("\nGet max value again");
        System.out.println("The max val is "
                + maxHeap.extractMax());
    }

}
