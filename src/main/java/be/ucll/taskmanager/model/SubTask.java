package be.ucll.taskmanager.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.UUID;

@Entity
public class SubTask {
    @Id
    @GeneratedValue
    private UUID id;

    @NotEmpty(message = "Title can not be empty!")
    @Size(max=100)
    private String title;
    @NotEmpty(message = "Description can not be empty!")
    @Size(max=200)
    private String desc;

    public SubTask(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }
    public SubTask(){

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
