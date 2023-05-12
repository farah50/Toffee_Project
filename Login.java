import java.io.File;
import java.io.File;

class Login extends UserData {

    public

    Registration r1 = new Registration();

    Login(String e, String pw) {
        super(e, pw);
    }

    public Login() {
    }

    void login() {
        int CountLogin = 3;

        try (Scanner input = new Scanner(System.in)) {
            while (CountLogin > 0) {

                System.out.print("Enter Email: ");
                setEmail(input.nextLine());

                System.out.print("Password: ");
                setPassword(input.nextLine());

                if (!searchForPw(getPassword()) && (!r1.searchForEmail(getEmail()))) {
                    System.out.println("Invalid email and password.");
                    CountLogin--;
                } else if (!searchForPw(getPassword()) && r1.searchForEmail(getEmail())) {
                    System.out.println("Invalid password.");

                    CountLogin--;
                } else if (searchForPw(getPassword()) && (!r1.searchForEmail(getEmail()))) {
                    System.out.println("Invalid email or password.");
                    System.out.println("Your denied accses to the system.");
                    CountLogin--;
                    if (CountLogin == 2) {
                        System.out.println("--> Note:you have 3 trial to try passsword after that you will denied.");
                    }
                } else {
                    System.out.println("Successfull Login ^_^");
                    break;
                }

            }
        }
    }

    // method to search for the password in the file
    boolean searchForPw(String pw) {
        try {
            Scanner scanner = new Scanner(new File("information.txt"));
            while (scanner.hasNextLine()) {
                String[] fields = scanner.nextLine().split("\\|");
                if (fields.length >= 5 && fields[4].trim().equals(pw)) {
                    scanner.close();
                    return true; // password found in the file
                }
            }
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false; // password not found in the file

    }

    // unimplemented method
    @Override
    void saveUserData() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveUserData'");
    }

}
