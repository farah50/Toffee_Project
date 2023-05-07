import java.util.*;

public class Order {
    private String ID;
    private String Address;
    private String Phone_Number;
    private int Loyalty_points;
    private int Total_Cost;

    public Scanner in = new Scanner(System.in);
    public Order(){}

    //This function is to creatiing an order.
    public void createOrder(){
        System.out.println("Order creation, please choose your items");
    }

    //This function is to cancelling an order.
    public void cancelOrder(){
        System.out.println("Are you sure that you want to canel this order?");
        System.out.println("Please type (Yes or no)");
        String choice = in.next();

        if(choice.equals("yes"))
            System.out.println("Order cancelled");
        //order will be deleted from database.
    }

    //This function to reorder a previous order
    public void reOrder(){
        System.out.println("Please choose which order you want to order again?");
        //User should choose from order history
    }


    public void setLoyaltyPoint(){
        System.out.println("Please enter number points that you want to add to this user?");
        int lp = in.nextInt();
        this.Loyalty_points = lp;
    }

    public int getLoyaltyPoint (){
        return Loyalty_points;
    }

    /*public int confirmOrder (int p , String v){

    }

    public int calcTotalCost(){

    }*/
}

