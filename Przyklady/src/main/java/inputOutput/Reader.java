package inputOutput;
import java.io.*;

public class Reader {

	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("Adam.txt");
			FileWriter file1 = new FileWriter("AdamOut.txt");

			int data = file.read();
			while (data != -1) {
				file1.write(data);
				System.out.println("FileReader: "+(char)data);
				data = file.read();
			}

			file.close();
			file1.close();

			FileInputStream filea = new FileInputStream("Adam.txt");
			FileOutputStream filea1 = new FileOutputStream("AdamOut1.txt", false);
			int out1 = filea.read();
			while (out1 != -1) {
				filea1.write(out1);
				System.out.println("FileInputStream: "+(char)out1);
				out1 = filea.read();
			}

			filea.close();
			filea1.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
