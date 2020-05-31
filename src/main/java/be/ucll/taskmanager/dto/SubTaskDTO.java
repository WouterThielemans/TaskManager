package be.ucll.taskmanager.dto;

import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.UUID;

public class SubTaskDTO {
    @Id
    private UUID id;
    @NotEmpty(message = "Title can not be empty!")
    @Size(max=100)
    private String title;
    @NotEmpty(message = "Description can not be empty!")
    @Size(max=200)
    private String desc;


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
