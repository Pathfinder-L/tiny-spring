package main.beans.factory;

import main.beans.BeansException;
import main.beans.factory.config.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/*
 * TODO
 *  @version 1.0
 *  @author Administrator
 *  @date   2023/3/4 12:51
 *
 * */
public interface BeanFactory
{


    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;

}
