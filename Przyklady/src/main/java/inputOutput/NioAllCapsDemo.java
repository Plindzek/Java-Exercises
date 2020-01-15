package inputOutput;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class NioAllCapsDemo {
    public static void main(String[] arguments) {
       
        AllCaps cap = new AllCaps();
        cap.convert();
    }
}
class AllCaps {
    String sourceName="Adam.txt";
    void convert() {
        try {

	    // utworz obiekty plikow
            //FileSystem fs = FileSystems.getDefault(); 
            
            Path source = FileSystems.getDefault().getPath(sourceName);
            Path temp = FileSystems.getDefault().getPath("tmp_" + sourceName);

	    // utworz strumien wejsciowy
            BufferedReader in = new BufferedReader(new FileReader(source.toFile()));

	    // utworz strumien wyjsciowy
            BufferedWriter out = new   BufferedWriter(new FileWriter(temp.toFile()));

            boolean eof = false;
            int inChar;
            do {
                inChar = in.read();
                if (inChar != -1) {
                    char outChar = Character.toUpperCase(
                        (char) inChar);
                    out.write(outChar);
                } else
                    eof = true;
            } while (!eof);
            in.close();
            out.close();

            Files.delete(source);
            Files.move(temp, source);
        } catch (IOException|SecurityException se) {
	    System.out.println("Error -- " + se.toString());
        }
    }
}
