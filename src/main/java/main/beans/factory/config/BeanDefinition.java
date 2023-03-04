package main.beans.factory.config;

import main.beans.PropertyValues;

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

    private PropertyValues propertyValues;

    private Class beanClass;

    public BeanDefinition(Class beanClass)
    {
        this.beanClass = beanClass;
        this.propertyValues = new PropertyValues();
    }


    public BeanDefinition(Class beanClass, PropertyValues propertyValues)
    {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues != null ? propertyValues :
                new PropertyValues();
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

    public PropertyValues getPropertyValues()
    {
        return propertyValues;
    }
}
