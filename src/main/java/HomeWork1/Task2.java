package HomeWork1;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: "); //просим пользователя ввести год
        if (scanner.hasNextInt()){
            int year = scanner.nextInt();
            if (year >= 0){
                if (year % 400 == 0){System.out.println(true);}
                else if (year % 100 == 0) {System.out.println(false);}
                else if (year % 4 == 0) {System.out.println(true);}
                else {System.out.println(false);}
            }
            else {System.out.println("Введено отрицательное число!");
            }
        } else {
            System.out.println("Ошибка ввода!");
        }
    }
}
