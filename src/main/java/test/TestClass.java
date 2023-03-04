package test;

import main.BeanDefinition;
import main.BeanFactory;
import org.junit.Test;
import test.bean.UserService;

import javax.annotation.Resource;

/*
 * TODO
 *  @version 1.0
 *  @author Administrator
 *  @date   2023/3/4 12:56
 *
 * */

public class TestClass
{

    @Test
    public void test_beanFactory()
    {
        BeanFactory beanFactory = new BeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean(
                "userService");
        userService.queryUserInfo();

    }

}
