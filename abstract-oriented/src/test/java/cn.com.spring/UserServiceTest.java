package cn.com.spring;

import cn.com.spring.dao.UserDAO;
import cn.com.spring.dto.UserDTO;
import cn.com.spring.service.UserService;
import cn.com.spring.spring.BeanFactory;
import cn.com.spring.spring.ClassPathXmlApplicationContext;
import org.junit.Test;

/**
 * Created by guanyl on 2017/12/4.
 */
public class UserServiceTest {
    @Test
    public void t()throws Exception{
        BeanFactory beanFactory=new ClassPathXmlApplicationContext();
        UserDAO userDAO=(UserDAO)beanFactory.getBean("u");
        UserService userService=new UserService();
        userService.setUserDAO(userDAO);
        UserDTO u=new UserDTO();
        userService.add(u);

    }
}
