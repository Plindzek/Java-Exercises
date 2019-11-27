package inputOutput;
import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Files.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;
import java.nio.*;
import java.nio.channels.FileChannel;
import java.nio.charset.*;

public class NIOFileOperations {

	void method() {
		Path sciezka = Paths.get("Adam.txt");
		Path sciezka1 = FileSystems.getDefault().getPath("Adam1.txt");
		Path sciezka2 = Paths.get("Adam2.txt");
		 
		try 
			(BufferedReader tst = Files.newBufferedReader(sciezka, StandardCharsets.UTF_8);
			BufferedWriter tst1 = Files.newBufferedWriter(sciezka2, StandardCharsets.UTF_8);
			//OutputStream os = new FileOutputStream(sciezka2.toFile()); - kopiowanie pliku przy u¿yciu outputstream
				)
				//Files.copy(sciezka, os);- kopiowanie pliku przy u¿yciu outputstream cd
				{
			String wynik = tst.readLine();
			System.out.println("Wynik odczytu z bufora newBuffered: " + wynik);
			tst1.write(wynik);
			Files.copy(sciezka, sciezka1, StandardCopyOption.REPLACE_EXISTING);
			//Files.write(sciezka2, jakisString.getBytes()); - opcja bez bufora
			// Files.delete(sciezka);
			Stream<String> stream = Files.lines(sciezka); // czyta wszystkie linie pliku
			stream.forEach(System.out::println);
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public static void main(String[] args) {

		NIOFileOperations a = new NIOFileOperations();
		a.method();

		try {
			// wczytaj dane bajtowe do bufora bajtowego
			String data = "adam.txt";
			FileInputStream inData = new FileInputStream(data);
			FileChannel inChannel = inData.getChannel(); // powi¹zanie kana³u z danymi wejœciowymi
			long inSize = inChannel.size();
			ByteBuffer source = ByteBuffer.allocate((int) inSize);
			inChannel.read(source, 0); // za pomoc¹ kana³u pobieramy dane z InputStreama i zapisujemy w bytebuffer
			source.position(0);
			System.out.println("Oryginalne dane bajtowe:");
			for (int i = 0; source.remaining() > 0; i++) {
				System.out.print(source.get() + " ");
			}
			// zamieñ dane bajtowe na dane znakowe
			source.position(0);
			Charset ascii = Charset.forName("Utf-8");
			CharsetDecoder toAscii = ascii.newDecoder();
			CharBuffer destination = toAscii.decode(source);
			destination.position(0);
			System.out.println("\n\nNowe dane znakowe:");
			for (int i = 0; destination.remaining() > 0; i++) {
				System.out.print(destination.get());
			}
			System.out.println();

		} catch (FileNotFoundException fne) {
			System.out.println(fne.getMessage() + " ERROR 1");
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage() + " ERROR 2 ");
		}
	}
}
