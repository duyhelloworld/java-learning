package fortree.sort;


/*
 * Binary Heap : Max-Heap (Parent > Child) --> Sort 1->9
 * Node ở vị trí thứ i -> con trái 2i + 1, con phải 2i + 2, cha round((i-1)/2) (Cài đặt = mảng)
 */

public class HeapSort {
    //  { 10, 29, 3, 0, 133, 34, 87};

    static void sort(int[] arr) {
        int size = arr.length;
        // Build from first non-leaf node
        for (int i = Math.round(size / 2 - 1); i >= 0; i--) {
            heapify(arr, size, i);
        }
        // {10, 29, 87, 0, 133, 34, 3}
        // {10, 133, 87, 0, 29, 34, 3}
        // {133, 10, 87, 0, 29, 34, 3}
        // {133, 29, 87, 0, 10, 34, 3}

        // Sort
        for (int i = size - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            // i = 6 : {3, 29, 87, 0, 10, 34, 133}
            
            // Heapify root element
            heapify(arr, i, 0);
            // {87, 29, 34, 0, 10, 3, 133}
        }
    }
    
    static void print(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + "\t");
        System.out.println();
    }

    private static void heapify(int arr[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }

        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }

        if (largest != i) {
            int t = arr[i];
            arr[i] = arr[largest];
            arr[largest] = t;
            heapify(arr, n, largest);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = { 10, 29, 3, 0, 133, 34, 87 };
        HeapSort.sort(arr);
        HeapSort.print(arr);
    }

}
