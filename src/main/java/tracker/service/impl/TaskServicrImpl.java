package tracker.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tracker.model.Task;
import tracker.repository.TaskRepository;
import tracker.service.TaskService;

import java.util.List;

/**
 * Created by igor
 */
@Service
public class TaskServicrImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Transactional
    @Override
    public List<Task> taskList() {
        return taskRepository.findAll();
    }

    @Transactional
    @Override
    public Task taskGet(Integer id) {
        return taskRepository.findOne(id);
    }

    @Transactional
    @Override
    public void taskCreate(Task task) {
        taskRepository.save(task);
    }

    @Transactional
    @Override
    public void taskUpdate(Task task) {
        taskRepository.save(task);
    }

    @Transactional
    @Override
    public void taskDelete(Integer id) {
        taskRepository.delete(id);
    }
}
