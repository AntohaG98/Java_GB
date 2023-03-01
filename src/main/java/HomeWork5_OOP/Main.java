package HomeWork5_OOP;

import HomeWork5_OOP.controllers.UserController;
import HomeWork5_OOP.model.*;
import HomeWork5_OOP.utils.Validate;
import HomeWork5_OOP.views.ViewUser;

public class Main {

    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationJSON("users.txt");
        Repository repository = new RepositoryFileJSON(fileOperation, new UserMapperJSON());
        Validate validate = new Validate();
        UserController controller = new UserController(repository,validate);
        ViewUser view = new ViewUser(controller, validate);
        view.run();
    }
}