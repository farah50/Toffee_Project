import java.util.Scanner;
import java.util.regex.*;
import java.io.File;
import java.io.FileWriter;

class Registration extends UserData{
    String name;
    String phone;
    String address;
    String confirm;
        //constructor
    public Registration( String e, String pw, String n, String a, String p){
        super(e,pw);
        name = n;
        address = a;
        phone = p;
    }


    // default constructor
    public Registration() {
        super("", "");
        name = "";
        phone = "";
        address = "";
    }

    // Setter & getter
    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String a) {
        address = a;
    }

    public String getAddress() {
        return address;
    }

    public void setPhone(String p) {
        phone = p;
    }

    public String getPhone() {
        return phone;
    }


    public void register(){
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Plaese enter your personal data.");
            System.out.print("Name: ");
            setCustName(input.nextLine());

            System.out.print("Address: ");
            setAddress(input.nextLine());

            boolean validPhone;
            boolean validEmail;
            boolean emailExists;
            boolean strongPw;

            do {
                System.out.print("Phone: ");
                setPhone(input.nextLine());

                // check if the Phone number is valid
                validPhone = valid_phone();

                if (!validPhone) {
                    System.out.println("Invalid Phone number, please try again.");
                }

            } while (!validPhone);


            do {
                System.out.print("E-mail: ");
                setEmail(input.nextLine());

                // check if the email address is valid
                validEmail = validEmail();

                // check if the email address exists in the file
                emailExists = searchForEmail(getEmail());

                if (!validEmail) {
                    System.out.println("Invalid email, please try again.");
                }
                else if (emailExists) {
                    System.out.println("This email already exists, please enter another email.");
                }
            } while (!validEmail || emailExists);


            do {
                System.out.print("Password: ");
                setPassword(input.nextLine());

                String pw = getPassword();
                strongPw = check_strong_password();

                if (pw.length() < 8) {
                    System.out.println("Too short password, please try aagain!");
                }
                else {
                    if (!strongPw) {

                        System.out.println("--> Invalid password, please try again!");
                        System.out.println("It must be 8 characters or more");
                        System.out.println("include letters in upper and lower cases , special characters and digits.");
                    }
                }

            } while (!strongPw);

            System.out.print("Confirm password: ");
            confirm = input.nextLine();

            while (!confirm.equals(getPassword())) {
                System.out.println("Please confirm the password you have entered correctly.");
                System.out.print("Confirm password: ");
                confirm = input.nextLine();
            }

            // save user data to file
            saveUserData();
        }
    }

    public void setCustName(String s) {
    }

    // method to validate email address
    public boolean validEmail() {
        String pattern = "(\\w+)(\\.\\w+)*@(\\w+\\.)(com|edu|org|net|co)";
        Pattern regex = Pattern.compile(pattern);       // Pattern class fetches and returns the regular expression in the  string format
        Matcher regexMatch = regex.matcher(getEmail()); // Matcher class is used to match the input sequence against the whole text
        return regexMatch.matches();
    }

    // method to validate Phone number
    public boolean valid_phone() {
        String pattern = "^(2)?(01){1}[0-9]{9}$";
        Pattern regex = Pattern.compile(pattern);
        Matcher regexMatch = regex.matcher(getPhone());
        return regexMatch.matches();
    }


    // method to search for an email address in the file
    public boolean searchForEmail(String email) {
        try {
            Scanner scanner = new Scanner(new File("information.txt"));
            while (scanner.hasNextLine()) {            // hasNextLine() method Returns true if there is another line in the input of this scanner.
                String[] fields = scanner.nextLine().split("\\|");
                if (fields.length >= 4 && fields[3].trim().equals(email)) {
                    scanner.close();
                    return true;                      // email found in the file
                }
            }
            scanner.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return false;                                // email not found in the file
    }


    // method to check the password strength
    public boolean check_strong_password(){
        String upperCase = ".*[A-Z].*";
        String lowerCase = ".*[a-z].*";
        String numberCase = ".*[0-9].*";
        String specialChar = ".*[@!?@$#&%^*:]+.*";

        Pattern regix1 = Pattern.compile(upperCase);
        Pattern regix2 = Pattern.compile(lowerCase);
        Pattern regix3 = Pattern.compile(numberCase);
        Pattern regix4 = Pattern.compile(specialChar);

        Matcher regix1Match1 = regix1.matcher(getPassword());
        Matcher regix1Match2 = regix2.matcher(getPassword());
        Matcher regix1Match3 = regix3.matcher(getPassword());
        Matcher regix1Match4 = regix4.matcher(getPassword());

        return regix1Match1.matches() && regix1Match2.matches() && regix1Match3.matches() && regix1Match4.matches();
    }

    public void XOR_encrypt_pw(){
        // will be updated
    }


    @Override
    public void saveUserData() {
        try (Scanner input = new Scanner(System.in)) {
            try {
                FileWriter writer = new FileWriter("information.txt", true);
                writer.write(getName() + "|" + getPhone() + "|" + getAddress() + "|" + getEmail() + "|" + getPassword()
                        + "\n");                       // write method used to write the String on the file
                writer.close();
                //System.out.println("registered successfully ^_^");
            }

            catch (Exception e) {                     // catch allows u to define a block of code to be executed, if an error occurs in the try block.

                e.printStackTrace();                  // tool used to handle exceptions and errors
            }

            input.close();
        }
    }


}
