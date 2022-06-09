import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author saad, zaid, meghan
 * @version 1.0
 * @since 2022
 */

public class Demo extends JFrame implements ActionListener {

    public Demo() {
        // Frame 1
        setSize(900, 600);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Frame 2
        JFrame JF2 = new JFrame();
        JF2.setSize(900, 600);
        JF2.setLayout(null);
        JF2.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Frame 3
        JFrame JF3 = new JFrame();
        JF3.setSize(900, 600);
        JF3.setLayout(null);
        JF3.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Frame 4
        JFrame JF4 = new JFrame();
        JF4.setSize(900, 600);
        JF4.setLayout(null);
        JF4.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Font
        Font f = new Font("JetBrains Mono", Font.BOLD, 30);
        Font f2 = new Font("JetBrains Mono", Font.BOLD, 20);
        Font f3 = new Font("JetBrains Mono", Font.BOLD, 12);

        // Header --> New Label For Heading
        JPanel heading = new JPanel();

        // Heading Color with Opacity
        heading.setBackground(new Color(0, 0, 0, 20));

        // Heading Dimensions
        heading.setBounds(0, 0, 900, 100);

        // New Label
        JLabel name = new JLabel("AISSMS LOGIN");

        // Color For the Label
        name.setForeground(Color.BLACK);

        // Font For the Label Text
        name.setFont(f);

        // Adding Font in Label
        heading.add(name);

        // First status label
        JLabel statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setBounds(300, 20, 300, 250);
        statusLabel.setFont(f2);
        add(statusLabel);

        // Login Panel for 1st JFrame
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(null);
        loginPanel.setSize(400, 350);
        loginPanel.setBackground(new Color(0, 0, 0, 60));
        loginPanel.setBounds(250, 175, 400, 350);

        // TextFeild for 1st JFrame
        JTextField username = new JTextField("Enter UserName");
        username.setBounds(50, 50, 300, 50);
        username.setOpaque(false);
        username.setForeground(Color.BLACK);
        username.setBackground(new Color(173, 216, 230));
        loginPanel.add(username);

        // Password Feild for 1st JFrame
        JPasswordField password = new JPasswordField("");
        password.setBackground(new Color(173, 216, 230));
        password.setForeground(Color.BLACK);
        password.setOpaque(false);
        password.setBounds(50, 150, 300, 50);
        loginPanel.add(password);

        // What should happen if user clicks on login button
        JButton LoginButton = new JButton("LOGIN");
        LoginButton.setBounds(50, 250, 100, 50);
        LoginButton.setBackground(new Color(173, 216, 230, 50));

        // Action Listener for button click event on 1st JFrame
        try {

            LoginButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // If button was clicked
                    if (e.getSource() == LoginButton) {
                        // Username and password should be same as displayed in IF-ELSE statement below
                        if (username.getText().equals("meghan") && password.getText().equals("123")) {
                            LoginButton.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e) {
                                    if (e.getSource() == LoginButton) {
                                        // On clicking the login button it will show JFrame - 2
                                        JF2.setVisible(true);
                                        // JF1.hide();
                                        // Setting the background for 2nd JFrame
                                        ImageIcon bgImage = new ImageIcon("gradientImage.jpeg");
                                        Image img = bgImage.getImage();
                                        Image tempImg = img.getScaledInstance(900, 600, Image.SCALE_SMOOTH);
                                        bgImage = new ImageIcon(tempImg);
                                        JLabel background = new JLabel("", bgImage, JLabel.CENTER);
                                        background.setBounds(0, 0, 900, 600);
                                        JF2.add(background);
                                        setVisible(true);

                                        // Label to show "Enter your password" in JFrame - 2
                                        JLabel JL1 = new JLabel("Enter Your Password");
                                        JL1.setBounds(345, 50, 300, 250);
                                        JL1.setFont(f2);
                                        background.add(JL1);

                                        // Password Feild for JFrame - 2
                                        JPasswordField password = new JPasswordField("");
                                        password.setBackground(new Color(173, 216, 230));
                                        password.setForeground(Color.BLACK);
                                        password.setOpaque(false);
                                        password.setBounds(315, 240, 300, 50);

                                        // StatusLabel to show password is Incorrect.
                                        JLabel statusLabel2 = new JLabel("", JLabel.CENTER);
                                        statusLabel2.setBounds(320, 350, 300, 250);
                                        statusLabel2.setFont(f3);
                                        background.add(statusLabel2);

                                        // ResetButton to reset the password
                                        JButton ResetButton = new JButton("Reset Pass");
                                        ResetButton.setBounds(330, 350, 100, 50);
                                        ResetButton.setBackground(new Color(173, 216, 230, 50));
                                        background.add(ResetButton);
                                        // What should happen if user clicks Reset-Button
                                        ResetButton.addActionListener(new ActionListener() {
                                            public void actionPerformed(ActionEvent e) {
                                                if (e.getSource() == ResetButton) {
                                                    statusLabel2.setText("Your password has been reset to: 12345");
                                                    // password.setPassword(12345);
                                                }
                                            }
                                        });
                                        background.add(password);

                                        JButton LoginButton = new JButton("LOGIN");
                                        LoginButton.setBounds(500, 350, 100, 50);
                                        LoginButton.setBackground(new Color(173, 216, 230, 50));
                                        LoginButton.addActionListener(new ActionListener() {
                                            public void actionPerformed(ActionEvent e) {
                                                if (e.getSource() == LoginButton) {
                                                    if (password.getText().equals("12345")) {
                                                        JF3.setVisible(true);

                                                        JLabel JF3Label = new JLabel("AUTHENTICATED", JLabel.CENTER);
                                                        JF3Label.setBounds(300, 20, 300, 250);
                                                        JF3Label.setFont(f);
                                                        JF3.add(JF3Label);

                                                        ImageIcon ThumbsUpImg = new ImageIcon("thumbsUp.png");
                                                        Image tuIMG = ThumbsUpImg.getImage();
                                                        Image temptuImg = tuIMG.getScaledInstance(300, 300,
                                                                Image.SCALE_SMOOTH);
                                                        ThumbsUpImg = new ImageIcon(temptuImg);
                                                        JLabel background2 = new JLabel("", ThumbsUpImg, JLabel.CENTER);
                                                        background2.setBounds(300, 180, 300, 300);
                                                        JF3.add(background2);
                                                        setVisible(true);

                                                    } else {
                                                        statusLabel2.setText("Wrong Password!");
                                                    }
                                                }
                                            }
                                        });
                                        background.add(LoginButton);

                                    }
                                }
                            });
                        } else {
                            statusLabel.setText("Login Failed!");
                        }
                    }
                }
            });

            loginPanel.add(LoginButton);

            JButton CancelButton = new JButton("Cancel");
            CancelButton.setBounds(250, 250, 100, 50);
            CancelButton.setBackground(new Color(173, 216, 230));

            try {
                CancelButton.addActionListener(this);
                CancelButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (e.getSource() == CancelButton) {
                            System.exit(0);
                        }
                    }
                });
                loginPanel.add(CancelButton);
            } catch (Exception e1) {
                System.out.println(e1);
            }
            // BackGround

            ImageIcon bgImage = new ImageIcon("gradientImage.jpeg");
            Image img = bgImage.getImage();
            Image tempImg = img.getScaledInstance(900, 600, Image.SCALE_SMOOTH);
            bgImage = new ImageIcon(tempImg);
            JLabel background = new JLabel("", bgImage, JLabel.CENTER);
            background.add(loginPanel);
            background.add(heading);
            background.setBounds(0, 0, 900, 600);
            add(background);
            setVisible(true);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void actionPerformed(ActionEvent event) {
    }

    public static void main(String[] args) {
        new Demo();
    }
}
