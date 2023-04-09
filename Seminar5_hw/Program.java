import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.HashMap;

public class Program {
    public static String RandomNums(int min, int max, int length) {
        StringBuilder strbld = new StringBuilder();
        for (int i = 0; i < length; i++) {
            strbld.append(ThreadLocalRandom.current().nextInt(min, max + 1));
        }
        return strbld.toString();
    }
    public static ArrayList<String> RandomList() {
        int length = ThreadLocalRandom.current().nextInt(1, 5);
        ArrayList<String> lst = new ArrayList<String>();
        for (int i = 0; i < length; i++) {
            lst.add(RandomNums(0, 9, 11));
        }
        return lst;
    }
    public static HashMap<String, ArrayList<String>> CreateHashMap(String names) {
        String[] keys = names.split("\n");
        HashMap<String, ArrayList<String>> hashMap = new HashMap<String, ArrayList<String>>();
        for (int i = 0; i < keys.length; i++) {
            hashMap.put(keys[i], RandomList());
        }
        return hashMap;
    }
    public static void bubbleSort(HashMap<String, Integer> hashMap) {
        String[] keys = hashMap.keySet().toArray(new String[0]);
        int[] values = hashMap.values().stream().mapToInt(Integer::intValue).toArray();
        for (int i = 0; i < values.length - 1; i++) {
            for (int j = 0; j < values.length - i - 1; j++) {
                if (values[j] < values[j + 1]) {
                    String temp = keys[j];
                    keys[j] = keys[j + 1];
                    keys[j + 1] = temp;
                    int tmp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < keys.length; i++) {
            if (values[i] > 1) {
                System.out.printf("%s: %s\n", keys[i], values[i]);
            }
        }
    }
    public static void findDups(HashMap<String, ArrayList<String>> phoneBook) {
        ArrayList<String> names = new ArrayList<String>();
        for (String key : phoneBook.keySet()) {
            names.add(key.split(" ")[0]);
        }
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < names.size(); i++) {
            if (!map.containsKey(names.get(i))) map.put(names.get(i), 1);
            else map.put(names.get(i), map.get(names.get(i)) + 1);
        }
        bubbleSort(map);
    }
    public static void main(String[] args) {
        String text = "Иван Иванов\nСветлана Петрова\nКристина Белова\nАнна Мусина\nАнна Крутова\nИван Юрин\nПетр Лыков\nПавел Чернов\nПетр Чернышов\nМария Федорова\nМарина Светлова\nМария Савина\nМария Рыкова\nМарина Лугова\nАнна Владимирова\nИван Мечников\nПетр Петин\nИван Ежов";
        HashMap<String, ArrayList<String>> phoneBook = CreateHashMap(text);
        System.out.println(phoneBook);
        System.out.println("Duplicate names:");
        findDups(phoneBook);
    }
}