package tracker.dto;

import tracker.model.Project;

import java.util.Date;

/**
 * Created by igor
 */
public class ProjectFullDto {

    private Integer id;
    private String nameProject;
    private Date bDate;
    private Date eDate;

    public ProjectFullDto(Project project) {
        this.id = project.getId();
        this.nameProject = project.getNameProject();
        this.bDate = project.getbDate();
        this.eDate = project.geteDate();
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

    public Date getbDate() {
        return bDate;
    }

    public void setbDate(Date bDate) {
        this.bDate = bDate;
    }

    public Date geteDate() {
        return eDate;
    }

    public void seteDate(Date eDate) {
        this.eDate = eDate;
    }
}
