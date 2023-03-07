package main.beans.core.io;

import cn.hutool.core.lang.Assert;
import main.beans.utils.ClassUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/*
 * TODO
 *  @version 1.0
 *  @author Administrator
 *  @date   2023/3/7 14:40
 *
 * */


/*通过ClassLoader 读取class path 下的 文件信息 具体的 读取过程 实现 classLoader
.getResourceAsStream()*/
public class ClassPathResource implements Resource
{

    private final String path;

    private ClassLoader classLoader;

    public ClassPathResource(String path)
    {
        this(path, null);
    }

    public ClassPathResource(String path, ClassLoader classLoader)
    {
        Assert.notNull(path, "Path must not to be null");
        this.path = path;
        this.classLoader = (classLoader != null ? classLoader :
                ClassUtils.getDefaultClassLoader());
    }


    @Override
    public InputStream getInputStream() throws IOException
    {
        // System.out.println(path);
        //  System.out.println(classLoader);
        InputStream is = classLoader.getResourceAsStream(path);
        if (is == null)
        {
            throw new FileNotFoundException(this.path + "cannot be opened " + "because" + " it does not exist ");
        }
        return is;
    }

}
