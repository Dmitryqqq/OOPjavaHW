package personal.model;

import java.util.List;

public interface Repository {
    List<User> getAllUsers();
    String CreateUser(User user);

    void updateUser(User user);

    // удаление пользователя
    void renumUser(List<User> userd);
}
