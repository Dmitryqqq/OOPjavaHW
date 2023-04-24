package HW6;

import HW6.controllers.UserController;
import HW6.model.FileOperation;
import HW6.model.FileOperationImpl;
import HW6.model.Repository;
import HW6.model.RepositoryFile;
import HW6.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("Notes.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}
