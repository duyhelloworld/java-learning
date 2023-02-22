package fortree.duycode;

import java.util.Arrays;

/**
 * 0    1   2   3   4   5   6   7   8   
 * __________________________________
 * 5    7   1   8   6   9   4   2   3
 */

public class HeapTree {
    int[] heaptree;

    public HeapTree(int[] src) {
        this.heaptree = src;
    }

    private int root() {
        return heaptree[0];
    }

    private void swap(int[] src, int i, int j){
        int temp = src[i];
        src[i] = src[j];
        src[j] = temp;
    }

    private int size(){
        return heaptree.length;
    }

    private int lastestParent() {
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

    private boolean isLeaf(int index) {
        return 2 * index > size() && index <= size();
    }

    private int getParent(int index) {
        return (int) Math.floor((index - 1) / 2);
        // floor : round down
    }

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
            // return;
        }
        // heapify(arr, n, largest);
    }

    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }


    }

    public void print() {
        System.out.println("_____________________________");
        System.out.println(Arrays.toString(heaptree));
    }
}
