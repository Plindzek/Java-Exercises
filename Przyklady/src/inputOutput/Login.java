package inputOutput;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Login {
    public static void main(String args[]) throws FileNotFoundException, InterruptedException{
        Passy passy = new Passy("Adam", "1234"); // tutaj ustawiamy przyk³adowe has³a...
        //InputStreamReader isr = new InputStreamReader(System.in);
        FileReader isr = new FileReader("adam.txt");
        BufferedReader bf = new BufferedReader(isr);
        String login, haslo;
        while(true){
            try {
                System.out.println("Podaj login: ");
                login = bf.readLine();
                System.out.println(login);
                System.out.println("Podaj has³o: ");
                haslo = bf.readLine();
                System.out.println(haslo);

                
                if(login.equals(passy.login) && haslo.equals(passy.haslo)){
                    System.out.println("Poprawne dane. Zosta³eœ zalogowany.");
                    bf.close();
                    break;
                }else{
                    System.out.println("Login lub has³o jest b³êdne. Spróbuj jeszcze raz!\n");
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