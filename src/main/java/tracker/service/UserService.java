package tracker.service;

import tracker.model.User;

import java.util.List;

/**
 * Created by igor
 */
public interface UserService {

    List<User> userList();

    User userGet(Integer id);

    void userCreate(User user);

    void userUpdate(User user);

    void userDelete(Integer id);

}
