abstract class UserData {
    private

    String custName;
    String email;
    String password;

    public

    UserData(String n, String e, String pw) {
    }

    abstract void saveUserData();

    void setCustName(String n) {
        custName = n;
    }

    String getCustName() {
        return custName;
    }

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
