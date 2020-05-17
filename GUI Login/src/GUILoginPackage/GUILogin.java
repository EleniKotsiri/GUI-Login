// Graphical User Interface Login (system)
package GUILoginPackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// https://beginnersbook.com/2015/07/java-swing-tutorial/

public class GUILogin implements ActionListener {

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel pwdLabel;
    private static JPasswordField pwdText;
    private static JButton button;
    private static JLabel success;

    public static void main(String args[]) {
        // create panel object
        JPanel panel = new JPanel();
        // create frame object
        JFrame frame = new JFrame();
        // configure frame object
        frame.setSize(350, 200);
        //close frame properly
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);

        // configure panel object
        panel.setLayout(null);

        // create label object for username
        userLabel = new JLabel("User");
        userLabel.setBounds(10, 20,80, 25);
        // add to panel
        panel.add(userLabel);

        // create textfield object for username
        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        // add to panel
        panel.add(userText);

        // create label object for password
        pwdLabel = new JLabel("Password");
        pwdLabel.setBounds(10, 50, 80, 25);
        // add to panel
        panel.add(pwdLabel);

        // create passwordField object for password (passwordField for dots)
        pwdText = new JPasswordField(20);
        pwdText.setBounds(100, 50, 165, 25);
        // add to panel
        panel.add(pwdText);

        // add button object
        button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        // add ActionListerner object to button
        button.addActionListener(new GUILogin());
        // add to panel
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        frame.setVisible(true);

    }

    // add actionEvent to button
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String pwd = pwdText.getText(); // it works here

        // check validity
        if(user.equals("Eleni") && pwd.equals("Kotsiri"))
            success.setText("Login successful!");
        else
            success.setText("Try again :(");
    }
}
