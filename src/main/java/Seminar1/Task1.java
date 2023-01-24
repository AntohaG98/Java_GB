package Seminar1;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.next();
        System.out.println("Привет, " + name + "!");
        System.out.printf("Привет, %s!%n", name);
    }
}

