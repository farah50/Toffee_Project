import java.util.Scanner;
import java.util.regex.*;
import java.io.File;
import java.io.FileWriter;

class Registration extends UserData{
    private  
        String name; 
        String phone;
        String address; 

    public 
        //constructor
        Registration( String e, String pw, String n, String a, String p){        
            suber(e, pw);
            name = n
            Address = a;
            Phone = p;         
        }
    
        // default constructor
        Registration() {
            super("", "");
            name = "";
            phone = "";
            address = "";
        }
    
        // Setter & getter
        void setName(String n) {
            name = n;
        }

        String getName() {
            return name;
        }

        void setAddress(String a) {
            address = a;
        }

        String getAddress() {
            return address;
        }

        void setPhone(String p) {
            phone = p;
        }

        String getPhone() {
            return phone;
        }


        void register(){
              try (Scanner input = new Scanner(System.in)) {
                   System.out.println("Plaese enter your personal data.");
                   System.out.print("Name: ");
                   setCustName(input.nextLine());

                   System.out.print("Phone: ");
                   setPhone(input.nextLine());

                   System.out.print("Address: ");
                   setAddress(input.nextLine());
                   
                   boolean validPhone;
                   boolean validEmail;
                   boolean emailExists;
                  
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
                     
                    System.out.print("Password: ");
                    setPassword(input.nextLine());

                    // save user data to file
                    saveUserData();
               }       
        }
    
       // method to validate email address
       public boolean validEmail() {
            String pattern = "(\\w+)(\\.\\w+)*@(\\w+\\.)(com|edu|org|net|co)";
            Pattern regex = Pattern.compile(pattern);       // Pattern class fetches and returns the regular expression in the  string format                                           
            Matcher regexMatch = regex.matcher(getEmail()); // Matcher class is used to match the input sequence against the whole text                       
            return regexMatch.matches();
       }
    
      // method to validate Phone number
       boolean valid_phone() {
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

        
        void enter_strong_password(){
            // will be updated
        }
    
        void XOR_encrypt_pw(){
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
                    System.out.println("registered successfully ^_^");
                }

                catch (Exception e) {                     // catch allows u to define a block of code to be executed, if an error occurs in the try block.
                                      
                    e.printStackTrace();                  // tool used to handle exceptions and errors
                }

                input.close();
            }
        }  
    

}


class Login{
    private 
        String Email;
        String Password;
    
    public
        Login(String Pw, String E){
            Password = Pw;
            Email = E;    
        }

        boolean search_for_pw(){
            // will be updated
        }

        boolean search_for_email(){
            // will be updated
        }

        void change_pw(){
            // will be updated if there is a time
        }

        String pring_CustName(){
            // will be updated if there is a time
        }

}


