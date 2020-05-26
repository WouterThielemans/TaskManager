package be.ucll.taskmanager.dto;

import javax.validation.constraints.NotEmpty;
import java.util.UUID;

public class SubTaskDTO {
    @NotEmpty
    private String title, description;
    private UUID id;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
