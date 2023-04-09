import java.util.Arrays;

public class Sorting {
    public static void heap(int[] array, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && array[i] < array[left]) {
            largest = left;
        }
        if (right < n && array[largest] < array[right]) {
            largest = right;
        }
        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            heap(array, n, largest);
        }
    }
    public static void heapSort(int[] array) {
        int length = array.length;
        for (int i = length / 2; i > -1; i--) {
            heap(array, length, i);
        }
        for (int i = length - 1; i > 0; i--) {
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;
            heap(array, i, 0);
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[] {3, 2, 5, 7, 1, 7, 8};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
