package ma.ensa.jeeexame1.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;
    private String name;
    private String mail;
    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name = "Borrow", joinColumns = @JoinColumn(name = "id_User") ,inverseJoinColumns = @JoinColumn(name = "id_doc"))
    private List<Document> documents;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }
}
