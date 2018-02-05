package tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tracker.model.User;

/**
 * Created by Igor
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User getUserByEmail(String email);
}
