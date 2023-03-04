package main.beans.factory.support;

import main.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/*
 * TODO
 *  @version 1.0
 *  @author Administrator
 *  @date   2023/3/4 14:22
 *
 * */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry
{

    private Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName)
    {
        return singletonObjects.get(beanName);
    }


    protected void addSingleton(String beanName, Object singletonObject)
    {
        singletonObjects.put(beanName, singletonObject);
    }
}

