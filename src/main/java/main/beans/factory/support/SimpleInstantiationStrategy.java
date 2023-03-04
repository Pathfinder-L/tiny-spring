package main.beans.factory.support;

import main.beans.BeansException;
import main.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * TODO
 *  @version 1.0
 *  @author Administrator
 *  @date   2023/3/4 15:17
 *
 * */
public class SimpleInstantiationStrategy implements InstantiationStrategy
{

    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName,
                              Constructor ctor, Object[] args) throws BeansException
    {
        Class clazz = beanDefinition.getBeanClass();
        try
        {
            if (ctor != null)
                return clazz.getDeclaredConstructor(ctor.getParameterTypes()).newInstance(args);
            else return clazz.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e)
        {
            throw new BeansException("Failed to instantiate [" + clazz.getName() + "]", e);
        }

    }

}
