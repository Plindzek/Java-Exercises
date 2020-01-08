import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor


public class Song {
    private String fileName;
    private String album;
    private int year;
    private String title;
    private String artist;
    private Long lenght;

}
