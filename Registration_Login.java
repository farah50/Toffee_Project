import java.util.Scanner;

class Registration extends UserData{
    private  
        String phone;
        String address; 

    public 
        //constructor
        Registration( String n, String e, String pw, String a, String p){        
            suber(n, e, pw);
            Address = a;
            Phone = p;         
        }
    
         // default constructor
        Registration() {
            super("", "", "");
            phone = "";
            address = "";
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
            }
        }
        
        void enter_strong_password(){
            // will be updated
        }

        String hide_Pw(){
            // will be updated
        }

        void XOR_encrypt_pw(){
            // will be updated
        }

        void valid_email(String& Email){
           // will be updated
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


