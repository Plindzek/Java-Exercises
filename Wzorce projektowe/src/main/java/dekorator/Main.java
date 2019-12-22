package dekorator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Main {

    /*
     * Kolejne powstające obiekty są używane jako parametry konstruktora kolejnego obiektu 
     * metody dekoratora wywołują metody oryginalne klasy + dodatkowe funkcje
     */
    
    public static void main(String[] args) throws IOException {
	String host = "100.66.128.00";
	Socket soc = new Socket(host, 10091);
	InputStreamReader isr = new InputStreamReader(soc.getInputStream());
	BufferedReader in = new BufferedReader(isr);
	in.read();
	soc.close();
    }

}
