package Java_exceptions_DZ3;
import java.io.IOException;
import java.util.Scanner;

/**
 * Класс `Main` является точкой входа в программу, где создаются экземпляры классов для чтения
 * пользовательского ввода и записи данных, а затем вызываются соответствующие методы для обработки
 * пользовательских данных и записи их в файл.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UserInputReader inputReader = new UserInputConsoleReader(scanner);
        UserDataFileWriter fileWriter = new UserDataFileWriterImpl();

        try {
            UserData userData = inputReader.readUserData();
            fileWriter.writeUserData(userData);
        } catch (UserDataException | IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
