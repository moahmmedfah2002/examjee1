package ma.ensa.jeeexame1.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;
    private String title;
    private Date dateCreation;
    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name = "Borrow", joinColumns = @JoinColumn(name = "id_doc") ,inverseJoinColumns = @JoinColumn(name = "id_user"))
    private List<User> users;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
