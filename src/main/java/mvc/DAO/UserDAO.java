package mvc.DAO;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import mvc.model.User;

import javax.persistence.*;
import java.util.List;

@Component
@Transactional
public class UserDAO {
    @PersistenceContext
    private EntityManager entityManager;

    public UserDAO() {
    }

    public List<User> allUsers() {
        List<User> resultList = entityManager.createQuery("SELECT user FROM User user", User.class).getResultList();
        return resultList;
    }

    @Transactional
    public void save(User user) {
        User managed = entityManager.merge(user);
        entityManager.persist(managed);
    }

    @Transactional
    public void delete(User user) {
        User managed = entityManager.merge(user);
        entityManager.remove(managed);
    }


    public User getById(Long id) {
        return entityManager.find(User.class, id);
    }
}