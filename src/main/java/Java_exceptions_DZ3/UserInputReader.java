package Java_exceptions_DZ3;

/**
 * UserInputReader - интерфейс, определяющий контракт для чтения пользовательского ввода. Метод
 * readUserData() представляет собой операцию чтения пользовательских данных. Он возвращает объект
 * типа UserData, который содержит информацию о пользователе. Метод может выбрасывать исключение
 * UserDataException, которое представляет ошибку, связанную с данными пользователя.
 */
public interface UserInputReader {

    UserData readUserData() throws UserDataException;
}
