import java.util.*;

public class Verification {

    char[] OTP(String email, int len) {
        System.out.print("You OTP is : ");

        long seed = email.hashCode();

        // Using numeric values
        String numbers = "0123456789";

        // Using random method
        Random rndm_method = new Random(seed);

        char[] otp = new char[len];

        for (int i = 0; i < len; i++) {

            otp[i] = numbers.charAt(rndm_method.nextInt(numbers.length()));
        }
        return otp;
    }

}
