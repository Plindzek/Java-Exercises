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
