package skivcirkeln;

import java.time.Year;
import java.util.List;

import org.springframework.data.annotation.Id;

public class Record {

    @Id
    private String id;
    private Year releaseYear;
    private String artist;
    private String title;
    private List<String> trackList;
}
