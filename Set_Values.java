import java.util.*;
//Using template pattern
public class Set_Values {
    private String Name;
    private String Email;
    private String Password;
    private String Address;
    private String PhoneNumber;
    private String ID;

    public Scanner in = new Scanner(System.in);
    public Set_Values(){}

    public void setName() {
        System.out.println("Please enter your name");
        String na = in.nextLine();
        Name = na;
    }

    public String getName(){
        return Name;
    }

    public void setEmail() {
        System.out.println("Please enter your E-mail");
        String em = in.nextLine();
        Email = em;
    }

    public String getEmail(){
        return Email;
    }


    public void setPassword() {
        System.out.println("Please enter your password");
        String pass = in.nextLine();
        Password = pass;
    }

    public String getPassword(){
        return Password;
    }


    public void setAddress() {
        System.out.println("Please enter your address info");
        String address = in.nextLine();
        Address = address;
    }

    public String getAddress(){
        return Address;
    }


    public void setPhoneNumber() {
        System.out.println("Please enter your Phone Number");
        String pn = in.nextLine();
        PhoneNumber = pn;
    }

    public String getPhoneNumber(){
        return PhoneNumber;
    }


    public void setID() {
        System.out.println("Please enter ID");
        String id = in.nextLine();
        ID = id;
    }

    public String getID(){
        return ID;
    }
}
