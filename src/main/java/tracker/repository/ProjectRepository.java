package tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tracker.model.Project;

/**
 * Created by Igor
 */
@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
