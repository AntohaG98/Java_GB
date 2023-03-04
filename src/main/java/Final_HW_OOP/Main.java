package Final_HW_OOP;

import Final_HW_OOP.controllers.AdapterController;
import Final_HW_OOP.controllers.IController;
import Final_HW_OOP.controllers.NoteController;
import Final_HW_OOP.loggers.ILogger;
import Final_HW_OOP.loggers.Logger;
import Final_HW_OOP.model.*;
import Final_HW_OOP.views.*;

public class Main {
    public static void main(String[] args) {
        ILogger logger = new Logger("log.txt");
        IFileOperation fileOperation = new FileOperation("notes.txt");
        IRepository repository = new Repository(new NotesMapperJSON(), fileOperation);
        IController controller = new AdapterController(repository);
        IViewOperations viewOperations = new ViewOperations(controller);
        IViewOperations viewOperationsWithLog = new ViewOperationWithLog(viewOperations, logger);
        IViewNote view = new ViewNote(viewOperationsWithLog);
        view.run();
    }
}
