import java.util.Scanner;

public class Task_2 {

    public static Scanner scanner = new Scanner(System.in);

    public static String[] get_input() {
        System.out.printf("Enter the number of strings:");
        int num_of_strings = scanner.nextInt();
        scanner.nextLine();
        String[] array = new String[num_of_strings];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter string %s:", i + 1);
            array[i] = scanner.nextLine();
        }
        return array;
    }

    public static String replace(String text, String row_to_replace) {
        String[] words = text.split(" ");
        String[] target = row_to_replace.split(" - ");
        for (int i = 0; i < words.length; i++) {
            if ((words[i].charAt(0) >= 'А') && (words[i].charAt(0) <= 'Я') && (words[i].toLowerCase().equals(target[0]))) {
                words[i] = target[1].substring(0, 1).toUpperCase() + target[1].substring(1);
            }
            if (words[i].equals(target[0])) {
                words[i] = target[1];
            }
        }
        return String.join(" ", words);
    }
    public static void main(String[] args) {
        String text = String.join("\n", get_input());
        String[] to_replace = get_input();
        for (String row : to_replace) {
            text = replace(text, row);
        }
        System.out.println(text);
    }
}
