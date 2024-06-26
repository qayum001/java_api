package web.api.models;

import java.util.UUID;

public class User extends Entity {

    private String email;
    private String fullName;
    private String password;

    public User(UUID id, String email, String fullName, String password) {
        super(id);

        this.email = email;
        this.fullName = fullName;
        this.password = password;
    }
    
    public String getEmail() {
        return email;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void updatePassword(String password) {
        if (isPasswordSuitable(password))
            this.password = password;
    }

    private boolean isPasswordSuitable(String password) {
        if (password == null || password.length() < 5 || password != this.password)
            return false;

        return true;
    }
}
