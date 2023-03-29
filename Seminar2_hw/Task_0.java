// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”

import java.util.HashMap;

public class Task_0 {
    public static void main(String[] args) {
        System.out.println(findJewelsInStones("aB", "aaaAbbbB"));
    }
    
    public static String findJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> dct = new HashMap<>();
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.contains(String.valueOf(stones.charAt(i))) && !dct.containsKey(stones.charAt(i))) {
                dct.put(stones.charAt(i), 0);
            }
            if (jewels.contains(String.valueOf(stones.charAt(i))) && dct.containsKey(stones.charAt(i))) {
                dct.put(stones.charAt(i), dct.get(stones.charAt(i)) + 1);
            }
        }
        StringBuilder stringbld = new StringBuilder();
        for (char key : dct.keySet()) {
            stringbld.append(key).append(dct.get(key));
        }
        return stringbld.toString();
    }
    }