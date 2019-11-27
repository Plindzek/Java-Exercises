package com.java21days;

import java.io.*;
import java.net.*;
import java.util.*;

public class TimeServer extends Thread {
    private ServerSocket sock;

    public TimeServer() {
        super();
        try {
            sock = new ServerSocket(10091);
            System.out.println("Uruchomiono TimeServer...");
        } catch (IOException e) {
            System.out.println("B³¹d: nie uda³o siê utworzyæ gniazda.");
            System.exit(1);
        }
    }

    public void run() {
        Socket client = null;

        while (true) {
            if (sock == null)
                return;
            try {
                client = sock.accept();
                BufferedOutputStream bb = new BufferedOutputStream(
                    client.getOutputStream());
                PrintWriter os = new PrintWriter(bb, false);
                String outLine;

                Date now = new Date();
                os.println(now);
                os.println("111111111111111111111111111111111111111111111111");
                os.println("222222222222222222222222222222222222222222222222");
                os.println("333333333333333333333333333333333333333333333333");
                os.flush();
                os.close();
                client.close();
                
            } catch (IOException e) {
                System.out.println("B³¹d: nie uda³o siê po³¹czyæ.");
                System.exit(1);
            }
        }
    }

    public static void main(String[] arguments) {
        TimeServer server = new TimeServer();
        server.start();
    }

}
