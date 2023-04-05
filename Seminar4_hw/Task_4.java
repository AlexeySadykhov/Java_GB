import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;

public class Task_4 {

//Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке,
// и каждый из их узлов содержит одну цифру.
// Сложите два числа и верните сумму в виде связанного списка.
public static void main(String[] args) {
    Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1, 2, 3));
    Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5, 4, 7));
    // result [6,6,0,1]
    System.out.println(sum(d1, d2));

}

public static Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
    Iterator<Integer> leftIt = d1.iterator();
    Iterator<Integer> rightIt = d2.iterator();
    Deque<Integer> result = new ArrayDeque<Integer>();
    int temp = 0;
    while (leftIt.hasNext() || rightIt.hasNext()) {
        int x;
        int y;
        int sm;
        if (!leftIt.hasNext()) {
            x = 0;
        }
        else x = leftIt.next();
        if (!rightIt.hasNext()) {
            y = 0;
        }
        else y = rightIt.next();
        sm = x + y + temp;
        if (sm >= 10) {
            sm = sm % 10;
            temp = 1;
        }
        else temp = 0;
        result.add(sm);
    }
    if (temp > 0) result.add(temp);
    return result;
}
}