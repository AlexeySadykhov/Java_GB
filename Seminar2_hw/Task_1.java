// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
// Пример: s = “cba”, index = [3,2,1] result “abc”

public class Task_1 {
    public static void main(String[] args) {
        System.out.println(shuffle("cba", new int[] {3,2,1}));
    }

    public static String shuffle(String s, int[] indx) {
        char[] result = new char[indx.length];
        for (int i = 0; i < indx.length; i++) {
            result[i] = s.charAt(indx[i] - 1);
        }
        return new String(result);
    }
}
// А ничего, что компьютер вообще-то с нуля считает? Кто такое дебильное условие написал?
// Нельзя запихнуть элемент на индекс 3, если размер массива всего 3.