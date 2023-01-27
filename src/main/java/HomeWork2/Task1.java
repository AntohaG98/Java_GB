//                            Задача 1
// Напишите метод, который принимает на вход строку (String)
// и определяет является ли строка палиндромом (возвращает boolean значение).

package HomeWork2;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String string = in.next();
        System.out.println(isPalindrom(string));
        in.close();
    }

    public static boolean isPalindrom(String string) {
        return string.equals((new StringBuilder(string)).reverse().toString());
    }
}
