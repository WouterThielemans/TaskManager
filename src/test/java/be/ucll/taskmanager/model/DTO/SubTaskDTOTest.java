package be.ucll.taskmanager.model.DTO;

import be.ucll.taskmanager.dto.SubTaskDTO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SubTaskDTOTest {

    @Test
    public void testSubTaskDTOId() {
        SubTaskDTO task = new SubTaskDTO();

        UUID id= UUID.randomUUID();
        task.setId(id);

        assertEquals(id, task.getId());
    }

    @Test
    public void testSubTaskDTOTitle() {
        SubTaskDTO task = new SubTaskDTO();

        task.setTitle("title");

        assertEquals("title", task.getTitle());
    }

    @Test
    public void testSubTaskDTODescription() {
        SubTaskDTO task = new SubTaskDTO();

        task.setDesc("desc");

        assertEquals("desc", task.getDesc());
    }
}
