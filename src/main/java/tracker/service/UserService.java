package tracker.service;

import org.springframework.security.access.annotation.Secured;
import tracker.model.User;

import java.util.List;

/**
 * Created by igor
 */
public interface UserService {

    @Secured({"ROLE_ADMIN", "ROLE_MANAGER"})
    List<User> userList();

    User userGet(Integer id);

    void userCreate(User user);

    void userUpdate(User user);

    void userDelete(Integer id);

}
