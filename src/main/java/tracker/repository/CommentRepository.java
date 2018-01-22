package tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tracker.model.Comment;

/**
 * Created by Igor
 */
@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
