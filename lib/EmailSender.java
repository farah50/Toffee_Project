import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;

public class EmailSender {

    public static void sendOTP(String recipientEmail, String otp) {
        // Sender's email address
        String senderEmail = "testin10300@gmail.com";
        // Sender's email password
        String senderPassword = "ABC123abc";

        otp = generateOTP();

        // Mail server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.port", "587");
        // Create a new session with an authenticator
        Authenticator auth = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        };
        Session session = Session.getInstance(properties, auth);

        try {
            // Create a new message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipientEmail));
            message.setSubject("Verification OTP");

            // Generate the email body text with the OTP code
            String body = "Your verification OTP is: " + otp;

            // Set the message body and send the message
            message.setText(body);
            Transport.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    private static String generateOTP() {
        // Generate a random 6-digit number
        Random random = new Random();
        int otp = 100000 + random.nextInt(900000);
        return Integer.toString(otp);
    }
}