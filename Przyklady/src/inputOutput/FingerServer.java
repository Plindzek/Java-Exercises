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
 

            // Utw�rz nieblokuj�cy kana� gniazda serwerowego.
            ServerSocketChannel sock = ServerSocketChannel.open();
            sock.configureBlocking(false);
            
            ServerSocket socket = sock.socket();
            socket.bind(server);
            
            
            // Utw�rz selektor i zarejestruj go dla kana�u.
            Selector selector = Selector.open();
            sock.register(selector, SelectionKey.OP_ACCEPT);

            // P�tla niesko�czona czekaj�ca na po��czenia od klient�w.
            while (true) {
                // Czekaj na po��czenie.
                selector.select();

                // Pobierz klucze selekcji dla czekaj�cych zdarze�.
                Set keys = selector.selectedKeys();
                Iterator it = keys.iterator();

                // Obs�u� ka�dy klucz
                while (it.hasNext()) {

                    // Pobierz klucz i usu� go z iteracji.
                    SelectionKey sKey = (SelectionKey) it.next();

                    it.remove();
                    if (sKey.isAcceptable()) {

                        // Utw�rz po��czenie z klinetem.
                        ServerSocketChannel selChannel =
                            (ServerSocketChannel) sKey.channel();
                        ServerSocket sSock = selChannel.socket();
                        Socket connection = sSock.accept();

                        // Obs�u� ��danie Finger.
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

        // Ustaw wej�cie i wyj�cie.
        InputStreamReader isr = new InputStreamReader (
            connection.getInputStream());
        BufferedReader is = new BufferedReader(isr);
        PrintWriter pw = new PrintWriter(new
            BufferedOutputStream(connection.getOutputStream()),
            false);

        // Wy�lij pozdrowienie.
        pw.println("Witam na moim serwerze :)");
        pw.flush();

        // Obs�u� dane wej�ciowe.
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

            pw.println("\nNazwa u�ytkownika: " + userName + "\n");

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
            pw.println("Nie znaleziono u�ytkownika " + userName + "." + e.getMessage());
        }
    }

    public static void main(String[] arguments) {
        FingerServer nio = new FingerServer();
    }
}
