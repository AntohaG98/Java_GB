package Seminar2;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Задаем длину строки
        Scanner read = new Scanner(System.in);
        System.out.print("Введите длину строки: ");
        int length = read.nextInt();

        // Задаем первый символ
        read = new Scanner(System.in);
        System.out.print("Ведите символ C1: ");
        char first = read.nextLine().charAt(0);

        // Задаем второй символ
        System.out.print("Ведите символ C2: ");
        char second = read.nextLine().charAt(0);

        // Выводим строку на экран
/*        StringBuilder sb = new StringBuilder();
        for (int count = 0; count < length / 2; count++) {
            sb.append(first).append(second);
        }*/
        String str = String.valueOf(first).concat(String.valueOf(second)).repeat(length / 2);

        if (length % 2 == 1){
//            sb.append(first);
            str += String.valueOf(first);
        }
        System.out.println(str);
    }
}
