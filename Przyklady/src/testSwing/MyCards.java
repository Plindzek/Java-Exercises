package testSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.UIManager.LookAndFeelInfo;

public class MyCards extends JPanel implements ActionListener {

	int currentCard = 0;
	CardLayout karty = new CardLayout(); 	// obiekt uk�adu kartowego java.awt.CardLayout tworz�cego przechodz�ce karty
	MyPanel[] ask = new MyPanel[3]; 		// tablica przechowuj�ca obiekty klasy MyPanel, kt�re za argument przyjmuj�
											// string z pytaniem, tablic� odpowiedzi resp, ostatni parametr pokazuje kt�r�
											// odp.domyslnie zaznaczy�

	
	public MyCards() { 						// Tworzenie kart
		super();
		setLayout(karty);
		String question0 = "Jakie paliwo stosujesz w samochodzie?";			
		String[] resp0 = { "benzyna lub olej napedowy", "benzyna + LPG" };
		ask[0] = new MyPanel(question0, resp0, 10); 

		String question2 = "Podaj spalanie";
		String[] resp2 = { "8l", "10l", "12l", "100" };
		ask[1] = new MyPanel(question2, resp2, 10);

		String question3 = "Ile km przejecha�e�?";
		String[] resp3 = { "50", "100", "150" };
		ask[2] = new MyPanel(question3, resp3, 10);
		ask[2].setFinalQuestion(true);
		addListeners();							 

	}

	private void addListeners() {								//metoda dodaj�ca powy�sze kontenery do obiektu CardLayout 
		for (int i = 0; i < ask.length; i++) {
						
			ask[i].nextButton.addActionListener(this);			//tworzenie obs�ugi akcji do przycisk�w (this = MyPanel)
			ask[i].finalButton.addActionListener(this);
			add(ask[i], "Cz��" + i); 							//dodawanie karty pod okre�lon� nazw�

		}
	}

	@Override
	public void actionPerformed(ActionEvent evt) {				//metoda z interfejsu ActionListener 
																//zmieniaj�ca wy�wietlane karty po kliku
		currentCard++;
		if (currentCard >= ask.length) {
			System.exit(0);
		}
		karty.show(this, "Cz��" + currentCard);		//wy�wietlanie okre�lonej karty (this=kontener rodzic czyli ramka stosuj�ca karty)
	}

}

class MyPanel extends JPanel {					//klasa definiuj�ca obiekty MyPanel czyli nasze karty
	JLabel question;								
	JRadioButton[] response;
	JButton nextButton = new JButton("Dalej");
	JButton finalButton = new JButton("Zako�cz");
		
	MyPanel(String ques, String[] resp, int def) { 			
		super();
		setSize(640, 480);
		
		question = new JLabel(ques);					//obiekt etykiety otrzyma warto�� question1,2,3 na podstawie konstruktora 
		response = new JRadioButton[resp.length];		//obiekt button przechowuj�cy opcje do wyboru
		
		JPanel sub1 = new JPanel();						//sub 1,2,3 = kolejne cz�ci tworzonej karty
		JLabel quesLabel = new JLabel(ques);			//pytanie 
		sub1.add(quesLabel);							//dodanie pytania do g�rnej cz�ci tworzonej karty
		
		ButtonGroup group = new ButtonGroup();			//grupa radioButton�w na �rodkowej cz�ci karty
		
		JPanel sub2 = new JPanel();						
		JPanel sub3 = new JPanel();						
		nextButton.setEnabled(true);
		sub3.add(nextButton);							//przyciski w dolnej cz�ci: next-aktywny i final- nieaktywny
		finalButton.setEnabled(false);
		sub3.add(finalButton);
		
		
		for (int i = 0; i < resp.length; i++) {					 // p�tla tworzy grup� radiobutton�w z "i" ilo�ci� opcji 
			if (def == i) { 									// oraz domy�lnym zaznaczeniem na pozycji def
				response[i] = new JRadioButton(resp[i], true);
			} else {
				response[i] = new JRadioButton(resp[i], false);

			}
			group.add(response[i]);			//dodanie opcji radiobutton�w do grupy w p�tli
			sub2.add(response[i]);			//dodanie opcji do �rodkowej cz�ci karty
		}
		
		GridLayout grid = new GridLayout(3, 1);			//aran�acja kart			
		setLayout(grid);
		add(sub1);
		add(sub2);
		add(sub3);
		
		setLookAndFeel();

	}

	void setFinalQuestion(boolean finalQuestion) {		//metoda uaktywniaj�ca przycisk zako�cz
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
			System.err.println("Nie potrafi� wczyta� " + "systemowego wygl�du: " + e);
		}
	}
}