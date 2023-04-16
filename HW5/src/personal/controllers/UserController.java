package personal.controllers;

import personal.model.Repository;
import personal.model.User;

import java.util.List;

public class UserController {

    private final Validat valid = new Validat();
    private final Repository repository;

    public UserController(Repository repository) {
        this.repository = repository;
    }

    public void saveUser(User user) {
        valid.validate(user);
        repository.CreateUser(user);
    }

    public User readUser(String userId) throws Exception {
        List<User> users = repository.getAllUsers();
        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }

        throw new Exception("User not found");
    }

    // Удаление пользователя
    public List<User> deleteUser(String userId) throws Exception {
        List<User> users = repository.getAllUsers();
        for (User user : users) {
            if (user.getId().equals(userId)) {
                users.remove(user);

                return users;
            }
        }

        throw new Exception("User not found");
    }
    public void delUser(List<User> userd){
        //valid.validate(user);
        repository.renumUser(userd);
    }

    public List<User> allUsers() {
        return repository.getAllUsers();

    }
    public void updateUser(User user){
        valid.validate(user);
        repository.updateUser(user);
    }



}
