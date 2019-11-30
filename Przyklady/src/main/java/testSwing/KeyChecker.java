package testSwing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyChecker extends JFrame {
    JLabel keyLabel = new JLabel("Naciœnij dowolny klawisz");

    public KeyChecker() {
        super("Naciœnij klawisz");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        KeyMonitor monitor = new KeyMonitor(this);
        setFocusable(true);
        addKeyListener(monitor);
        add(keyLabel);
        setVisible(true);
    }

    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            System.err.println("Nie potrafiê wczytaæ "
                + "systemowego wygl¹du: " + exc);
        }
    }

    public static void main(String[] arguments) {
        KeyChecker.setLookAndFeel();
        new KeyChecker();
    }
}

class KeyMonitor extends KeyAdapter {
    KeyChecker display;

    KeyMonitor(KeyChecker display) {
        this.display = display;
    }

    public void keyTyped(KeyEvent event) {
        display.keyLabel.setText("" + event.getKeyChar());
        display.repaint();
    }
}
