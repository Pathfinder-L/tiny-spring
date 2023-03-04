package test;

import main.beans.BeansException;
import main.beans.PropertyValue;
import main.beans.PropertyValues;
import main.beans.factory.BeanFactory;
import main.beans.factory.config.BeanDefinition;
import main.beans.factory.config.BeanReference;
import main.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;
import test.bean.UserService;
import test.dao.UserDao;

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
    public void test_BeanFactory() {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. UserDao 注册
        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));

        System.out.println(beanFactory.getBean("userDao"));
        // 3. UserService 设置属性[uId、userDao]
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId", "10001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao",new BeanReference("userDao")));

        // 4. UserService 注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 5. UserService 获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

}
