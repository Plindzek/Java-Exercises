/* Rozwi�zanie dla rozdzia� 9., �wiczenie 2. */



import javax.swing.*;

public class Password extends JFrame {
    PasswordFrame pass = new PasswordFrame();
    
    public Password() {
        super("Popros o haslo");
        setSize(540, 80);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pass.setVisible(true);
}

    public static void main(String[] arguments) {
        Password ask = new Password();
    }
}

class PasswordFrame extends JFrame {
    public PasswordFrame() {
        super("Has�o");
        setSize(210, 130);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel pane = new JPanel();
        JLabel usernameLabel = new JLabel("Nazwa uzytkownika: ");
        JTextField username = new JTextField(8);
        JLabel passwordLabel = new JLabel("Haslo: ");
        JPasswordField password = new JPasswordField(8);
        pane.add(usernameLabel);
        pane.add(username);
        pane.add(passwordLabel);
        pane.add(password);
        setContentPane(pane);
        setVisible(false);
    }
}
