package tracker.service;

import tracker.model.Project;

import java.util.List;

/**
 * Created by igor
 */
public interface ProjectService {

    List<Project> projectList();

    Project projectGet(Integer id);

    void projectCreate(Project project);

    void projectUpdate(Project project);

    void projectDelete(Integer id);
}
