import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Additional_tasks {

    public static ArrayList<Integer> generateRandomNums(int min, int max, int length) {
        ArrayList<Integer> randNums = new ArrayList<Integer>();
        for (int i = 0; i < length; i++) {
            randNums.add(ThreadLocalRandom.current().nextInt(min, max + 1));
        }
        return randNums;
    }

    public static void removeEven(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                nums.remove(i);
                i--;
            }
        }
    }

    public static int[] findMinMax(ArrayList<Integer> nums) {
        int[] result = new int[2];
        result[0] = nums.get(0);
        result[1] = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < result[0]) result[0] = nums.get(i);
            if (nums.get(i) > result[1]) result[1] = nums.get(i);
        }
        return result;
    }

    public static double findAvg(ArrayList<Integer> nums) {
        int sm = 0;
        for (Integer num : nums) {
            sm += num;
        }
        return Double.valueOf(sm) / Double.valueOf(nums.size());
    }
    public static void main(String[] args) {
        // Task 2
        List<Integer> randNums = generateRandomNums(0, 10, 10);
        System.out.printf("Task 2.\n%s\n", randNums);
        removeEven(randNums);
        System.out.println(randNums);
        // Task 3
        ArrayList<Integer> randomNumbers = generateRandomNums(0, 100, 10);
        System.out.printf("Task 3.\n%s\n", randomNumbers);
        int[] minMaxVals = findMinMax(randomNumbers);
        double avg = findAvg(randomNumbers);
        System.out.printf("Min: %s\nMax: %s\nAvg: %s\n", minMaxVals[0], minMaxVals[1], avg);
    }
}