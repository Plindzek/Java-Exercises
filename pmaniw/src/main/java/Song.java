import lombok.Data;
import lombok.AllArgsConstructor;
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
