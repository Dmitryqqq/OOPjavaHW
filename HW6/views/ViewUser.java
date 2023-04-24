package HW6.views;

import HW6.controllers.UserController;
import HW6.model.RepositoryFile;
import HW6.model.Repository;
import HW6.model.User;
import java.util.List;
import java.util.Scanner;

public class ViewUser {

    private UserController userController;

    public ViewUser(UserController userController) {
        this.userController = userController;
    }

    public void run() {
        Commands com = Commands.NONE;

        while (true) {
            try {
                String command = prompt("Введите команду: ");
                com = Commands.valueOf(command.toUpperCase());

                if (com == Commands.EXIT) return;
                switch (com) {
                    case CREATE:
                        create();
                        break;
                    case READ:
                        read();
                    case DELETE:
                        delete();
                    case RENUM:
                        renum();    

                        break;
                    case LIST:
                        list();
                        break;
                    case UPDATE:
                        updateUser();
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void updateUser() throws Exception {
        String id = prompt("Идентификатор пользователя: ");
        User user = userController.readUser(id);
        System.out.println(user);
        System.out.println();
        String firstName = prompt("Имя: ");
        String lastName = prompt("Фамилия: ");
        String phone = prompt("Номер телефона: ");
        userController.updateUser(new User(id, firstName, lastName, phone));
    }

    private void create() {
        String firstName = prompt("Имя: ");
        String lastName = prompt("Фамилия: ");
        String phone = prompt("Номер телефона: ");
        userController.saveUser(new User(firstName, lastName, phone));
    }

    private void read() throws Exception {
        String id = prompt("Идентификатор пользователя: ");
        User user = userController.readUser(id);
        System.out.println(user);
    }
  
    public void renum(){
       
        userController.renum();
        
     }

 

    private void list() {
        List<User> allUsers = userController.allUsers();
        for (User user : allUsers) {
            System.out.println(user);
            System.out.println();
        }
    }

    private void delete() throws Exception {
        String id = prompt("Идентификатор пользователя: ");
        List<User> delUser = userController.deleteUser(id);
        userController.delUser(delUser);
        //System.out.println(user);
    }


    private String prompt(String message) {
        Scanner in = new Scanner(System.in, "Cp866");
        System.out.print(message);
        return in.nextLine();
    }


}
