package tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tracker.model.Task;

/**
 * Created by Igor
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
}
