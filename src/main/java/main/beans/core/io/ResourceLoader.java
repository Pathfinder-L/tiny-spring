package main.beans.core.io;

/*
 * TODO
 *  @version 1.0
 *  @author Administrator
 *  @date   2023/3/7 14:40
 *
 * */
public interface ResourceLoader
{

    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);
}
