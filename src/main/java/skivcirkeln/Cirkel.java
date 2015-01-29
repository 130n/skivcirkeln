package skivcirkeln;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;

public class Cirkel {

    @Id
    private String id;

    private LocalDate start;
    private LocalDate end;
    private String title;
    private String themeDesc;
    private List<String> skivIds;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThemeDesc() {
        return themeDesc;
    }

    public void setThemeDesc(String themeDesc) {
        this.themeDesc = themeDesc;
    }

    public List<String> getSkivIds() {
        return skivIds;
    }

    public void setSkivIds(List<String> skivIds) {
        this.skivIds = skivIds;
    }

    @Override
    public String toString() {
        return "Cirkel [id=" + id + ", start=" + start + ", end=" + end
                + ", title=" + title + ", themeDesc=" + themeDesc
                + ", skivIds=" + skivIds + "]";
    }

}
