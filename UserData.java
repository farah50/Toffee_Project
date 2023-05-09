abstract class UserData {
    private

    String email;
    String password;

    public

    UserData( String e, String pw) {
    }

    abstract void saveUserData();

    void setEmail(String e) {
        email = e;
    }

    String getEmail() {
        return email;
    }

    void setPassword(String pw) {
        password = pw;
    }

    String getPassword() {
        return password;
    }
}
