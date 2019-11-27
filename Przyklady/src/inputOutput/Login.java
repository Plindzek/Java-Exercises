package inputOutput;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Login {
    public static void main(String args[]) throws FileNotFoundException, InterruptedException{
        Passy passy = new Passy("Adam", "1234"); // tutaj ustawiamy przyk�adowe has�a...
        //InputStreamReader isr = new InputStreamReader(System.in);
        FileReader isr = new FileReader("adam.txt");
        BufferedReader bf = new BufferedReader(isr);
        String login, haslo;
        while(true){
            try {
                System.out.println("Podaj login: ");
                login = bf.readLine();
                System.out.println(login);
                System.out.println("Podaj has�o: ");
                haslo = bf.readLine();
                System.out.println(haslo);

                
                if(login.equals(passy.login) && haslo.equals(passy.haslo)){
                    System.out.println("Poprawne dane. Zosta�e� zalogowany.");
                    bf.close();
                    break;
                }else{
                    System.out.println("Login lub has�o jest b��dne. Spr�buj jeszcze raz!\n");
                    continue;
                    
                }
                
            } catch (IOException e) {
                e.printStackTrace();
                
            }
        }
       
    }
}
class Passy {
    public String login, haslo;
    public Passy(String login, String haslo){
        this.login = login;
        this.haslo = haslo;
    }
}