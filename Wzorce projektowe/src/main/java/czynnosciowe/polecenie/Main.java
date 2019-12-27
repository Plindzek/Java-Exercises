package polecenie;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String argument=null;

        Switchable lamp = new Lamp();

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
            }
            else if (argument.equals("off"))
            {
                sswitch.close();
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

