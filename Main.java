public class Main {
    public static void main(String[] args) {
        Registration r1 = new Registration();
        Login L1 = new Login();
        
        String choice;
        System.out.println("----------------welcom-----------------");
        System.out.println("choose what you want from the menue");
        System.out.println("1- Registration");
        System.out.println("2- Login");
        System.out.println("3- View Catalog");
        System.out.println("4- Creat Order");
        System.out.println("5- Exit");
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("My choice: ");
            choice = input.nextLine();
        }
        if (choice == "1") {
            r1.register();
        } 
        else if (choice == "2") {
            L1.login();
        } 
        else if (choice == "3") {
            // view catalog
        }
        else if (choice == "4") {
            // creat order
        } 
        else if (choice == "5") {
            // Exit
        }
    }
    
