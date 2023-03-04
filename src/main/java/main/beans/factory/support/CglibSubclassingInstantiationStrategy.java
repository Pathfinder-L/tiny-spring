package main.beans.factory.support;

import main.beans.BeansException;
import main.beans.factory.config.BeanDefinition;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.NoOp;


import java.lang.reflect.Constructor;

/*
 * TODO
 *  @version 1.0
 *  @author Administrator
 *  @date   2023/3/4 15:22
 *
 * */
public class CglibSubclassingInstantiationStrategy implements InstantiationStrategy
{

    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException
    {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(beanDefinition.getBeanClass());
        enhancer.setCallback(new NoOp() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });
        if (null == ctor) return enhancer.create();
        return enhancer.create(ctor.getParameterTypes(), args);
    }
}
