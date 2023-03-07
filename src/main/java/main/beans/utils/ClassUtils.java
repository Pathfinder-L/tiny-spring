package main.beans.utils;

/*
 * TODO
 *  @version 1.0
 *  @author Administrator
 *  @date   2023/3/7 14:41
 *
 * */
public class ClassUtils
{
    public static ClassLoader getDefaultClassLoader()
    {
        ClassLoader cl = null;
        try
        {
            cl = Thread.currentThread().getContextClassLoader();
        } catch (Throwable ex)
        {
            // Cannot access thread context ClassLoader - falling back to
            // system class loader...
        }
        if (cl == null)
        {
            // No thread context class loader -> use class loader of this class.
            cl = ClassUtils.class.getClassLoader();
        }
        return cl;
    }

}
