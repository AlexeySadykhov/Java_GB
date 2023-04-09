import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;

public class Task_3 {

// Дан Deque состоящий из последовательности цифр.
// Необходимо проверить, что последовательность цифр является палиндромом
public static void main(String[] args) {
    Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,4,5,6));
    System.out.println(checkOn(deque));
}

public static boolean checkOn(Deque<Integer> deque){
    Iterator<Integer> iterator = deque.iterator();
    Iterator<Integer> descIterator = deque.descendingIterator();
    while (iterator.hasNext() && descIterator.hasNext()) {
        int x = iterator.next();
        int y = descIterator.next();
        if (x != y) {
            return false;
        }
    }
    return true;
}

}