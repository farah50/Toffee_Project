
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {
    private String email; // Email to send to
    private String OTP;

    // constructor
    SendMail(String email, String otp) {
        this.email = email;
        this.OTP = otp;
    }

    public void send() {

        // Recipient's email ID needs to be mentioned.
        String send_to = email;

        // Sender's email ID needs to be mentioned
        // String sent_from = "Add your email"; //the OTP emails will be sent from this
        // email

        String sent_from = "testin10300@gmail.com";

        // Assuming you are sending email from through gmails smtp
        String host = "smtp.gmail.com";

        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        // Get the Session object.// and pass username and password
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {

                return new PasswordAuthentication("testin10300@gmail.com", "kkzlezxcyxfpzooj"); // app password

            }

        });

        // Used to debug SMTP issues
        // session.setDebug(true);

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(sent_from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(send_to));

            // Set Subject: header field
            message.setSubject("OTP");

            // Now set the actual message
            message.setText("your OTP is:  " + OTP);

            System.out.println("sending OTP...");
            // Send message
            Transport.send(message);
            System.out.println("--> OTP Sent Successfully");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}

// kkzlezxcyxfpzooj
