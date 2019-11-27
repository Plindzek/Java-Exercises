package testSwing;

import java.awt.*;
import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;

public class CardFrame extends JFrame {
	public CardFrame() {
		super("Kalkulator spalania");
		setBounds(200, 10, 640, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyCards wiz = new MyCards();
		add(wiz);
		setVisible(true);
		

	}

	public static void main(String[] arguments) {
		CardFrame surv = new CardFrame();

	}

}
