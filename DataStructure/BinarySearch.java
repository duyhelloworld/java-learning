public class BinarySearch {

    static int swap(int number, int dummy) {
        return number;
    }

    // public static int[] sort(int[] array, int size) {
    //     for (int i = 0; i < size; i++) {
    //         for (int j = size - 1; j > 0; j--) {
    //             if (array[j-1] > array[j]) {
    //                 array[j] = swap(array[j-1], array[j-1] = array[j]);
    //             }
    //         }
    //     }
    //     return array;
    // }
    
    public static int[] bbSort(int[] arr, int size) {
        int count = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - count; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = swap(arr[j + 1], arr[j + 1] = arr[j]);
                }
            }
            if (i > 2) {
                count++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        // int a = 10;
        // int b = 12;
        // a = swap(b, b = a);
        // System.out.println(a + "\t" + b);

        // + Swap work
        int[] arr = {0, 13, 8, 23, 45, 1, 10 };
        int[] rs = bbSort(arr, 7);
        for (int i = 0; i < rs.length; i++) {
            System.out.println(rs[i]);
        }
    }
}
