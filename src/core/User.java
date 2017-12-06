package core;

class User {
    private String username, password; // should the password be a string?
    private boolean isAdmin;

    User(String username, String password, boolean isAdmin) {
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    String getUsername() { return username; }

    void setUsername(String username) { this.username = username; }

    String getPassword() { return password; }

    void setPassword(String password) { this.password = password; }

    boolean isAdmin() { return isAdmin; }

    void setAdmin(boolean admin) { isAdmin = admin; }
}
