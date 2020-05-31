package be.ucll.taskmanager.model.DTO;

import be.ucll.taskmanager.dto.TaskDTO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TaskDTOTest {

    @Test
    public void testTaskTitle() {
        TaskDTO task = new TaskDTO();

        task.setTitle("title");

        assertEquals("title", task.getTitle());
    }

    @Test
    public void testTaskDescription() {
        TaskDTO task = new TaskDTO();

        task.setDesc("desc");

        assertEquals("desc", task.getDesc());
    }


    @Test
    public void testTaskDueDate() {
        TaskDTO task = new TaskDTO();

        task.setDate(LocalDateTime.of(2020, 10, 01, 10, 0));

        assertEquals(LocalDateTime.of(2020, 10, 01, 10, 0), task.getDate());
    }

    @Test
    public void testTaskId() {
        TaskDTO task = new TaskDTO();

        UUID id= UUID.randomUUID();
        task.setId(id);

        assertEquals(id, task.getId());
    }
}
