package main.beans.factory.support;

import main.beans.BeansException;
import main.beans.factory.config.BeanDefinition;

/*
 * TODO
 *  @version 1.0
 *  @author Administrator
 *  @date   2023/3/4 14:21
 *
 * */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory
{


    @Override
    protected Object createBean(String beanName,
                                BeanDefinition beanDefinition) throws BeansException
    {
        Object bean = null;
        try
        {
            bean = beanDefinition.getBeanClass().newInstance();

        } catch (InstantiationException | IllegalAccessException e)
        {
            throw new BeansException("Instantiation of bean failed");
        }

        addSingleton(beanName, bean);
        return bean;
    }
}
