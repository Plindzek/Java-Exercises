package inputOutput;


import java.io.*;
import java.nio.*;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.file.*;

public class TestyStrumieni {
	ByteBuffer nowy = ByteBuffer.allocate(0); //
	/* odczytywanie strumieni */

	public static void main(String[] args) {
		new TestyStrumieni().defaultEncodingCheck();
		
		byte[] nowa = new byte[0];
		
		String sourceName = "Adam.txt";
		//FileSystem fs = FileSystems.getDefault(); 
        Path source = FileSystems.getDefault().getPath(sourceName);
        Path temp10 = FileSystems.getDefault().getPath("tmp_" + sourceName);
        Charset cs = Charset.forName("UTF-16"); //twórczoœæ w³asna 
        
		try (			//przyk³adowe Inputstreamy: (klasy abstrakcyjne, brak instancji, tworzymy przypisanie)
				InputStream in = System.in; 
				InputStream przyklad = new FileInputStream("Adam.txt");
				InputStream takiSe = new ByteArrayInputStream(nowa);
				OutputStream out = System.out;
				
				FileInputStream odczyt = new FileInputStream("Adam.txt"); // dane binarne na koñcu zwraca -1
				FileOutputStream zapis = new FileOutputStream("Adam1.txt");// 
				DataInputStream dis = new DataInputStream(odczyt); // zawiera metody readBoolean() readChar() itp
				DataOutputStream dos = new DataOutputStream(zapis); // stosujemy do odczytu/zapisu danych konkretnego typu
				BufferedInputStream diso = new BufferedInputStream(odczyt); // klasy opakowujace stream i przyœpieszaj¹ce operacje we/wy
				BufferedOutputStream doso = new BufferedOutputStream(zapis); // nie dzia³aj¹ z klas¹ Reader/Writer
				ByteArrayInputStream arrayInput = new ByteArrayInputStream(nowa);
				ByteArrayOutputStream array = new ByteArrayOutputStream();	//zapis do tablicy byte[] dzia³a z obiema klasami

				BufferedReader nioFile = new BufferedReader(new FileReader(source.toFile()));
	            BufferedWriter NioFile1 = new   BufferedWriter(new FileWriter(temp10.toFile()));
				
				BufferedReader tst = new BufferedReader(new InputStreamReader(przyklad, cs));//inny przyk³ad po³¹czenia
				BufferedReader bfr = new BufferedReader(new FileReader("Kasia.txt")); //klasa Reader
				BufferedWriter bfw = new BufferedWriter(new FileWriter("Kasia1.txt", false));//Dane tekstowe, odczytuje poprawnie 2 bajtowe znaki nie stosowac do binarnych, pdf, doc itp

				StringReader str = new StringReader(source.toString());
				StringWriter strw = new StringWriter();
				PrintWriter pw = new PrintWriter(strw);
				
	            

				
				
				)/* stosujemy try-with-resources aby automatycznie zamkn¹æ strumienie */
		{
			int temp = 0;
			do {

				temp = diso.read();
				System.out.print(" read: " + temp);
				if (temp != -1) {
					array.write(temp);
					doso.write(temp);
					System.out.print(" write: " + temp+"\n");
				}
			} while (temp != -1);
			nowa = array.toByteArray();//kopiowanie danych z bufora array do tablicy
			System.out.println("\nkoniec operacji 1\n");
			
			int temp1 = 0;
			do {
//				String line = bfr.readLine(); //zapis do stringa
				temp1 = tst.read();
				
				System.out.print("read1: " + temp1);
				if (temp1 !=-1) {
					bfw.write(temp1);
					System.out.print(" write1: " + temp1+"\n");
				}
			} while (temp1 != -1);
			System.out.println("\nkoniec operacji 2\n");
		} 
		catch (IOException e) { System.out.println("Input-output error");	}
	}
	
	void defaultEncodingCheck(){
	String p = System.getProperty("file.encoding");
    System.out.println("Strona kodowa: "+p);}
	
}
