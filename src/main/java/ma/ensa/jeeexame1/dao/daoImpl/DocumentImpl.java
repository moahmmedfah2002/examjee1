package ma.ensa.jeeexame1.dao.daoImpl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import ma.ensa.jeeexame1.dao.DocumentDao;
import ma.ensa.jeeexame1.entity.Document;
import ma.ensa.jeeexame1.entity.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DocumentImpl implements DocumentDao {
    private EntityManagerFactory emf;
    private EntityManager em;

    public DocumentImpl(){
        emf= Persistence.createEntityManagerFactory("exam");
        em=emf.createEntityManager();
    }
    @Override
    public List<Document> getDocuments() {
        return ((List<Document>) em.createQuery("select e from Document e", Document.class).getResultList());
    }

    @Override
    public Document getDocument(int id) {
        return ((Document) em.createQuery("select e from Document e where e.id="+id, Document.class).getSingleResult());
    }

    @Override
    public void Emprint(Document document, User user, Date dateBorrow, Date return_date) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        List<User> users =new ArrayList<>();
        users.add(user);
        document.setUsers(users);
        List<Document> documents = new ArrayList<>();
        documents.add(document);
        user.setDocuments(documents);

        transaction.commit();



    }

    public void close(){
        em.close();
    }
}
