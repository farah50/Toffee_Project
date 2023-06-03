import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SignUpForm extends JFrame {
    private JTextField snnField;
    private JTextField nameField;
    private JTextField phoneField;
    private JTextField stateField;
    private JTextField zipCodeField;
    private JTextField streetField;
    private JTextField cityField;

    public SignUpForm() {
        setTitle("Customer Sign-up");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(8, 2));

        JLabel snnLabel = new JLabel("SNN:");
        snnField = new JTextField();
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        JLabel phoneLabel = new JLabel("Phone:");
        phoneField = new JTextField();
        JLabel stateLabel = new JLabel("State:");
        stateField = new JTextField();
        JLabel zipCodeLabel = new JLabel("Zip Code:");
        zipCodeField = new JTextField();
        JLabel streetLabel = new JLabel("Street:");
        streetField = new JTextField();
        JLabel cityLabel = new JLabel("City:");
        cityField = new JTextField();

        JButton signUpButton = new JButton("Sign Up");
        signUpButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    signUp();
                } catch (ClassNotFoundException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        });

        mainPanel.add(snnLabel);
        mainPanel.add(snnField);
        mainPanel.add(nameLabel);
        mainPanel.add(nameField);
        mainPanel.add(phoneLabel);
        mainPanel.add(phoneField);
        mainPanel.add(stateLabel);
        mainPanel.add(stateField);
        mainPanel.add(zipCodeLabel);
        mainPanel.add(zipCodeField);
        mainPanel.add(streetLabel);
        mainPanel.add(streetField);
        mainPanel.add(cityLabel);
        mainPanel.add(cityField);
        mainPanel.add(signUpButton);

        getContentPane().add(mainPanel);
    }

    private void signUp() throws ClassNotFoundException {
        String snn = snnField.getText();
        String name = nameField.getText();
        String phone = phoneField.getText();
        String state = stateField.getText();
        String zipCode = zipCodeField.getText();
        String street = streetField.getText();
        String city = cityField.getText();

        // Validate the input fields if needed

        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String url = "jdbc:sqlserver://localhost:1433;databaseName=BankSystem;integratedSecurity=true;";
            Connection connection = DriverManager.getConnection(url);
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO customer (SNN, Name, Phone, state, zip_code, street, City) VALUES (?, ?, ?, ?, ?, ?, ?)");
            statement.setString(1, snn);
            statement.setString(2, name);
            statement.setString(3, phone);
            statement.setString(4, state);
            statement.setString(5, zipCode);
            statement.setString(6, street);
            statement.setString(7, city);
            statement.executeUpdate();

            JOptionPane.showMessageDialog(this, "Sign up successful!");
            clearFields();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error occurred. Please try again.");
        }
    }

    private void clearFields() {
        snnField.setText("");
        nameField.setText("");
        phoneField.setText("");
        stateField.setText("");
        zipCodeField.setText("");
        streetField.setText("");
        cityField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                SignUpForm form = new SignUpForm();
                form.setVisible(true);
            }
        });
    }
}
