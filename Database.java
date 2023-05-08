import java.util.Scanner;
import java.io.File;

public class Database extends UserData {
    private String address;
    String phone;

    public

    // constructor
    Database(String n, String e, String pw, String a, String p) {
        super(n, e, pw);
        address = a;
        phone = p;
    }

    // default constructor
    Database() {
        super("", "", "");
        phone = "";
        address = "";
    }

    @Override
    void saveUserData() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveUserData'");
    }

}
