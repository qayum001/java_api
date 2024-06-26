package web.api.usecases.user.interfaces;

import java.util.ArrayList;
import java.util.UUID;

import web.api.models.User;

public interface UserService {
    User getUserById(UUID id);

    void addUser(User user);

    void removeUser(UUID id);

    ArrayList<User> getAll();
} 
