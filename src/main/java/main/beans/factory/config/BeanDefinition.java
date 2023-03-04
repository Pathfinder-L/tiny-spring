package main.beans.factory.config;

/*
 * TODO
 *  @version 1.0
 *  @author Administrator
 *  @date   2023/3/4 12:51
 *
 * */
public class BeanDefinition
{

    private Object bean;

    private Class beanClass;

    public BeanDefinition(Class beanClass)
    {
        this.beanClass = beanClass;
    }

    public BeanDefinition(Object bean)
    {
        this.bean = bean;
    }

    public Object getBean()
    {
        return bean;
    }

    public void setBean(Object bean)
    {
        this.bean = bean;
    }


    public Class getBeanClass()
    {
        return beanClass;
    }
}
