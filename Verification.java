
import java.util.*;
import java.util.Scanner;

public class Verification {

    Scanner input = new Scanner(System.in);

    String OTP(String email, int len) {

        int emailHashCode = email.hashCode(); // hashCode() is a built-in method, generate a unique integer value

        // Using numeric values
        String numbers = "0123456789";

        // Using random method
        Random random = new Random(emailHashCode);

        char[] otp = new char[len];

        for (int i = 0; i < len; i++) {

            otp[i] = numbers.charAt(random.nextInt(numbers.length()));
        }
        return new String(otp);

    }

    String sendOtpToEmail(String email) {
        int length = 6;
        System.out.print("email: ");
        System.out.println(email);
        String OTP = OTP(email, length);
        SendMail m1 = new SendMail(email, OTP);
        m1.send();
        return OTP;
    }

    boolean Valid_OTP(String s) {
        System.out.print("Enter OTP: ");
        String userOTP = input.nextLine();
        return userOTP.equals(s);
    }

}
