package ma.ensa.jeeexame1.dao.daoImpl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import ma.ensa.jeeexame1.dao.UserDao;
import ma.ensa.jeeexame1.entity.User;

import java.util.List;

public class UserImpl implements UserDao {
    private EntityManagerFactory emf;
    private EntityManager em;
    public UserImpl(){
        emf= Persistence.createEntityManagerFactory("exam");
        em=emf.createEntityManager();
    }

    @Override
    public void save(User user) {
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();

    }

    @Override
    public List<User> findAll() {

        return em.createQuery("select u from User u", User.class).getResultList();
    }

    public void close(){
        em.close();
    }
}
