package repository;

import models.Employee;
import models.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TasksRepository extends JpaRepository<Tasks, Integer> {
    List<Tasks> findByProcessId(int processId);

}
