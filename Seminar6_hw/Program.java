import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

    public static Scanner scanner = new Scanner(System.in);

    public static String getString(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

    public static ArrayList<Integer> getIntLst(String item) {
        System.out.printf("Enter min and max values of %s splitting them by space:\n", item);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        String numsStr = scanner.nextLine();
        if (numsStr.isEmpty()) return nums;
        else {
            String[] numsStrArr = numsStr.split(" ");
            for (int i = 0; i < numsStrArr.length; i++) {
                nums.add(Integer.parseInt(numsStrArr[i]));
            }
            return nums;
        }
    }
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<Laptop>();
        laptops.add(new Laptop(1, "Dell", "1298", "Windows", "Black", "Intel core i7", 32, 2000, 11, 700));
        laptops.add(new Laptop(2, "Apple", "1750", "Mac OS", "Silver", "M2", 32, 250, 16, 3500));
        laptops.add(new Laptop(3, "Asus", "3428", "Windows", "Blue", "Intel core i5", 8, 120, 13, 950));
        laptops.add(new Laptop(4, "Lenovo", "3847", "Windows", "White", "Intel core i3", 4, 512, 16, 2500));
        laptops.add(new Laptop(5, "Apple", "42347", "Mac OS", "Space grey", "M1", 16, 1000, 13, 3000));
    
        System.out.println("Enter the parameters or keep the next fields empty.");
        String maker = getString("Maker:");
        String model = getString("Model:");
        String os = getString("OS:");
        String color = getString("Color:");
        String cpu = getString("CPU:");
        ArrayList<Integer> ram = getIntLst("RAM");
        ArrayList<Integer> memory = getIntLst("memory");
        ArrayList<Integer> screenSize = getIntLst("screen size");
        ArrayList<Integer> price = getIntLst("price");
    
        for (Laptop laptop : laptops) {
            if ((maker.isEmpty() || laptop.maker.equals(maker)) && 
            (model.isEmpty() || laptop.model.equals(model)) &&
            (os.isEmpty() || laptop.os.equals(os)) &&
            (color.isEmpty() || laptop.color.equals(color)) &&
            (cpu.isEmpty() || laptop.cpu.equals(cpu)) &&
            (ram.size() == 0 || (ram.get(0) <= laptop.ram && ram.get(1) >= laptop.ram)) &&
            (memory.size() == 0 || (memory.get(0) <= laptop.memory && memory.get(1) >= laptop.memory)) &&
            (screenSize.size() == 0 || (screenSize.get(0) <= laptop.screenSize && screenSize.get(1) >= laptop.screenSize)) &&
            (price.size() == 0 || (price.get(0) <= laptop.price && price.get(1) >= laptop.price))) {
                laptop.showInfo();
                System.out.println("--------------");
            }
        }
    }

}
