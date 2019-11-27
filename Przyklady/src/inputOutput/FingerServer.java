package inputOutput;


import java.io.*;
import java.net.*;
import java.nio.channels.*;
import java.util.*;
public class FingerServer {

    public FingerServer() {
        try {
            
            // Ustaw hosta i port do monitorowania.
            InetSocketAddress server = new InetSocketAddress("192.168.0.13", 4415);
 

            // Utwórz nieblokuj¹cy kana³ gniazda serwerowego.
            ServerSocketChannel sock = ServerSocketChannel.open();
            sock.configureBlocking(false);
            
            ServerSocket socket = sock.socket();
            socket.bind(server);
            
            
            // Utwórz selektor i zarejestruj go dla kana³u.
            Selector selector = Selector.open();
            sock.register(selector, SelectionKey.OP_ACCEPT);

            // Pêtla nieskoñczona czekaj¹ca na po³¹czenia od klientów.
            while (true) {
                // Czekaj na po³¹czenie.
                selector.select();

                // Pobierz klucze selekcji dla czekaj¹cych zdarzeñ.
                Set keys = selector.selectedKeys();
                Iterator it = keys.iterator();

                // Obs³u¿ ka¿dy klucz
                while (it.hasNext()) {

                    // Pobierz klucz i usuñ go z iteracji.
                    SelectionKey sKey = (SelectionKey) it.next();

                    it.remove();
                    if (sKey.isAcceptable()) {

                        // Utwórz po³¹czenie z klinetem.
                        ServerSocketChannel selChannel =
                            (ServerSocketChannel) sKey.channel();
                        ServerSocket sSock = selChannel.socket();
                        Socket connection = sSock.accept();

                        // Obs³u¿ ¿¹danie Finger.
                        handleRequest(connection);
                        connection.close();
                    }
                }
             }
         } catch (IOException ioe) {
             System.out.println(ioe.getMessage());
         }
     }

    private void handleRequest(Socket connection)
        throws IOException {

        // Ustaw wejœcie i wyjœcie.
        InputStreamReader isr = new InputStreamReader (
            connection.getInputStream());
        BufferedReader is = new BufferedReader(isr);
        PrintWriter pw = new PrintWriter(new
            BufferedOutputStream(connection.getOutputStream()),
            false);

        // Wyœlij pozdrowienie.
        pw.println("Witam na moim serwerze :)");
        pw.flush();

        // Obs³u¿ dane wejœciowe.
        String outLine = null;
        String inLine = is.readLine();

        if (inLine.length() > 0) {
            outLine = inLine;
        }
        readPlan(outLine, pw);

        // Czyszczenie.
        pw.flush();
        pw.close();
        is.close();
    }

    private void readPlan(String userName, PrintWriter pw) {
        try {
            FileReader file = new FileReader(userName + ".plan");
            BufferedReader buff = new BufferedReader(file);
            boolean eof = false;

            pw.println("\nNazwa u¿ytkownika: " + userName + "\n");

            while (!eof) {
                String line = buff.readLine();

                if (line == null) {
                    eof = true;
                } else {
                   pw.println(line);
                }
            }

            buff.close();
        } catch (IOException e) {
            pw.println("Nie znaleziono u¿ytkownika " + userName + "." + e.getMessage());
        }
    }

    public static void main(String[] arguments) {
        FingerServer nio = new FingerServer();
    }
}
