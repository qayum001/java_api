package web.api.infrastructure.Services.User;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.stereotype.Service;

import web.api.models.User;
import web.api.usecases.user.interfaces.UserService;
import web.api.usecases.user.repositiries.InMemoryUserRepository;

@Service
public class UserServiceImpl implements UserService {

    private InMemoryUserRepository repository;

    
    public UserServiceImpl(InMemoryUserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User getUserById(UUID id) {
        return repository.getUser(id);
    }

    @Override
    public void addUser(User user) {
        repository.addUser(user);
    }

    @Override
    public void removeUser(UUID id) {
        repository.removeUser(id);
    }

    @Override
    public ArrayList<User> getAll() {
        return repository.getAll();
    }
    
}
