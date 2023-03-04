package main.beans.factory.config;

/*
 * TODO
 *  @version 1.0
 *  @author Administrator
 *  @date   2023/3/4 16:10
 *
 * */

// Bean对象引用
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

}
