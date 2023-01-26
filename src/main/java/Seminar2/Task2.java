package Seminar2;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args)
    {
        Task2 str = new Task2();
        String s1,s2;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        s1 = in.nextLine();
        //Trim all the spaces of the string using replaceAll method
        s2 = s1.replaceAll("\\s","");
        str.Compression(s2);
    }


    //Create a Java Method Compression to compress the string
    public static String Compression(String s)
    {
        int count = 1;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < s.length()-1 ; i++)
        {
            if (s.charAt(i) == s.charAt(i - 1))
            {
                count++;
            }
            else
            {
                sb.append(s.charAt(i - 1));
                sb.append(count);
                count = 1;
            }
        }

        if (s.length() > 1)
        {
            if (s.charAt(s.length() - 1) == s.charAt(s.length() - 2))
            {
                count++;
            }
            else
            {
                sb.append(s.charAt(s.length() - 2));
                sb.append(count);
                count = 1;
            }
            sb.append(s.charAt(s.length() - 1));
            sb.append(count);
        }
        s = sb.toString();
        System.out.println("Сжатая строка:" + "\n" +s);
        return s;
    }
}
