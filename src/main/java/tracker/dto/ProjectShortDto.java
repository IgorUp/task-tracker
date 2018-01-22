package tracker.dto;

import tracker.model.Project;

/**
 * Created by igor
 */
public class ProjectShortDto {

    private Integer id;
    private String nameProject;

    public ProjectShortDto(Project project) {
        this.id = project.getId();
        this.nameProject = project.getNameProject();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameProject() {
        return nameProject;
    }

    public void setNameProject(String nameProject) {
        this.nameProject = nameProject;
    }
}
