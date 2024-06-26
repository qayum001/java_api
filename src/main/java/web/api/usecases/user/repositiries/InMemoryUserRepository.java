package web.api.usecases.user.repositiries;

import java.util.ArrayList;
import java.util.UUID;

import web.api.models.User;

public interface InMemoryUserRepository {
    User getUser(UUID id);

    void addUser(User user);

    void removeUser(UUID id);

    ArrayList<User> getAll();
}
