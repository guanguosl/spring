package cn.com.spring;

import cn.com.spring.dao.UserDAO;
import cn.com.spring.dto.UserDTO;
import cn.com.spring.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by guanyl on 2017/12/4.
 */
public class UserServiceTest {
    @Test
    public void t1()throws Exception{
        // dependency injection 依赖注入
        //inverse of control as DI
        // 1、初始化过程控制在容器里面
        // 2、具体的实现原先控制在自己程序中现在控制在容器中；
        // 3、依赖于实现，现在依赖于抽象
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("beans.xml");
        UserService userService=(UserService)beanFactory.getBean("userService");
        UserDTO u=new UserDTO();
        userService.add(u);

    }
}
