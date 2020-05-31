package be.ucll.taskmanager.model.domain;

import be.ucll.taskmanager.model.SubTask;
import be.ucll.taskmanager.model.Task;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TaskTest {

    @Test
    public void testTaskConstructorWithSubTask() {
        SubTask subTask = new SubTask("titlesub", "descsub");
        List<SubTask> subTasks = new ArrayList<>();
        subTasks.add(subTask);

        Task task = new Task("title", "desc",LocalDateTime.of(2020, 10, 01, 10, 0),subTasks);

        assertEquals("title", task.getTitle());
        assertEquals("desc", task.getDesc());
        assertEquals(LocalDateTime.of(2020, 10, 01, 10, 0), task.getDate());
        assertEquals("titlesub", task.getSubtasks().get(0).getTitle() );
        assertEquals("descsub", task.getSubtasks().get(0).getDesc() );
    }

    @Test
    public void testTaskConstructorWithSetSubTask() {
        SubTask subTask = new SubTask("titlesub", "descsub");
        List<SubTask> subTasks = new ArrayList<>();
        subTasks.add(subTask);

        Task task = new Task("title", "desc",LocalDateTime.of(2020, 10, 01, 10, 0));

        task.setSubTasks(subTasks);
        assertEquals("title", task.getTitle());
        assertEquals("desc", task.getDesc());
        assertEquals(LocalDateTime.of(2020, 10, 01, 10, 0), task.getDate());
        assertEquals("titlesub", task.getSubtasks().get(0).getTitle() );
        assertEquals("descsub", task.getSubtasks().get(0).getDesc() );
    }

    @Test
    public void testTaskConstructorWithoutSubTask() {
        Task task = new Task("title", "desc",LocalDateTime.of(2020, 10, 01, 10, 0));

        assertEquals("title", task.getTitle());
        assertEquals("desc", task.getDesc());
        assertEquals(LocalDateTime.of(2020, 10, 01, 10, 0), task.getDate());
    }

    @Test
    public void testTaskTitle() {
        Task task = new Task();

        task.setTitle("title");

        assertEquals("title", task.getTitle());
    }

    @Test
    public void testTaskDescription() {
        Task task = new Task();

        task.setDesc("description");

        assertEquals("description", task.getDesc());
    }

    @Test
    public void testTaskDueDate() {
        Task task = new Task();

        task.setDate(LocalDateTime.of(2020, 10, 01, 10, 0));

        assertEquals(LocalDateTime.of(2020, 10, 01, 10, 0), task.getDate());
    }

    @Test
    public void testTaskId() {
        Task task = new Task();

        UUID id= UUID.randomUUID();
        task.setId(id);

        assertEquals(id, task.getId());
    }


}
