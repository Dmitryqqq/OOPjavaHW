package HW6.model;

import java.util.List;

public interface Repository {
    List<User> getAllUsers();
    String CreateUser(User user);

    void updateUser(User user);

    // удаление пользователя
    void delUser(List<User> userd);

    void renum();
    
}
