package HomeWork6_OOP;

import HomeWork6_OOP.controllers.NoteController;
import HomeWork6_OOP.model.*;
import HomeWork6_OOP.views.ViewNote;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationJSON("notes.txt");
        Repository repository = new RepositoryJSON(new NotesMapperJSON(), fileOperation);
        NoteController controller = new NoteController(repository);
        ViewNote view = new ViewNote(controller);
        view.run();
    }
}
