package forarray.mergesort;

public class MergeSort {
    void sortAndPrint(int[] arr) {

    }

    void dNc(int[] arr, int l, int r) {
        if (l > r) {
            return;
        }
        int m = (r+l) / 2;
        dNc(arr, l, m);
        dNc(arr, m + 1, r);
        merge(arr, l, m, r);
    }
    
    void merge(int[] arr, int l, int m, int r) {
        // Assign auxility arrays
        int n1 = m - l + 1;
        int n2 = r - m;

        for (int i = 0; i < n1; i++) {
               
        }

    }
    
    void print() {
        
    }
    
    public static void main(String[] args) {
        
    }
}
