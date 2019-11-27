package testSwing;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TitleBar extends JFrame implements ActionListener, FocusListener, KeyListener, MouseListener {
    
    JButton przycisk2;
    JButton przycisk3;
    JLabel plus, equals;
    JTextField pole1, pole2, suma, messageBox;
    String tekst;
    
    public TitleBar() {
        super("Pasek tytu³u");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        pole1 = new JTextField("", 10);
        plus = new JLabel("+");
        pole2 = new JTextField("", 10);
        equals = new JLabel("=");
        suma = new JTextField("", 10); 
        messageBox = new JTextField(tekst,  15);
        przycisk2 = new JButton("oblicz");
        przycisk3 = new JButton("quit");
        									// 1. ustawiamy nas³uchiwanie akcji dla przycisków
        przycisk2.addActionListener(this);
        przycisk3.addActionListener(this);
        pole1.addKeyListener(this);        
        przycisk3.addMouseListener(this);
        FlowLayout flow = new FlowLayout();
        setLayout(flow);
        add(przycisk2);
        add(przycisk3);
        add(pole1);
        add(plus);
        add(pole2);
        add(equals);
        add(suma);
        add(messageBox);
        setBounds(523,264,320,240);
        getContentPane().setBackground(Color.cyan
        		);
        setVisible(true);
        
    }

	@Override
	public void keyTyped(KeyEvent e) {
	}
	@Override
	public void keyPressed(KeyEvent e) {
		Object key = e.getKeyChar();
		System.out.println("wpisa³eœ " + key);
	}
	@Override
	public void keyReleased(KeyEvent e) {
	}    
    
	@Override
    public void focusLost(FocusEvent e) {
		}
	@Override
	public void focusGained(FocusEvent e) {
		}
	
	public void actionPerformed(ActionEvent evt) { 		//metoda wywo³ywana, gdy na którymœ przycisku wykona siê zdarzenie akcji
        Object source = evt.getSource();				//tworzymy obiekt oraz metod¹ getsource otrzymujemy referencjê do obiektu wywo³ujacego zdarzenie
        Object source1 = evt.getActionCommand();

        if (source == przycisk2) {
        	
        	try {
        		float total = Float.parseFloat(pole1.getText()) + Float.parseFloat(pole2.getText());
        		suma.setText("" + total);
        	} catch (NumberFormatException e1) {
        		pole1.setText("0");
        		pole2.setText("0");
        		suma.setText("0");
        	}    	
            
        } else if (source == przycisk3) {
        	System.exit(0);
        }
        repaint();										//niby potrzebna do odœwie¿enia okna po zmianie tytu³u					
    }
	
	public Insets getInsets() {
		
		return new Insets(40,10,10,10);
	}
	
	 public static void main(String[] arguments) {
        TitleBar frame = new TitleBar();
            }

	@Override										
	public void mouseClicked(MouseEvent e) {							//metody obs³ugujace zdarzenia myszy
	}
	@Override
	public void mousePressed(MouseEvent e) {
	}
	@Override
	public void mouseReleased(MouseEvent e) {
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		
		messageBox.setText("nie odchodz!");
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		messageBox.setText("");
		
	}
}
