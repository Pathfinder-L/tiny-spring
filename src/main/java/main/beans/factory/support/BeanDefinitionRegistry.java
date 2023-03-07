package main.beans.factory.support;

import main.beans.factory.config.BeanDefinition;

/*
 * TODO
 *  @version 1.0
 *  @author Administrator
 *  @date   2023/3/4 14:14
 *
 * */
public interface BeanDefinitionRegistry
{
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    boolean containsBeanDefinition(String beanName);

}
