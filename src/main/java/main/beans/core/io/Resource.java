package main.beans.core.io;

import java.io.IOException;
import java.io.InputStream;

/*
 * TODO
 *  @version 1.0
 *  @author Administrator
 *  @date   2023/3/7 14:39
 *
 * */
public interface Resource
{
    InputStream getInputStream() throws IOException;
}
