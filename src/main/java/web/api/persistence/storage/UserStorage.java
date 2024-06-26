package web.api.persistence.storage;

import java.util.ArrayList;

import web.api.models.*;

public class UserStorage {
    private ArrayList<User> users = new ArrayList<>();

    public ArrayList<User> getUsers() {
        return this.users;
    }

    public void addUser(User user) {
        System.out.println("name: " + user.getFullName());
        this.users.add(user);
    }

    public void deleteUser(User user) {
        this.users.remove(user);
    }
}