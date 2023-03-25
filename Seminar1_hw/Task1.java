import java.util.Scanner;

public class Task1 {

    public static Scanner scan = new Scanner(System.in);

    public static int get_input(String text) {
        System.out.printf(text);
        return scan.nextInt();
    }
    public static void main(String[] args) {
        System.out.println("Task 1.");
        int[] arr = new int[1001];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = i * i * i;
        }
        int a = get_input("Enter the first number:");
        int b = get_input("Enter the second number:");
        scan.close();
        if (a < 1 || a > 1000 || b < 1 || b > 1000) {
            System.out.println("Error. Both numbers must be between 1 and 1000.");
            return;
        }
        else System.out.printf("%s, %s\n", arr[a], arr[b]);
    }
}
