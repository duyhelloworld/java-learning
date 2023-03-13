package forarray.quicksort;

import java.util.Arrays;

public class QuickSort {

    // Pivot in Middle
    static void qSort(int[] arr, int low, int high) {
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

            // SWAP
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }

        if (low < j) {
            qSort(arr, low, j);
        }

        if (i < high) {
            qSort(arr, i, high);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = { 1, 12, 5, 26, 7, 14, 3, 8, 2 };
        System.out.println(Arrays.toString(arr));
        QuickSort.qSort(arr, 0, arr.length - 1);
        System.out.print(Arrays.toString(arr));
    }
}
