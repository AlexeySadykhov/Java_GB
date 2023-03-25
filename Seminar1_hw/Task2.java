import java.util.Scanner;

public class Task2 {

    public static Scanner scan = new Scanner(System.in);

    public static int get_input(String text) {
        System.out.printf(text);
        return scan.nextInt();
    }
    public static void main(String[] args) {
        System.out.println("Task 2.");
        int n = get_input("Enter the length of the array:");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = get_input(String.format("Enter number %s:", i + 1));
        }
        int f = get_input("Enter the factor:");
        scan.close();
        for (int item : arr) {
            System.out.println(item * f);
        }
    }
}
