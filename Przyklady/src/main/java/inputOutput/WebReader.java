package inputOutput;

import java.io.*;
import java.net.*;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class WebReader extends JFrame{
	JTextArea box = new JTextArea("Pobieranie danych...");
	
public WebReader() {
	super("Aplikacja pobierania danych");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(200, 20, 800, 600); 	
	JScrollPane pane = new JScrollPane(box);
	add(pane);
	setVisible(true);
}

void getData(String address) throws IOException {
	setTitle(address);
	URL page = new URL(address);
	StringBuilder text = new StringBuilder();

	
	try{
		HttpURLConnection.setFollowRedirects(true);
		HttpURLConnection conn = (HttpURLConnection)page.openConnection();
		conn.connect();
			
		InputStreamReader in = new InputStreamReader((InputStream) conn.getContent());
		BufferedReader buff = new BufferedReader(in);
		box.setText("Pobieranie danych");
		String line;
		do {
			line = buff.readLine();
			text.append(line);
			text.append("\n");
		} while (line != null);
		box.setText(text.toString());
		} catch (IOException ioe) {
			System.out.println("B³¹d we-wy " + ioe.getMessage());
		}
}
	

public static void main(String[] arguments) throws IOException {
//	if(arguments.length<1) {
//		System.out.println("U¿ycie JavaWebReader url");
//		System.exit(1);
//	}
	try {
		WebReader app = new WebReader();
		app.getData("https://onet.pl");
	} catch (MalformedURLException mue) {
		System.err.println("B³êdny URL ");
	}
		
				
	}

}
