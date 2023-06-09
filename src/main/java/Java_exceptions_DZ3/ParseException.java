package Java_exceptions_DZ3;

/**
 * ParseException - пользовательское исключение, которое наследуется от класса Exception. Оно
 * используется для обработки ошибок, связанных с парсингом данных пользователя. Конструктор класса
 * принимает сообщение об ошибке и передает его в конструктор базового класса Exception с помощью
 * ключевого слова super.
 */
public class ParseException extends Exception {

    public ParseException(String message) {
        super(message);
    }

}
