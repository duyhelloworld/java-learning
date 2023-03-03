package forarray.quicksort;

public class QuickSort {
    void qSort(int[] arr, int l, int h){
        if (arr == null || l >= h) {
            return;
        }

        int mid = h / 2 - l / 2 + l;
        int pivot = arr[mid], i = l, j = h;

        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                --j;
            }

            if (i >= j) {
                int tmp = arr[i];arr[i] = arr[j];arr[j] = tmp;   // SWAP
                
            }
        }

    }
}
