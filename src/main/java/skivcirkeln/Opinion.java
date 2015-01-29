package skivcirkeln;

import java.time.LocalTime;

import org.springframework.data.annotation.Id;

public class Opinion {

    @Id
    private String id;

    private String author_id;
    private String record_id;
    private LocalTime created;
    private int grade;
    private String thoughts;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(String author_id) {
        this.author_id = author_id;
    }

    public LocalTime getCreated() {
        return created;
    }

    public void setCreated(LocalTime created) {
        this.created = created;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getThoughts() {
        return thoughts;
    }

    public void setThoughts(String thoughts) {
        this.thoughts = thoughts;
    }
}
