package main.beans;

import java.util.ArrayList;
import java.util.List;

/*
 * TODO
 *  @version 1.0
 *  @author Administrator
 *  @date   2023/3/4 16:02
 *
 * */
public class PropertyValues
{
    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public void addPropertyValue(PropertyValue pv) {
        this.propertyValueList.add(pv);
    }
    public PropertyValue[] getPropertyValues() {
        return this.propertyValueList.toArray(new PropertyValue[0]);
    }
    public PropertyValue getPropertyValue(String propertyName) {
        for (PropertyValue pv : this.propertyValueList) {
            if (pv.getName().equals(propertyName)) {
                return pv;
            }
        }
        return null;
    }
}
