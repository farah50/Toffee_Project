class Registration {
    private  
        String CustName;
        String Email;
        String Password;
        String Phone;
        String Address; 

    public    
        Registration( String PW, String N, String A, String E, String P){
            Password = PW;
            CustName = N;
            Address = A;
            Email = E;
            Phone = P;         
        }

        void register(){
            // will be updated
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


