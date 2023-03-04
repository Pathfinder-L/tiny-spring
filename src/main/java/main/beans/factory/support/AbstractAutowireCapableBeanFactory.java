package main.beans.factory.support;

import cn.hutool.core.bean.BeanUtil;
import main.beans.BeansException;
import main.beans.PropertyValue;
import main.beans.PropertyValues;
import main.beans.factory.config.BeanDefinition;
import main.beans.factory.config.BeanReference;

import java.lang.reflect.Constructor;

/*
 * TODO
 *  @version 1.0
 *  @author Administrator
 *  @date   2023/3/4 14:21
 *
 * */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory
{
    private InstantiationStrategy instantiationStrategy =
            new SimpleInstantiationStrategy();


    @Override
    protected Object createBean(String beanName,
                                BeanDefinition beanDefinition, Object[] args) throws BeansException
    {
        Object bean = null;
        try
        {
            bean = createBeanInstance(beanDefinition, beanName, args);
            // 进行属性填充
            System.out.println(bean);
            applyPropertyValues(beanName, bean, beanDefinition);

        } catch (Exception e)
        {
            throw new BeansException("Instantiation of bean failed", e);
        }

        addSingleton(beanName, bean);
        return bean;
    }

    protected void applyPropertyValues(String beanName, Object bean, BeanDefinition beanDefinition) {
        try {
            PropertyValues propertyValues = beanDefinition.getPropertyValues();

            for (PropertyValue propertyValue : propertyValues.getPropertyValues()) {

                String name = propertyValue.getName();
                Object value = propertyValue.getValue();
                System.out.println("name:"+name+"value:"+value);
                if (value instanceof BeanReference) {
                    // A 依赖 B，获取 B 的实例化
                    BeanReference beanReference = (BeanReference) value;
                    value = getBean(beanReference.getBeanName());
                }
                // 属性填充
                BeanUtil.setFieldValue(bean, name, value);
            }
        } catch (Exception e) {
            throw new BeansException("Error setting property values：" + beanName);
        }
    }


    protected Object createBeanInstance(BeanDefinition beanDefinition,
                                        String beanName, Object[] args)
    {
        Constructor constructorToUse = null;
        Class<?> beanClass = beanDefinition.getBeanClass();
        Constructor<?>[] declaredConstructors =
                beanClass.getDeclaredConstructors();
        for (Constructor ctor : declaredConstructors)
        {
            if (null != args && ctor.getParameterTypes().length == args.length)
            {
                constructorToUse = ctor;
                break;
            }
        }
        return getInstantiationStrategy().instantiate(beanDefinition,
                beanName, constructorToUse, args);
    }

    public InstantiationStrategy getInstantiationStrategy()
    {
        return instantiationStrategy;
    }

    public void setInstantiationStrategy(InstantiationStrategy instantiationStrategy)
    {
        this.instantiationStrategy = instantiationStrategy;
    }
}
