package tracker.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tracker.model.User;
import tracker.repository.UserRepository;
import tracker.service.UserService;

import java.util.List;

/**
 * Created by igor
 */
@Service
public class UserServicrImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    @Override
    public List<User> userList() {
        return userRepository.findAll();
    }

    @Transactional
    @Override
    public User userGet(Integer id) {
        return userRepository.findOne(id);
    }

    @Transactional
    @Override
    public void userCreate(User user) {
        userRepository.save(user);
    }

    @Transactional
    @Override
    public void userUpdate(User user) {
        userRepository.save(user);
    }

    @Transactional
    @Override
    public void userDelete(Integer id) {
        userRepository.delete(id);
    }
}
