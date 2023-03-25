import java.util.Scanner;

public class Task3 {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.printf("Task 3.\nEnter numbers splitting values by space:");
        String[] numsStr = scan.nextLine().split(" ");
        int[] nums = new int[numsStr.length];
        for (int i = 0; i < numsStr.length; i++) {
            nums[i] = Integer.parseInt(numsStr[i]);
        }
        System.out.printf("Specify the operation (+ - *):");
        String opr = scan.nextLine();
        scan.close();
        switch (opr) {
            case "+":
                int sm = 0;
                for (int item : nums) {
                    sm += item;
                }
                System.out.printf("Sum of the numbers is %s.\n", sm);
                break;
            case "-":
                int diff = nums[0];
                for (int i = 1; i < nums.length; i++) {
                    diff -= nums[i];
                }
                System.out.printf("Difference of the numbers is %s.\n", diff);
                break;
            case "*":
                int product = nums[0];
                for (int i = 1; i < nums.length; i++) {
                    product *= nums[i];
                }
                System.out.printf("Product of the numbers is %s.\n", product);
                break;
            default:
                System.out.println("You didn't specify the operation.");
                break;
        }
    }
}
