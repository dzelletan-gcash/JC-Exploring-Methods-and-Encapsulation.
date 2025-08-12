package org.example;

public class User {
    private String password;

    public User(String password) {
        setPassword(password);
    }

    public String getPassword() {
        if (password == null) {
            return "********";
        }
        return "*".repeat(password.length());
    }

    public void setPassword(String password) {
        if (password.length() >= 8) {
            this.password = password;
        } else {
            System.out.println("Error: Password must be at least 8 characters long.");
        }
    }

    public static void main(String[] args) {
        User user = new User("pass");
        System.out.println("Current masked password: " + user.getPassword());

        System.out.println("Attempting to set short password 'pass'...");
        user.setPassword("pass");
        System.out.println("Current masked password: " + user.getPassword());

        System.out.println("Attempting to set valid password 'secure_password_123'...");
        user.setPassword("secure_password_123");
        System.out.println("Current masked password: " + user.getPassword());
    }
}