package seminar5.ref_personal;

import seminar5.ref_personal.controllers.UserController;
import seminar5.ref_personal.model.*;
import seminar5.ref_personal.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("src/main/java/sem_05_personal/users.txt");
        JsonOperation jsonOperation = new JsonOperation("src/main/java/sem_05_personal/users.json");
        Repository repository = new RepositoryFile(fileOperation, jsonOperation, new UserMapper(), new JsonMapper());
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}
