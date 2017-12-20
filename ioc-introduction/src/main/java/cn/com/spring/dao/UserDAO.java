package cn.com.spring.dao;

import cn.com.spring.dto.UserDTO;

/**
 * Created by guanyl on 2017/12/4.
 */
public class UserDAO {
    private UserDTO userDTO;

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }
}
