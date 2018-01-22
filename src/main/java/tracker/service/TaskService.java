package tracker.service;

import tracker.model.Task;

import java.util.List;

/**
 * Created by igor
 */
public interface TaskService {

    List<Task> taskList();

    Task taskGet(Integer id);

    void taskCreate(Task task);

    void taskUpdate(Task task);

    void taskDelete(Integer id);
}
