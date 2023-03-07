package main.beans.factory.support;

import main.beans.BeansException;
import main.beans.core.io.Resource;
import main.beans.core.io.ResourceLoader;

/*
 * TODO
 *  @version 1.0
 *  @author Administrator
 *  @date   2023/3/7 14:53
 *
 * */
public interface BeanDefinitionReader
{
    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;
}
