package be.ucll.taskmanager.model.service;

import be.ucll.taskmanager.dto.SubTaskDTO;
import be.ucll.taskmanager.dto.TaskDTO;
import be.ucll.taskmanager.model.SubTask;
import be.ucll.taskmanager.service.TaskServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
@Transactional
@SpringBootTest
public class TaskServiceImplTest {

    @Autowired
    private TaskServiceImpl taskService;

    @BeforeEach
    public void setUp() {
        TaskDTO taskDTO = new TaskDTO();
        taskDTO.setTitle("title");
        taskDTO.setDesc("desc");
        taskDTO.setDate(LocalDateTime.of(2020, 10, 01, 10, 0));
        taskDTO.setSubTasks(new ArrayList<>());
        taskService.addTask(taskDTO);
    }

    @Test
    public void testSubTasks() {
        SubTaskDTO SubTaskDTO = new SubTaskDTO();

        SubTaskDTO.setTitle("title");
        SubTaskDTO.setDesc("desc");
        SubTaskDTO.setId(taskService.getTasks().get(0).getId());
        taskService.addSubtask(taskService.getTasks().get(0).getId(),SubTaskDTO);

        assertEquals(taskService.getSubTasks(taskService.getTasks().get(0).getId()).size(), 1);
    }

    @Test
    public void testTasks() {
        List<TaskDTO> tasks = taskService.getTasks();

        assertEquals(1, tasks.size());
        TaskDTO task = tasks.get(0);

        assertEquals("title", task.getTitle());
        assertEquals("desc", task.getDesc());
        assertEquals(LocalDateTime.of(2020, 10, 01, 10, 0),task.getDate());

    }

    @Test
    public void testEditTask() {
        TaskDTO TaskDTO = new TaskDTO();

        TaskDTO.setId(taskService.getTasks().get(0).getId());
        TaskDTO.setDesc("editedTitle");
        TaskDTO.setTitle("editedDesc");
        TaskDTO.setDate(LocalDateTime.of(2020, 10, 01, 10, 0));
        taskService.editTask(taskService.getTasks().get(0).getId(),TaskDTO);

        assertEquals(taskService.getTasks().get(0).getTitle(), TaskDTO.getTitle());
        assertEquals(taskService.getTasks().get(0).getId(), TaskDTO.getId());
        assertEquals(taskService.getTasks().get(0).getDesc(), TaskDTO.getDesc());
        assertEquals(taskService.getTasks().get(0).getDate(), TaskDTO.getDate());
    }
}
