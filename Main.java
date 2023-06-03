import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        String choice;

        System.out.println("----------------welcom-----------------");
        System.out.println("choose what you want from the menu");
        System.out.println("1- Registration");
        System.out.println("2- Login");
        System.out.println("3- View Catalog");
        System.out.println("4- Creat Order");
        System.out.println("5- Exit");

        System.out.print("My choice: ");
        choice = input.nextLine();

        switch (choice) {
            case "1":

                Registration r1 = new Registration();
                r1.call_regesteration_OTP();
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
                Order o = new Order();
                o.createOrder();
                main(args);
                break;
            case "5":
                System.out.println("Exiting program...");
                input.close();
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice, please try again.");
                main(args);
                break;
        }

    }
}
