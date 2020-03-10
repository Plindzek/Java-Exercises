package czynnosciowe.polecenie;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String argument=null;

	// Lamp lamp = new Lamp();
	Switchable lamp = new Lamp();


        /**
	 * stworzenie poleceń, które wykonują metody on/off na lampie, "wyręczając" w
	 * tym samą lampę żądania stają się obiektami i można nimi łatwiej zarządzać np
	 * umieszczać w listach, parametryzować
	 */
        
        Command switchClose = new CloseSwitchCommand(lamp);
        Command switchOpen = new OpenSwitchCommand(lamp);

        Switch sswitch = new Switch(switchClose, switchOpen);


        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj: ");
        
        
        while(scan.hasNext())
            
            {argument = scan.next();
            
            if (argument.equals("on"))
            {
		sswitch.open();
		// lamp.powerOn();
            }
            else if (argument.equals("off"))
            {
		sswitch.close();
		// lamp.powerOff();
            }
            else if (argument.equals("exit"))
            {
        	 scan.close();
                System.exit(0);
               
            }
            else
            {
      System.out.println("Argument \"on\" , \"off\" or \"exit\" is required.");
            }}
    }
    }

