import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class ICE4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ICE4");
        frame.setSize(600,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel topPanel=new JPanel();


        JTextField textField= new JTextField();
        JScrollPane botPanel=new JScrollPane(textField);


        JButton open=new JButton("Open");
        topPanel.add(open);

        JButton exit= new JButton("Exit");
        topPanel.add(exit);

        JButton save = new JButton("Save");

        topPanel.add(save);

        JButton bold= new JButton("Bold");

        topPanel.add(bold);

        frame.setLayout(new BorderLayout());
        frame.add(botPanel,BorderLayout.CENTER);
        frame.add(topPanel,BorderLayout.NORTH);





        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text=textField.getText();
                JFileChooser fileChooser = new JFileChooser();
                if (e.getSource() == save) {

                    fileChooser.setCurrentDirectory(new File(""));
                    int response = fileChooser.showSaveDialog(null);

                    {
                        File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                    }
                }
                try {

                        BufferedWriter fw= new BufferedWriter(new FileWriter(fileChooser.getSelectedFile()));
                        fw.write(text);
                        fw.close();
                        System.out.println("Successfully witten to the file");

                }catch (IOException c){
                    System.out.println("error found");
                    c.printStackTrace();
                }

            }
        });

       open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFileChooser fileChooser = new JFileChooser();
                if (e.getSource() == open) {

                    fileChooser.setCurrentDirectory(new File(""));
                    int response = fileChooser.showSaveDialog(null);

                    {
                        File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                    }
                }


                try {
                    BufferedReader br = new BufferedReader(new FileReader(fileChooser.getSelectedFile()));
                    String line;
                    while ((line=br.readLine())!=null){
                       textField.setText(line);
                    }
                }catch (IOException c){
                    System.out.println("No file here");
                    c.printStackTrace();
                }

            }
        });


        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });

        bold.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setFont(textField.getFont().deriveFont(Font.BOLD, 14f));
            }
        });

        frame.setVisible(true);





    }




}
