/*
 * XML Type:  ArrayOfWeatherData
 * Namespace: http://www.webservicex.net
 * Java type: net.webservicex.www.ArrayOfWeatherData
 *
 * Automatically generated - do not modify.
 */
package net.webservicex.www.impl;
/**
 * An XML ArrayOfWeatherData(@http://www.webservicex.net).
 *
 * This is a complex type.
 */
public class ArrayOfWeatherDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.ArrayOfWeatherData
{
    
    public ArrayOfWeatherDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WEATHERDATA$0 = 
        new javax.xml.namespace.QName("http://www.webservicex.net", "WeatherData");
    
    
    /**
     * Gets array of all "WeatherData" elements
     */
    public net.webservicex.www.WeatherData[] getWeatherDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WEATHERDATA$0, targetList);
            net.webservicex.www.WeatherData[] result = new net.webservicex.www.WeatherData[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "WeatherData" element
     */
    public net.webservicex.www.WeatherData getWeatherDataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.WeatherData target = null;
            target = (net.webservicex.www.WeatherData)get_store().find_element_user(WEATHERDATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "WeatherData" element
     */
    public int sizeOfWeatherDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WEATHERDATA$0);
        }
    }
    
    /**
     * Sets array of all "WeatherData" element
     */
    public void setWeatherDataArray(net.webservicex.www.WeatherData[] weatherDataArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(weatherDataArray, WEATHERDATA$0);
        }
    }
    
    /**
     * Sets ith "WeatherData" element
     */
    public void setWeatherDataArray(int i, net.webservicex.www.WeatherData weatherData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.WeatherData target = null;
            target = (net.webservicex.www.WeatherData)get_store().find_element_user(WEATHERDATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(weatherData);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "WeatherData" element
     */
    public net.webservicex.www.WeatherData insertNewWeatherData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.WeatherData target = null;
            target = (net.webservicex.www.WeatherData)get_store().insert_element_user(WEATHERDATA$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "WeatherData" element
     */
    public net.webservicex.www.WeatherData addNewWeatherData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.WeatherData target = null;
            target = (net.webservicex.www.WeatherData)get_store().add_element_user(WEATHERDATA$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "WeatherData" element
     */
    public void removeWeatherData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WEATHERDATA$0, i);
        }
    }
}
