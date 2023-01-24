package HomeWork1;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int [20];
        Random rnd = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(-99,100);
        }

        //Выводим исходный массив на экран
        System.out.print("Исходный массив:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        int minValue = 0;
        int maxValue = 0;
        for (int i = 0; i < arr.length; i++) {
            minValue = Math.min(minValue, arr[i]);
            maxValue = Math.max(maxValue, arr[i]);
        }

        //Выводим на экран минимальный и максимальный элементы массива
        System.out.println("Минимальный элемент массива: " + minValue);
        System.out.println("Максимальный элемент массива: " + maxValue);

    }
}
