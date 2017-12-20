package cn.com.spring.service;

import cn.com.spring.dao.UserDAO;
import cn.com.spring.dto.UserDTO;

/**
 * Created by guanyl on 2017/12/4.
 */
public class UserService {
    private UserDAO userDAO;

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void add(UserDTO userDTO){
        System.out.println("save user!!");
    }
}
