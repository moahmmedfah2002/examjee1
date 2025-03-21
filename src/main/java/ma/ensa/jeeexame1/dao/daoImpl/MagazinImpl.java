package ma.ensa.jeeexame1.dao.daoImpl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import ma.ensa.jeeexame1.dao.MagazinDao;
import ma.ensa.jeeexame1.entity.Magazine;

public class MagazinImpl  implements MagazinDao {
    private EntityManagerFactory emf;
    private EntityManager em;
    public MagazinImpl(){
        emf= Persistence.createEntityManagerFactory("exam");
        em=emf.createEntityManager();
    }
    @Override
    public void save(Magazine magazine) {

    }
    public  void  close(){
        em.close();
    }

}
