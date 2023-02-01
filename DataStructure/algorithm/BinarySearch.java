import java.util.Scanner;

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
            if (i >= 2) {
                count++;
            }
        }
        return arr;
    }

    public static boolean find(int arr[], int number) {
        int middle, start = 0, end = arr.length;
        boolean found = false;
        while (start <= end && !found) {
            middle = (end - start) / 2;
            if (arr[middle] == number) {
                found = true;
            } else if (arr[middle] < number) {
                end = middle;
            } else {
                start = middle;
            }
            if (start == end)
                found = true;
        }
        if (start == end) {
            found = true;
        }
        return found;
    }

    public static void main(String[] args) {
        // int a = 10;
        // int b = 12;
        // a = swap(b, b = a);
        // System.out.println(a + "\t" + b);

        // + Swap work
        int[] source = { 12, 1, 67, 23, 45, 1, 10 };
        // 1, 1, 10, 12, 23, 45, 67
        int[] sortedArr = bbSort(source, source.length);
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter number : ");
            int number = scan.nextInt();
            System.out.println((find(sortedArr, number) ? "Found " + number : "Not found " + number));
        }
        catch (Exception e) {
            System.out.println("Wrong datatype.");
        };
    }
}
