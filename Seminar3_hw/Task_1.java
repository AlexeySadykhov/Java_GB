import java.util.Arrays;

public class Task_1 {
    public static void mergeSort(int[] array) {
        if (array.length > 1) {
            int mid = array.length / 2;
            int[] left = Arrays.copyOfRange(array, 0, mid);
            int[] right = Arrays.copyOfRange(array, mid, array.length);
            mergeSort(left);
            mergeSort(right);
            int i = 0;
            int j = 0;
            int k = 0;
            while (i < left.length && j < right.length) {
                if (left[i] < right[j]) {
                    array[k] = left[i];
                    i++;
                }
                else {
                    array[k] = right[j];
                    j++;
                }
                k++;
            }
            while (i < left.length) {
                array[k] = left[i];
                i++;
                k++;
            }
            while (j < right.length) {
                array[k] = right[j];
                j++;
                k++;
            }
        }
    }
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minValIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minValIndex]) {
                    minValIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minValIndex];
            array[minValIndex] = temp;
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {10, 4, 21, 6, 48, 7, 3, 8};
        mergeSort(nums1);
        System.out.println(Arrays.toString(nums1));
        int[] nums2 = {3, 1, 7, 8, 3, 6, 2, 5, 9};
        selectionSort(nums2);
        System.out.println(Arrays.toString(nums2));
    }
}
