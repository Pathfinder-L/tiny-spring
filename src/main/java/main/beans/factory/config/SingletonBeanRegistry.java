package main.beans.factory.config;

/*
 * TODO
 *  @version 1.0
 *  @author Administrator
 *  @date   2023/3/4 14:21
 *
 * */

/*单例注册接口实现*/
public interface SingletonBeanRegistry
{

    Object getSingleton(String beanName);
}
