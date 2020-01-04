package lancuchZobowiazan;

import java.util.LinkedList;

// przykład listy jednokierunkowej

public class Przyklad {

public static void main(String[] args)
    {
        var tune = new LinkedList<String>();

        tune.addFirst("do"); // do
        tune.addLast("so"); // do - so
        int position = tune.indexOf("do");
        tune.add(position+1, "re"); // do - re- so
        for (String s : tune) {
            System.out.print(s);
	}
        System.out.println();
        position = tune.indexOf("re");
        tune.add(position+1, "mi"); // do - re - mi- so
        position=tune.size();
        tune.add(position-1, "fa"); // do - re - mi - fa- so
        for (String s : tune) {
            System.out.print(s);
	}
        System.out.println();
        tune.removeFirst(); // re - mi - fa - so
        tune.removeLast(); // re - mi - fa

        //LinkedList<String> miNode = tune.("mi");

        tune.remove("mi"); // re - fa
        tune.addFirst("mi"); // mi- re - fa

        
        for (String s : tune) {
            System.out.print(s);
	} 
           

    }
}


