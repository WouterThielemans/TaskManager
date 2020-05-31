package be.ucll.taskmanager.repository;

import be.ucll.taskmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface TaskRepo  extends JpaRepository<Task,UUID> {

}
