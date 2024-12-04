package in.sp.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sp.main.models.Task;

public interface TaskRepository extends JpaRepository<Task,Long>{

}
