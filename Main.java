import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String choice;

        
        while (true) {
            System.out.println("----------------welcom-----------------");
            System.out.println("choose what you want from the menue");
            System.out.println("1- Registration");
            System.out.println("2- Login");
            System.out.println("3- View Catalog");
            System.out.println("4- Creat Order");
            System.out.println("5- Exit");
            
            System.out.println("My choice: ");
            choice = input.nextLine();
            
            switch (choice) {
                case "1":
                    Registration r1 = new Registration();
                    r1.register();
                    String recipientEmail = r1.getEmail();
                    int otp = (int) (Math.random() * 900000 + 100000);
                    EmailSender.sendOTP(recipientEmail, Integer.toString(otp));
                    System.out.println("OTP sent to " + recipientEmail);
                    System.out.println("--> registered successfully ^_^");
                    break;
                case "2":
                    Login L1 = new Login();
                    L1.login();
                    break;
                case "3":
                    Catalog c1 = new Catalog();
                    c1.viewCatalog();
                case "5":
                    System.out.println("Exiting program...");
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
    }
} 
