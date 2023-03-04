package main.beans.factory.support;

import main.beans.BeansException;
import main.beans.factory.BeanFactory;
import main.beans.factory.config.BeanDefinition;

/*
 * TODO
 *  @version 1.0
 *  @author Administrator
 *  @date   2023/3/4 14:22
 *
 * */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory
{

    @Override
    public Object getBean(String name) throws BeansException {
        return doGetBean(name, null);
    }

    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        return doGetBean(name, args);
    }

    protected <T> T doGetBean(final String name, final Object[] args) {
        Object bean = getSingleton(name);
        if (bean != null) {
            return (T) bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return (T) createBean(name, beanDefinition, args);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException;


}
