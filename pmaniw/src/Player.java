import java.io.File;
import java.io.InputStream;
import java.util.stream.Stream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

import lombok.Data;
@Data

public class Player {
    
    
File mp3 = new File("mp3Name");
    
    void play(File mp3) {
	byte[] data;
	InputStream in = ClassLoader.getSystemResourceAsStream("D:\\Projekty Java\\pliki\\1.mp3"); //in an applet
	AudioInputStream ais = AudioSystem.getAudioInputStream(in);
	data = new byte[(int)ais.getFrameLength()];
	byte[] buf = new byte[BUFSIZE];
	for (int i=0; i<data.length; i+=BUFSIZE) {
	    int r = ais.read(buf, 0, BUFSIZE);
	    if (i+r >= data.length) {
	        r = data.length - i;
	    }
	    System.arraycopy(buf, 0, data, i, r);
	}
	ais.close();
	line.start();
	for (int i=0; i<data.length; i+=BUFSIZE) {
	    line.write(data, i, BUFSIZE);
	}
	line.drain();
	line.stop();
	
	/* open stream with buffer and send to System.out.audio
	*/
    }
    void stop(Stream st) {
	//stream.close
    }
    void next(File mp3) {
	//stream.close
	/* open next from playlist load to stream with buffer and send to System.out.audio
	*/
    }
    void previous(File mp3) {
	//stream.close
		/* open next from playlist load to stream with buffer and send to System.out.audio
		*/
    }
    
    void exit() {
	System.exit(0);
    }
    
    
}
