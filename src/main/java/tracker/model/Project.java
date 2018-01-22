package tracker.model;

import tracker.util.AbstractPersistable;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Igor
 */
@Entity
@Table(name = "projects")
public class Project extends AbstractPersistable<Integer> {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name_project")
    private String nameProject;
    @Column(name = "bdate")
    private Date bDate;
    @Column(name = "edate")
    private Date eDate;
 /*   @Column(name = "id_user")
    private Integer idUser;*/
    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false)
    private User user;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
