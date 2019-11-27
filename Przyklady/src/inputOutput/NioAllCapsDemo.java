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

        	//utw�rz obiekty plik�w
            //FileSystem fs = FileSystems.getDefault(); 
            
            Path source = FileSystems.getDefault().getPath(sourceName);
            Path temp = FileSystems.getDefault().getPath("tmp_" + sourceName);

            // utw�rz strumie� wej�ciowy
            BufferedReader in = new BufferedReader(new FileReader(source.toFile()));

            // utw�rz strumie� wyj�ciowy
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
            System.out.println("B��d -- " + se.toString());
        }
    }
}
