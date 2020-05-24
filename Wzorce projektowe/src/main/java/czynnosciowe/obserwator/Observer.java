package czynnosciowe.obserwator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Observer {

    
    
   public static void main(String[] args) {
    /*
     * Tworzymy listenera, który czeka na wystapienie zdarzenia, a gdy je zarejestruje, wykonuje zaplanowaną akcję 
     */

	
	JButton solveButton = new JButton();   
	
    
     ActionListener listen = (ActionEvent e) -> {

	Object source = e.getSource();
	
	if (source == solveButton) 
	
	    System.out.println("Action performed!");
};
     
solveButton.addActionListener(listen); 

solveButton.doClick();//symulacja kliknięcia
    
   }
 
}