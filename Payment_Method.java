import java.util.*;
//This class is for choosing a payment way, either cash or through smart wallets.
public class Payment_Method extends Set_Values{
    public Payment_Method(){}
    public Scanner in = new Scanner(System.in);

    public boolean payViaSmrtWallet(){
        System.out.println("Please enter your card number");
        String SW = in.nextLine();
        return true;
    }

    public void cashOnDelivry(){
        setAddress();
        getAddress();
        setPhoneNumber();
        getPhoneNumber()
    }
}
