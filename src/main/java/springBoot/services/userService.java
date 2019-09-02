package springBoot.services;

import org.springframework.stereotype.Service;
import springBoot.models.User;

import java.util.List;

public interface userService {
    public List<User> findAllUsers();

    public String addUser(User user);

    public String updateUser(User user);

    public User findUsersById(int id);
}
