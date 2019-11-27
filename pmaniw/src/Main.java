
public class Main {

    public static void main(String[] args) {

	Song song = new Song("DontSpeak","Tragic Kingdom", 1996, "Don't Speak", "No Doubt", 12365658L);
	String mp3Name = song.getFileName();
	
	System.out.println(song);
    }

}
