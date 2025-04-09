package UI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame {
    public static void main(String[] args) {
        JFrame frame= new JFrame("Login Page");
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(3,2));

        panel.add(new Label("Username"));
        JTextField userField= new JTextField();
        panel.add(userField);

        panel.add(new JLabel("Password"));
        JPasswordField passwordField= new JPasswordField();
        panel.add(passwordField);

        JButton button= new JButton("Login");
        panel.add(button);
        frame.add(panel);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(userField.getText().equals("Trent")&& passwordField.getText().equals("password")){
                    System.out.println("Logged in Successfully ");
                }else {
                    System.out.println("Failed");
                }
            }
        });

        frame.setVisible(true);
    }
}
