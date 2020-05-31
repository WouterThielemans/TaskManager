package be.ucll.taskmanager.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
public class Task {
    @Id
    @GeneratedValue
    private UUID id;
    @NotEmpty(message = "Title can not be empty!")
    @Size(max=100)
    private String title;
    @NotEmpty(message = "Description can not be empty!")
    @Size(max=200)
    private String desc;
    @NotNull(message = "Date can not be empty!")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @Future(message = "Task can not be in de past!")
    private LocalDateTime date;
    @OneToMany(cascade= CascadeType.ALL)
    private List<SubTask> subtasks;

    public Task(String title, String desc, LocalDateTime date, List<SubTask> subTask) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.desc = desc;
        this.date = date;
        this.subtasks = subTask;
    }

    public Task(String title, String desc, LocalDateTime date) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.date = date;
        this.desc = desc;
        this.subtasks = new ArrayList<>();
    }

    public Task() {
        this.id = UUID.randomUUID();
        this.subtasks = new ArrayList<>();
    }

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

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public List<SubTask> getSubtasks() {
        return subtasks;
    }

    public void addSubtasks(SubTask subtask) {
        subtasks.add(subtask);
    }

    public void setSubTasks(List<SubTask> subTasks) { this.subtasks = subTasks; }
}
