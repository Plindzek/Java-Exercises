package inputOutput;


import java.io.*;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class ServerReader {

	void read() {
		try {
			Socket soc = new Socket("100.66.128.35", 10091);

			BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			StringBuilder sb = new StringBuilder();
			String jakis;
			
			do {
			jakis = in.readLine();

				if (jakis == null) {
					break;
				}
			
				sb.append(jakis);
				sb.append("\n");
			}

			while (jakis !=null);
			String tekst = sb.toString();
			System.out.println(tekst);
			soc.close();

		} catch (UnknownHostException uhe) {
			System.err.println("z³y host" + uhe);
		} catch (IOException e) {
			System.err.println("we-wy err" + e);
		}
	}

	public static void main(String[] args) {
		ServerReader nowy = new ServerReader();
		nowy.read();

	}

}
