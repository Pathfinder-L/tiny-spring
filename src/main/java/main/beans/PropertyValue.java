package main.beans;

/*
 * TODO
 *  @version 1.0
 *  @author Administrator
 *  @date   2023/3/4 16:00
 *
 * */
public class PropertyValue
{
    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value)
    {
        this.name = name;
        this.value = value;
    }

    public String getName()
    {
        return name;
    }

    public Object getValue()
    {
        return value;
    }
}
