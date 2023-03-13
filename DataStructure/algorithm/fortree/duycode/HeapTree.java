package fortree.duycode;

/**
 * 0    1   2   3   4   5   6   7   8   
 * __________________________________
 * 5    7   1   8   6   9   4   2   3
 */

public class HeapTree {
    private int[] heaptree;

    public HeapTree(int[] heaptree) {
        this.heaptree = heaptree;
    }

    private void swap(int[] src, int i, int j){
        int temp = src[i];
        src[i] = src[j];
        src[j] = temp;
    }

    private int size(){
        return heaptree.length;
    }

    private int firstNonLeafNode() {
        return (int) Math.floor(size() / 2 - 1);
    }

    private int left(int index) {
        return 2 * index + 1;
    }

    private int right(int index) {
        return 2 * index + 2;
    }

    private int leftChild(int index) {
        return heaptree[2 * index + 1];
    }

    private int rightChild(int index) {
        return heaptree[2 * index + 2];
    }

    // private boolean isLeaf(int index) {
    //     return 2 * index > size() && index <= size();
    // }

    // private int getParent(int index) {
    //     return (int) Math.floor((index - 1) / 2);
    // }

    private void heapify(int[] arr, int n, int i) {
        int largest = i;
        int rc = rightChild(largest), r = right(largest);
        int lc = leftChild(largest), l = left(largest);
        if (largest < rc && r < n) {
            largest = r;
        }
        if (largest < lc && r < n) {
            largest = l;
        }
        if (largest != i) {
            swap(arr, i, largest);
        }
        heapify(arr, n, largest);
    }

    public void sort() {
        int n = heaptree.length;
        for (int i = firstNonLeafNode(); i >= 0; i--) {
            heapify(heaptree, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            int temp = heaptree[i];
            heaptree[i] = heaptree[0];
            heaptree[0] = temp;

            heapify(heaptree, i, 0);
        }
    }
    
    public void print() {
        int n = heaptree.length;
        for (int i = 0; i < n; ++i)
            System.out.print(heaptree[i] + "\t");
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] src = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        HeapTree tree = new HeapTree(src);
        System.out.println("_____________________________");
        tree.sort();
        tree.print();
    }
}
