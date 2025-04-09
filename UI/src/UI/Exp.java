package UI;
import javax.swing.*;
public class Exp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Website");
        frame.setSize(500,500);
        frame.setLayout(null);

        JButton button = new JButton("Website Click");
        button.setBounds(150,200,220,50);

        frame.add(button);
        frame.setVisible(true);
    }
}
