package test;

import main.beans.BeansException;
import main.beans.factory.BeanFactory;
import main.beans.factory.config.BeanDefinition;
import main.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;
import test.bean.UserService;

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
    public void test()
    {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 2. 注入 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        // 3.获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService", "小傅哥");
                userService.queryUserInfo();
    }

}
