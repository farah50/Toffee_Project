import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Order o = new Order();
        Scanner input = new Scanner(System.in);
        String choice;

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

                 int length = 4;
                 String email = r1.getEmail();
                 Verification v1 = new Verification();
                 System.out.println(v1.OTP(email, length));
                 System.out.println("--> registered successfully ^_^");
                 main(args);
                 break;
             case "2":
                 Login L1 = new Login();
                 L1.login();
                 main(args);
                 break;
             case "3":
                 Catalog c1 = new Catalog();
                 c1.viewCatalog();
                 main(args);
                 break;
             case "4":
                 o.createOrder();
                 main(args);
                 break;
             case "5":
                 System.out.println("Exiting program...");
                 input.close();
                 System.exit(0);
                 main(args);
                 break;
             default:
                 System.out.println("Invalid choice, please try again.");
                 main(args);
                 break;
         }
    }
}
