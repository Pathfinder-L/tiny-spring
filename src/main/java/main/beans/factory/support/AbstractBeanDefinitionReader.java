package main.beans.factory.support;

import main.beans.core.io.DefaultResourceLoader;
import main.beans.core.io.ResourceLoader;

/*
 * TODO
 *  @version 1.0
 *  @author Administrator
 *  @date   2023/3/7 14:55
 *
 * */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader
{
    private final BeanDefinitionRegistry registry;
    private ResourceLoader resourceLoader;

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry,
                                        ResourceLoader resourceLoader)
    {
        this.registry = registry;
        this.resourceLoader = resourceLoader;
    }

    protected AbstractBeanDefinitionReader(BeanDefinitionRegistry registry)
    {
        this(registry, new DefaultResourceLoader());
    }


    @Override
    public BeanDefinitionRegistry getRegistry()
    {
        return registry;
    }

    @Override
    public ResourceLoader getResourceLoader()
    {
        return resourceLoader;
    }
}
