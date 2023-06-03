import java.io.File;
import java.util.Scanner;

class Login extends UserData {

    public
    Scanner input = new Scanner(System.in);
    public Registration r1 = new Registration();
 
    public Login(String e, String pw) {
        super(e, pw);
    }
    public Login(){
    }
    
    public void login() {
        int CountLogin = 3;
        
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
                CountLogin--;
                if (CountLogin < 2) {
                    System.out.println(
                            "--> Note:you have 3 trials to tryto enter your email & passsword, after that you will be denied access to the system.");
                }
                if (CountLogin < 1) {
                    System.out.println("Invalid email or password.");
                    System.out.println("Your denied access to the system.");
                }
            } else {
                System.out.println("Successfull Login ^_^");
                break;
            }

        }
       
    }

    // method to search for the password in the file
    public boolean searchForPw(String pw) {
        try {
            Scanner scanner = new Scanner(new File("information.txt"));
            while (scanner.hasNextLine()) {
                String[] fields = scanner.nextLine().split("\\|");
                if (fields.length >= 4 && fields[4].trim().equals(pw)) {
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
    public void saveUserData() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveUserData'");
    }

}
