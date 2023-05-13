abstract class UserData {

    String email;
    String password;

    public UserData( String e, String pw) {
    }

    public abstract void saveUserData();

    public void setEmail(String e) {
        email = e;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String pw) {
        password = pw;
    }

    public String getPassword() {
        return password;
    }
}
