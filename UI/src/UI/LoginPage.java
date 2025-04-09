package UI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage {
    public static void main(String[] args) {
        JFrame frame =new JFrame("Login Page");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JButton button = new JButton("Login");
        frame.getContentPane().add(button);
        button.setFont(new Font("Arial",Font.BOLD,17));
        button.setBackground(Color.CYAN);
        button.setForeground(Color.YELLOW);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button got Clicked");
            }
        });



        frame.setVisible(true);

    }
}
