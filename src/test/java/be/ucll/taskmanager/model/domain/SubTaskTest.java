package be.ucll.taskmanager.model.domain;

import be.ucll.taskmanager.model.SubTask;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SubTaskTest {

    @Test
    public void testSubTaskConstructor() {
        SubTask task = new SubTask("title", "desc");

        assertEquals("title", task.getTitle());
        assertEquals("desc", task.getDesc());
    }

    @Test
    public void testSubTaskId() {
        SubTask task = new SubTask();

        UUID id= UUID.randomUUID();
        task.setId(id);

        assertEquals(id, task.getId());
    }

    @Test
    public void testSubTaskTitle() {
        SubTask task = new SubTask();

        task.setTitle("title");

        assertEquals("title", task.getTitle());
    }
    @Test
    public void testSubTaskDescription() {
        SubTask task = new SubTask();

        task.setDesc("description");

        assertEquals("description",task.getDesc());
    }
}
