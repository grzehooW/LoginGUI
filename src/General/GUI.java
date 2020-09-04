package General;

import javax.swing.*;
import java.awt.*;

public class GUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Login Frame");

        FlowLayout layout = new FlowLayout(FlowLayout.LEFT, 10, 20);

        frame.setLayout(layout);

        frame.add(new JLabel("User Name:"));
        frame.add(new JTextField(10));
        frame.add(new JLabel("Password: "));
        frame.add(new JPasswordField(10));
        frame.add(new JButton("Submit"));
        frame.add(new JButton("Exit"));



        frame.setTitle("Login");
        frame.setSize(250, 210);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);






    }
}
