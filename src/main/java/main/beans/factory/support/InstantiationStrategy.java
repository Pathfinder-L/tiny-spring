package main.beans.factory.support;

import main.beans.BeansException;
import main.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/*
 * TODO
 *  @version 1.0
 *  @author Administrator
 *  @date   2023/3/4 14:31
 *
 * */

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor
            ctor, Object[] args) throws BeansException;


}