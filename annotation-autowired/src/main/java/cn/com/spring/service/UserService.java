package cn.com.spring.service;

import cn.com.spring.dao.UserDAO;
import cn.com.spring.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by guanyl on 2017/12/4.
 */
public class UserService {
    private UserDAO userDAO;

    public UserService() {
        super();
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

    @Autowired
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void add(UserDTO userDTO){
        System.out.println("save user!!");
    }
}
