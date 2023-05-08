import java.util.Scanner;
import java.io.File;

public class Database extends UserData {
    private String address;
    String phone;

    public

    // constructor
    Database(String n, String e, String pw, String a, String p) {
        super(n, e, pw);
        address = a;
        phone = p;
    }

    // default constructor
    Database() {
        super("", "", "");
        phone = "";
        address = "";
    }

    @Override
    void saveUserData() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveUserData'");
    }

}

// import java.util.Scanner;

// class Registration_Login {
// public static void main(String[] args) {
// Registration registration = new Registration("John Doe",
// "johndoe@example.com", "password123", "123 Main St.",
// "555-1234");
// registration.register();
// }
// }

// abstract class UserData {
// private String custName;
// String email;
// String password;

// public UserData(String n, String e, String pw) {
// }

// public abstract void saveUserData();

// void setCustName(String n) {
// custName = n;
// }

// String getCustName() {
// return custName;
// }

// void setEmail(String e) {
// email = e;
// }

// String getEmail() {
// return email;
// }

// void setPassword(String pw) {
// password = pw;
// }

// String getPassword() {
// return password;
// }
// }

// class Registration extends UserData {
// private String phone;
// String address;

// public Registration(String n, String e, String pw, String a, String p) {
// super(n, e, pw);
// address = a;
// phone = p;
// }

// // Registration(); // default constractor

// void register() {
// try (Scanner input = new Scanner(System.in)) {
// System.out.println("Plaese enter your personal data.");
// System.out.println("Name: ");
// setCustName(input.nextLine());

// System.out.println("Phone: ");
// setPhone(input.nextLine());

// System.out.println("Address: ");
// setAddress(input.nextLine());
// }

// }

// void valid_email(String email) {

// }

// void setPhone(String p) {
// phone = p;
// }

// String getPhone() {
// return phone;
// }

// void setAddress(String a) {
// address = a;
// }

// String getAddress() {
// return phone;
// }

// void enter_strong_password() {
// // to be update
// }

// // String hide_Pw() {
// // // to be update
// // }

// void XOR_encrypt_pw() {
// // to be update
// }

// @Override
// public void saveUserData() {
// // TO DO Auto-generated method stub
// throw new UnsupportedOperationException("Unimplemented method
// 'saveUserData'");
// }

// @Override
// public void saveUserData() {
//
// throw new UnsupportedOperationException("Unimplemented method
// 'saveUserData'");
// }

// }

// class Login{

// public
// Login(String pw, String e){
// super("", pw, e);
// }

// boolean search_for_pw(){
// // to be update
// }

// boolean search_for_email(){
// // to be update
// }

// void change_pw(){
// // to be update if there a time
// }

// String pring_CustName(){
// // to be update if there a time
// }

// }
