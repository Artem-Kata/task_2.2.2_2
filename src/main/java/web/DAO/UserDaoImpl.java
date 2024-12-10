package web.DAO;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import web.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class UserDaoImpl {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public List<User> index () {
        return entityManager.createQuery("FROM User", User.class).getResultList();
    }

    @Transactional
    public void save(User user) {
        entityManager.persist(user);
    }

    @Transactional
    public void update(int id, User updatedUser) {
        User personToBeUpdated = show(id);
        personToBeUpdated.setName(updatedUser.getName());
        personToBeUpdated.setAge(updatedUser.getAge());
        personToBeUpdated.setEmail(updatedUser.getEmail());
        }

    @Transactional
    public User show (int id) {
        return entityManager.find(User.class, id);
    }

    @Transactional
    public void delete(int id) {
        User userToDelete = entityManager.find(User.class, id);
        if (userToDelete != null) {
            entityManager.remove(userToDelete);
        }
    }
}