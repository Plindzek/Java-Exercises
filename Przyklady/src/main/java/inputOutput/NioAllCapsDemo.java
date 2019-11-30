package inputOutput;
import java.io.*;
import java.nio.file.*;

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

        	//utwórz obiekty plików
            //FileSystem fs = FileSystems.getDefault(); 
            
            Path source = FileSystems.getDefault().getPath(sourceName);
            Path temp = FileSystems.getDefault().getPath("tmp_" + sourceName);

            // utwórz strumieñ wejœciowy
            BufferedReader in = new BufferedReader(new FileReader(source.toFile()));

            // utwórz strumieñ wyjœciowy
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
            System.out.println("B³¹d -- " + se.toString());
        }
    }
}
