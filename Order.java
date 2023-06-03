import java.io.IOException;
import java.util.*;

public class Order {
    private int ID;
    private String Address;
    private String Phone_Number;
    private int Loyalty_points;
    private float Total_Cost = 0;
    
    public Scanner in = new Scanner(System.in);
    public Catalog c = new Catalog();

    //public Scanner in = new Scanner(System.in);
    public Order(){}

    //This function is to creatiing an order.
    public void createOrder() throws IOException {
        System.out.println("--> Order creation, please choose your items");
        c.viewCatalog();
        addItemsToShoppingCart();
        System.out.println("--> Your total cost is = " + getTotalCost());
    }
    public void addItemsToShoppingCart(){
        System.out.println("--> How many items do you want to buy ");
        int items;
        items = in.nextInt();
        System.out.println("Please insert their IDS");
        int ShoppingCart[] = new int[items];
        for (int i = 0 ; i<items ; i++){
            if(items <= 50){
                ID = in.nextInt();
                ShoppingCart[i] = ID;
                if (ID == 1){
                    Total_Cost += 250;
                } else if (ID == 2) {
                    Total_Cost += 300;
                } else if (ID == 3) {
                    Total_Cost += 200;
                } else if (ID == 4) {
                    Total_Cost += 500;
                }else if (ID == 5) {
                    Total_Cost += 20;
                else System.out.println("Invalid ID");

            }
        }
        for (int i = 0 ; i<items ; i++){
            if (ShoppingCart[i] == 1){
                System.out.println("ID is: " + ShoppingCart[i] + " Chocolate Cake");
            } else if (ShoppingCart[i] == 2) {
                System.out.println("ID is: " + ShoppingCart[i] + " Red Velvet Cake");
            } else if (ShoppingCart[i] == 3) {
                System.out.println("ID is: " + ShoppingCart[i] + " Strawberry Cake");
            } else if (ShoppingCart[i] == 4) {
                System.out.println("ID is: " + ShoppingCart[i] + " Galaxy Cake");
            }else if (ShoppingCart[i] == 5) {
                System.out.println("ID is: " + ShoppingCart[i] + " Candy cotton");
            }else System.out.println("Invalid ID");
        }
    }

    public float getTotalCost() {
        return Total_Cost;
    }
}

