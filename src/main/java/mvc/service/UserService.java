package mvc.service;


import mvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import mvc.DAO.UserDAO;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    private UserDAO userDAO;

    @Autowired
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }


    public List<User> allUsers() {
        return userDAO.allUsers();
    }


    public void save(User user) {
        userDAO.save(user);
    }


    public void delete(User user) {
        userDAO.delete(user);
    }


    public User getById(Long id) {
        return userDAO.getById(id);
    }
}