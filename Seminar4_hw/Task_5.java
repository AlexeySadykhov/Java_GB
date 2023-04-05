import java.util.Scanner;

public class Task_5 {

//Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']', определите,
// является ли входная строка логически правильной.
// Входная строка логически правильная, если:
// 1) Открытые скобки должны быть закрыты скобками того же типа.
// 2) Открытые скобки должны быть закрыты в правильном порядке. Каждая закрывающая скобка имеет соответствующую
// открытую скобку того же типа.
// ()[] = true
// () = true
// {[()]} = true
// ()() = true
// )()( = false

public static Scanner scanner = new Scanner(System.in);
public static void main(String[] args) {
    String inputString = scanner.nextLine();
    System.out.println(validate(inputString, '(', ')') 
    && validate(inputString, '{', '}') 
    && validate(inputString, '[', ']'));
}

public static boolean validate(String testString, char open, char close) {
    int opNum = 0;
    int clNum = 0;
    for (int i = 0; i < testString.length(); i++) {
        if (testString.charAt(i) == close && opNum == 0) {
            return false;
        }
        if (testString.charAt(i) == open) opNum += 1;
        if (testString.charAt(i) == close) clNum += 1;
    }
    if (opNum == clNum) return true;
    else return false;
}
}