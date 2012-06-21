/*
 * An XML document type.
 * Localname: WeatherForecasts
 * Namespace: http://www.webservicex.net
 * Java type: net.webservicex.www.WeatherForecastsDocument
 *
 * Automatically generated - do not modify.
 */
package net.webservicex.www.impl;
/**
 * A document containing one WeatherForecasts(@http://www.webservicex.net) element.
 *
 * This is a complex type.
 */
public class WeatherForecastsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.WeatherForecastsDocument
{
    
    public WeatherForecastsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WEATHERFORECASTS$0 = 
        new javax.xml.namespace.QName("http://www.webservicex.net", "WeatherForecasts");
    
    
    /**
     * Gets the "WeatherForecasts" element
     */
    public net.webservicex.www.WeatherForecasts getWeatherForecasts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.WeatherForecasts target = null;
            target = (net.webservicex.www.WeatherForecasts)get_store().find_element_user(WEATHERFORECASTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "WeatherForecasts" element
     */
    public void setWeatherForecasts(net.webservicex.www.WeatherForecasts weatherForecasts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.WeatherForecasts target = null;
            target = (net.webservicex.www.WeatherForecasts)get_store().find_element_user(WEATHERFORECASTS$0, 0);
            if (target == null)
            {
                target = (net.webservicex.www.WeatherForecasts)get_store().add_element_user(WEATHERFORECASTS$0);
            }
            target.set(weatherForecasts);
        }
    }
    
    /**
     * Appends and returns a new empty "WeatherForecasts" element
     */
    public net.webservicex.www.WeatherForecasts addNewWeatherForecasts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.WeatherForecasts target = null;
            target = (net.webservicex.www.WeatherForecasts)get_store().add_element_user(WEATHERFORECASTS$0);
            return target;
        }
    }
}
