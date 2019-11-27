package inputOutput;


import java.io.*;

public class ConsoleInput {
    public static String readLine() {
        StringBuilder response = new StringBuilder();
        try (BufferedInputStream buff = new
            BufferedInputStream(System.in)) {

            int in;
            char inChar;
            do {
                in = buff.read();
                inChar = (char) in;
                if ((in != -1) & (in != '\n') & (in != '\r')) {
                    response.append(inChar);
                }
            } while ((in != -1) & (inChar != '\n') & (in != '\r'));
            buff.close();
            return response.toString();
        } catch (IOException e) {
            System.out.println("Wyj¹tek: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] arguments) {
        System.out.print("\nJak siê nazywasz? ");
        String input = ConsoleInput.readLine();
        System.out.println("\nWitaj, " + input);
    }
}
