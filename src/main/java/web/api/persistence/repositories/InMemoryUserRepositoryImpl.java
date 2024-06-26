package web.api.persistence.repositories;

import java.util.ArrayList;
import java.util.UUID;

import web.api.models.User;
import web.api.persistence.storage.UserStorage;
import web.api.usecases.user.repositiries.InMemoryUserRepository;

public class InMemoryUserRepositoryImpl implements InMemoryUserRepository {
    
    private UserStorage storage; 
    public InMemoryUserRepositoryImpl(UserStorage storage) {
        this.storage = storage;
    }

    @Override
    public User getUser(UUID id) {
        for (User i : storage.getUsers()) {
            if (i.getId() == id)
                return i;
        }

        throw new RuntimeException("User not found");
    }

    @Override
    public void addUser(User user) {
        storage.addUser(user);
    }

    @Override
    public void removeUser(UUID id) {
        for (User i : storage.getUsers()) {
            if (i.getId() == id) {
                storage.deleteUser(i);
                return;
            }
        }

        throw new RuntimeException("User not found");
    }

    @Override
    public ArrayList<User> getAll() {
        return storage.getUsers();
    }
    
}
