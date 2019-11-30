package testSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.UIManager.LookAndFeelInfo;

public class MyCards extends JPanel implements ActionListener {

	int currentCard = 0;
	CardLayout karty = new CardLayout(); 	// obiekt uk³adu kartowego java.awt.CardLayout tworz¹cego przechodz¹ce karty
	MyPanel[] ask = new MyPanel[3]; 		// tablica przechowuj¹ca obiekty klasy MyPanel, które za argument przyjmuj¹
											// string z pytaniem, tablicê odpowiedzi resp, ostatni parametr pokazuje któr¹
											// odp.domyslnie zaznaczyæ

	
	public MyCards() { 						// Tworzenie kart
		super();
		setLayout(karty);
		String question0 = "Jakie paliwo stosujesz w samochodzie?";			
		String[] resp0 = { "benzyna lub olej napedowy", "benzyna + LPG" };
		ask[0] = new MyPanel(question0, resp0, 10); 

		String question2 = "Podaj spalanie";
		String[] resp2 = { "8l", "10l", "12l", "100" };
		ask[1] = new MyPanel(question2, resp2, 10);

		String question3 = "Ile km przejecha³eœ?";
		String[] resp3 = { "50", "100", "150" };
		ask[2] = new MyPanel(question3, resp3, 10);
		ask[2].setFinalQuestion(true);
		addListeners();							 

	}

	private void addListeners() {								//metoda dodaj¹ca powy¿sze kontenery do obiektu CardLayout 
		for (int i = 0; i < ask.length; i++) {
						
			ask[i].nextButton.addActionListener(this);			//tworzenie obs³ugi akcji do przycisków (this = MyPanel)
			ask[i].finalButton.addActionListener(this);
			add(ask[i], "Czêœæ" + i); 							//dodawanie karty pod okreœlon¹ nazw¹

		}
	}

	@Override
	public void actionPerformed(ActionEvent evt) {				//metoda z interfejsu ActionListener 
																//zmieniaj¹ca wyœwietlane karty po kliku
		currentCard++;
		if (currentCard >= ask.length) {
			System.exit(0);
		}
		karty.show(this, "Czêœæ" + currentCard);		//wyœwietlanie okreœlonej karty (this=kontener rodzic czyli ramka stosuj¹ca karty)
	}

}

class MyPanel extends JPanel {					//klasa definiuj¹ca obiekty MyPanel czyli nasze karty
	JLabel question;								
	JRadioButton[] response;
	JButton nextButton = new JButton("Dalej");
	JButton finalButton = new JButton("Zakoñcz");
		
	MyPanel(String ques, String[] resp, int def) { 			
		super();
		setSize(640, 480);
		
		question = new JLabel(ques);					//obiekt etykiety otrzyma wartoœæ question1,2,3 na podstawie konstruktora 
		response = new JRadioButton[resp.length];		//obiekt button przechowuj¹cy opcje do wyboru
		
		JPanel sub1 = new JPanel();						//sub 1,2,3 = kolejne czêœci tworzonej karty
		JLabel quesLabel = new JLabel(ques);			//pytanie 
		sub1.add(quesLabel);							//dodanie pytania do górnej czêœci tworzonej karty
		
		ButtonGroup group = new ButtonGroup();			//grupa radioButtonów na œrodkowej czêœci karty
		
		JPanel sub2 = new JPanel();						
		JPanel sub3 = new JPanel();						
		nextButton.setEnabled(true);
		sub3.add(nextButton);							//przyciski w dolnej czêœci: next-aktywny i final- nieaktywny
		finalButton.setEnabled(false);
		sub3.add(finalButton);
		
		
		for (int i = 0; i < resp.length; i++) {					 // pêtla tworzy grupê radiobuttonów z "i" iloœci¹ opcji 
			if (def == i) { 									// oraz domyœlnym zaznaczeniem na pozycji def
				response[i] = new JRadioButton(resp[i], true);
			} else {
				response[i] = new JRadioButton(resp[i], false);

			}
			group.add(response[i]);			//dodanie opcji radiobuttonów do grupy w pêtli
			sub2.add(response[i]);			//dodanie opcji do œrodkowej czêœci karty
		}
		
		GridLayout grid = new GridLayout(3, 1);			//aran¿acja kart			
		setLayout(grid);
		add(sub1);
		add(sub2);
		add(sub3);
		
		setLookAndFeel();

	}

	void setFinalQuestion(boolean finalQuestion) {		//metoda uaktywniaj¹ca przycisk zakoñcz
		if (finalQuestion) {
			nextButton.setEnabled(false);
			finalButton.setEnabled(true);
		}
	}

	private void setLookAndFeel() {
		try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					SwingUtilities.updateComponentTreeUI(this);
					break;

				}
			}
		} catch (Exception e) {
			System.err.println("Nie potrafiê wczytaæ " + "systemowego wygl¹du: " + e);
		}
	}
}