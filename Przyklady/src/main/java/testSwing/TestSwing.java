package testSwing;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;

public class TestSwing extends JFrame {

	
	ImageIcon ikonka = new ImageIcon("subs.gif"); // pliki ikon
	ImageIcon loadIcon = new ImageIcon("load.gif");
	ImageIcon saveIcon = new ImageIcon("save.gif");
	ImageIcon subsIcon = new ImageIcon("subs.gif");
	ImageIcon unusIcon = new ImageIcon("unus.gif");

	JButton setsFuel = new JButton("Jedno paliwo", loadIcon); // przyciski
	JButton setsFuel2 = new JButton("benzyna", saveIcon);
	JButton setsFuel3 = new JButton("benzyna + LPG", subsIcon);
	JButton exit = new JButton("zako�cz", unusIcon);

	JButton baton = new JButton("nie du� mnie", loadIcon); 
	JButton baton2 = new JButton("wybierz mnie", saveIcon);
	JButton baton3 = new JButton("nadu� mnie", subsIcon);
	JButton baton4 = new JButton("zako�cz", unusIcon);
	
	JPanel pane = new JPanel();
	JPanel zakladkaPrzyciski = new JPanel();
	JMenuItem j1 = new JMenuItem("zr�b co�", saveIcon); // elementy menu
	JMenuItem j2 = new JMenuItem("zr�b co�2", loadIcon);
	JMenu m1 = new JMenu("Plik");
	JMenuBar menu = new JMenuBar();

	JPanel sett = new JPanel();
	JPanel sett2 = new JPanel();
	JPanel sett3 = new JPanel();
	JPanel sett4 = new JPanel();
	JTabbedPane tabs = new JTabbedPane(JTabbedPane.TOP);

	JLabel etykieta = new JLabel("Etykieta tekstowa", ikonka, SwingConstants.RIGHT); // etykieta nieedytowalna
	JTextField poleTekstowe = new JTextField("pole tekstowe", 20); // pole tekstowe 1 wiersz
	JPasswordField haslo = new JPasswordField(20); // pole has�a
	JTextArea obszarTekstowy = new JTextArea("obszar tekstowy", 8, 60); // obszar tekstowy
	JScrollPane pasek = new JScrollPane(obszarTekstowy, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
			ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	// pasek przewijania z parametrem = obszar tekstowy
	JCheckBox poleWyboru = new JCheckBox("zaznacz", true); // jezeli true to zaznaczone; domyslnie false
	JRadioButton poleWyboru2 = new JRadioButton("zaznacz", false);

	ButtonGroup choice = new ButtonGroup();
	JRadioButton opcja1 = new JRadioButton("zaznacz to", false);
	JRadioButton opcja2 = new JRadioButton("albo to");

	String[] lista = { "Adam", "Adam1", "Adam2", "Adam3", "Adam4", "Adam5", "Adam6", "Adam7", "Adam8", "Adam9", };
	JComboBox listaa = new JComboBox(lista);
	JList listab = new JList(lista);
	JScrollPane pasek1 = new JScrollPane(listab, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
			ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

	JSlider suwak = new JSlider(JSlider.VERTICAL);
	JToolBar tPas = new JToolBar("Pasek Narz�dziowy", JToolBar.CENTER);

	JProgressBar current = new JProgressBar(0, 20000);

	int num
	;
	public void iterate() {									//metoda do paska post�pu
		while (num < 20000) {
			current.setValue(num);
			try {
				Thread.sleep(900);
			} catch (InterruptedException e) {
			}
			num += 85;
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

	public TestSwing() { 											// konstruktor obiektu ramki programu
		super("Ramka programu");
		setLookAndFeel(); 											// sk�rka okna
		JOptionPane.showMessageDialog(null, "Teraz przetestujemy sobie komponenty Swinga"); // okno z wiadomo�ci�
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setSize(800, 600); 											// rozmiar okna
		setBounds(200, 20, 800, 600); 								// pozycja okna na ekranie oraz rozmiar
		
		GridLayout managerUkladu= new GridLayout(3, 3, 0, 0);  	//ile wierszy, kolumn, odst�p w pikselach poziom, pion
		sett4.setLayout(managerUkladu);
		
		add(pane);
		
		m1.add(j1); // pasek menu
		m1.add(j2);
		menu.add(m1);
		setJMenuBar(menu);

		pane.add(tabs); // zak�adki
		
		tabs.addTab("G��wne ustawienia", sett);
		tabs.addTab("ustawienia czego�", sett2);
		tabs.addTab("ustawienia czego� innego", sett3);
		tabs.addTab("Przyciski", sett4);

		choice.add(opcja1); // pola wyboru w zak�adkach
		choice.add(opcja2);
		sett.add(opcja1);
		sett.add(opcja2);
		sett.add(haslo); // pole has�a w zak�adce sett
		haslo.setEchoChar('*');
		sett.add(suwak); // obiekt suwaka
		suwak.setMinorTickSpacing(5);
		suwak.setMajorTickSpacing(10);
		suwak.setPaintLabels(true);
		suwak.setPaintTicks(true);

		sett2.add(pasek); // pasek przewijania zawieraj�cy obszar tekstowy
		// nie dodajemy obiektu obszar tekstowy, bo zawiera je obiekt pasek
		obszarTekstowy.setLineWrap(true);
		obszarTekstowy.setWrapStyleWord(true);
		sett2.add(poleWyboru);
		sett2.add(poleWyboru2);

		sett3.add(etykieta);
		sett3.add(poleTekstowe);
		sett3.add(listaa);
		sett3.add(pasek1); // pasek1 zawiera listab, aby pojawi� sie pasek przewijania
		listab.setVisibleRowCount(4); // ustawiamy ilo�� widocznych wierszy listy listab, je�eli jest pasek
		// przewijania domy�lnie widoczne jest 8

		sett4.add(baton);
		sett4.add(baton2);
		sett4.add(baton3);
		sett4.add(baton4);
		
		// pasek narz�dziowy
		Dimension d = new Dimension(10, 30); // nie wiedzia�em jak wpisa� Dimension i stworzy�em obiekt
		tPas.add(setsFuel);
		tPas.addSeparator(d);
		tPas.add(exit);
		tPas.addSeparator(d);
		tPas.add(setsFuel2);
		tPas.addSeparator(d);
		tPas.add(setsFuel3);
		tPas.addSeparator(d);
		add(tPas, BorderLayout.SOUTH);

		pane.add(current); // pasek post�pu
		current.setStringPainted(true);
		
		setLookAndFeel(); 											// sk�rka okna musi byc tu, bo znika
		setVisible(true);
	}

	public static void main(String[] args) {

		TestSwing okno = new TestSwing();
		okno.iterate();
	}
	
	static {
		
		String odp = JOptionPane.showInputDialog(null, "Wpisz swoje imi�:"); // wyskakuj�ce okienka to z opcj� input
																				// string
		String[] wybor = { "jab�ka", "cukierki", "chipsy" };
		int wyb1 = JOptionPane.showOptionDialog(null, odp + " wybierz m�drze", "Okno wyboru", 0, // to z wyborem opcji
				JOptionPane.INFORMATION_MESSAGE, null, wybor, wybor[0]);

		if (wyb1 == 0) {
			JOptionPane.showConfirmDialog(null, "Dobry wyb�r!", "info", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showConfirmDialog(null, "Od takiego jedzenia zostaje si� t�ust� �wini� :O", "info",
					JOptionPane.INFORMATION_MESSAGE);
		}

	}

}