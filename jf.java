import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;

public class jf extends JFrame {
    jf() {
        JFrame jf1 = new JFrame();
        setSize(900, 600);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPasswordField password = new JPasswordField("");
        password.setBackground(new Color(173, 216, 230));
        password.setForeground(Color.BLACK);
        password.setOpaque(false);
        password.setBounds(50, 150, 20, 10);
        jf1.add(password);

        jf1.setVisible(true);

    }

    public static void main(String[] args) {
        jf j = new jf();
    }
}
