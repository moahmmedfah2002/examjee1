package ma.ensa.jeeexame1.dao;

import ma.ensa.jeeexame1.entity.User;

import java.util.List;

public interface UserDao {
    void save(User user);

    List<User> findAll();
}
