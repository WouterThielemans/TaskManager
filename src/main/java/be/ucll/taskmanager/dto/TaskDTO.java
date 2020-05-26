package be.ucll.taskmanager.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class TaskDTO {
    private String title;
    private String desc;
    private LocalDateTime date;
    private UUID id;
    private List<SubTaskDTO> subTasks;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
    public List<SubTaskDTO> getSubTasks() {
        return subTasks;
    }

    public void setSubTasks(List<SubTaskDTO> subTasks) {
        this.subTasks = subTasks;
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

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
