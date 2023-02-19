package fortree;

/**
 *
 * @author bannguyen
 */
import java.util.ArrayList;

public class MyPriorityQueue {

    public int parent(int current) {
        return (current - 1) / 2;
    }

    // Function to heapify the tree
    void heapify(ArrayList<Integer> hT, int i) {
        int size = hT.size();
        // Find the largest among root, left child and right child
        int smallest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < size && hT.get(l) < hT.get(smallest)) {
            smallest = l;
        }
        if (r < size && hT.get(r) < hT.get(smallest)) {
            smallest = r;
        }

        // Swap and continue heapifying if root is not largest
        if (smallest != i) {
            //doi cho
            int temp = hT.get(i);
            hT.set(i, hT.get(smallest));
            hT.set(smallest, temp);
            //
            heapify(hT, smallest);
        }
    }

    // Function to insert an element into the tree
    void insert(ArrayList<Integer> hT, int newNum) {
        hT.add(newNum);
        if (hT.size() > 1) {
            int current = hT.size() - 1;//phan tu cuoi cua danh sach
            while (hT.get(current) < hT.get(parent(current))) {
                //doi cho 2 phan tu
                int temp = hT.get(current);
                hT.set(current, hT.get(parent(current)));
                hT.set(parent(current), temp);
                current = parent(current);
            }
        }

    }
//function lay ra phan tu nho nhat o dau danh sach

    public int getMinElement(ArrayList<Integer> hT) {
        if (hT != null && hT.size() > 0) {
            int minElement = hT.get(0);
            //doi cho phan tu dau tien voi phan tu cuoi cung
            int size = hT.size();
            int temp = hT.get(0);
            hT.set(0, hT.get(size - 1));
            hT.set(size - 1, temp);
            //bo di phan tu cuoi cung
            hT.remove(size - 1);
            //vun lai dong cho phan tu goc
            heapify(hT, 0);
            return minElement;
        }
        return -1;
    }

// Function to delete an element from the tree
    void deleteNode(ArrayList<Integer> hT, int num) {
        int size = hT.size();
        int i;
        for (i = 0; i < size; i++) {
            if (num == hT.get(i)) {
                break;
            }
        }

        int temp = hT.get(i);
        hT.set(i, hT.get(size - 1));
        hT.set(size - 1, temp);

        hT.remove(size - 1);
        for (int j = size / 2 - 1; j >= 0; j--) {
            heapify(hT, j);
        }
    }

    // Print the tree
    void printArray(ArrayList<Integer> array, int size) {
        for (Integer i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Driver code
    public static void main(String args[]) {

        ArrayList<Integer> array = new ArrayList<Integer>();
        int size = array.size();

        MyPriorityQueue h = new MyPriorityQueue();
        h.insert(array, 3);
        h.insert(array, 4);
        h.insert(array, 9);
        h.insert(array, 5);
        h.insert(array, 2);

        System.out.println("Min-Heap array: ");
        h.printArray(array, size);

        System.out.println("" + h.getMinElement(array));
        System.out.println("After get a min element: ");
        h.printArray(array, size);
        System.out.println("------------");
        System.out.println("" + h.getMinElement(array));
        System.out.println("After get a min element: ");
        h.printArray(array, size);
    }

}
