package tracker.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tracker.model.Project;
import tracker.repository.ProjectRepository;
import tracker.service.ProjectService;

import java.util.List;

/**
 * Created by igor
 */
@Service
public class ProjectServicrImpl implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Transactional
    @Override
    public List<Project> projectList() {
        return projectRepository.findAll();
    }


    @Transactional
    @Override
    public Project projectGet(Integer id) {
        return projectRepository.findOne(id);
    }

    @Transactional
    @Override
    public void projectCreate(Project project) {
        projectRepository.save(project);
    }

    @Transactional
    @Override
    public void projectUpdate(Project project) {
        projectRepository.save(project);
    }

    @Transactional
    @Override
    public void projectDelete(Integer id) {
        projectRepository.delete(id);
    }
}
