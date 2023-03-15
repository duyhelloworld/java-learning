public class TimTrongMang {

    /**
     * @author duydeptrai
     * Sort with nlog(n)
     * final --> code not called when sort
     */
    final static void heapify(int arr[], int n, int i) {
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

    static void heapSort(int[] arr) {
        int size = arr.length;
        for (int i = Math.round(size / 2 - 1); i >= 0; i--) {
            heapify(arr, size, i);
        }
        for (int i = size - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    final static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }
        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    static void mergeSort(int[] arr, int l, int r) {
        if (l < r && arr != null) {
            int m = (r - l) / 2 + l;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge(arr, l, m, r);
            return;
        }
    }
    
    // Average : nlog(n)
    // Worst : n2
    static void quickSort(int[] arr, int low, int high) {
        if (arr == null || low >= high) {
            return;
        }

        int pivot = arr[(high - low) / 2 + low];
        int i = low, j = high;

        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i > j)
                break;

            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }

        if (low < j) {
            quickSort(arr, low, j);
        }

        if (i < high) {
            quickSort(arr, i, high);
        }
    }

    /*
     * @author duydeptraihon
     * Search with log(n)
     */
    public static boolean binarySearch(int arr[], int value) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (arr[middle] > value) {
                end = middle - 1;
            } else if (arr[middle] < value) {
                start = middle + 1;
            } else {
                return true;
            }
        }
        return false;
    }

    static void print(int[] arr) {
        for (int i : arr) {
            System.out.println(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 10, 4, 9, 3};
        // heapSort(arr);
        // mergeSort(arr, 0, arr.length - 1);
        // quickSort(arr, 0, arr.length - 1);
        // print(arr);
        System.out.println(binarySearch(arr, 2));
        System.out.println(binarySearch(arr, 3));
        System.out.println(binarySearch(arr, 100));
    }
}