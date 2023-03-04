package main;

import main.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/*
 * TODO
 *  @version 1.0
 *  @author Administrator
 *  @date   2023/3/4 12:51
 *
 * */
public class BeanFactory
{

    private Map<String, BeanDefinition> beanDefinitionMap =
            new ConcurrentHashMap<>();

    public Object getBean(String name)
    {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name,
                                       BeanDefinition beanDefinition)
    {
        beanDefinitionMap.put(name, beanDefinition);
    }


}
