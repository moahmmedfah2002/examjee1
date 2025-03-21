package ma.ensa.jeeexame1.dao.daoImpl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import ma.ensa.jeeexame1.dao.BookDao;
import ma.ensa.jeeexame1.entity.Book;

public class BookImpl implements BookDao {
    private EntityManagerFactory emf;
    private EntityManager em;
    public BookImpl(){
        emf= Persistence.createEntityManagerFactory("exam");
        em=emf.createEntityManager();
    }
    @Override
    public void save(Book book) {

    }
    public void close(){
        em.close();
    }
}
