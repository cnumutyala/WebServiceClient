/*
 * XML Type:  WeatherData
 * Namespace: http://www.webservicex.net
 * Java type: net.webservicex.www.WeatherData
 *
 * Automatically generated - do not modify.
 */
package net.webservicex.www.impl;
/**
 * An XML WeatherData(@http://www.webservicex.net).
 *
 * This is a complex type.
 */
public class WeatherDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.WeatherData
{
    
    public WeatherDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DAY$0 = 
        new javax.xml.namespace.QName("http://www.webservicex.net", "Day");
    private static final javax.xml.namespace.QName WEATHERIMAGE$2 = 
        new javax.xml.namespace.QName("http://www.webservicex.net", "WeatherImage");
    private static final javax.xml.namespace.QName MAXTEMPERATUREF$4 = 
        new javax.xml.namespace.QName("http://www.webservicex.net", "MaxTemperatureF");
    private static final javax.xml.namespace.QName MINTEMPERATUREF$6 = 
        new javax.xml.namespace.QName("http://www.webservicex.net", "MinTemperatureF");
    private static final javax.xml.namespace.QName MAXTEMPERATUREC$8 = 
        new javax.xml.namespace.QName("http://www.webservicex.net", "MaxTemperatureC");
    private static final javax.xml.namespace.QName MINTEMPERATUREC$10 = 
        new javax.xml.namespace.QName("http://www.webservicex.net", "MinTemperatureC");
    
    
    /**
     * Gets the "Day" element
     */
    public java.lang.String getDay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DAY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Day" element
     */
    public org.apache.xmlbeans.XmlString xgetDay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DAY$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Day" element
     */
    public boolean isSetDay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DAY$0) != 0;
        }
    }
    
    /**
     * Sets the "Day" element
     */
    public void setDay(java.lang.String day)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DAY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DAY$0);
            }
            target.setStringValue(day);
        }
    }
    
    /**
     * Sets (as xml) the "Day" element
     */
    public void xsetDay(org.apache.xmlbeans.XmlString day)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DAY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DAY$0);
            }
            target.set(day);
        }
    }
    
    /**
     * Unsets the "Day" element
     */
    public void unsetDay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DAY$0, 0);
        }
    }
    
    /**
     * Gets the "WeatherImage" element
     */
    public java.lang.String getWeatherImage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEATHERIMAGE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "WeatherImage" element
     */
    public org.apache.xmlbeans.XmlString xgetWeatherImage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEATHERIMAGE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "WeatherImage" element
     */
    public boolean isSetWeatherImage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WEATHERIMAGE$2) != 0;
        }
    }
    
    /**
     * Sets the "WeatherImage" element
     */
    public void setWeatherImage(java.lang.String weatherImage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEATHERIMAGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WEATHERIMAGE$2);
            }
            target.setStringValue(weatherImage);
        }
    }
    
    /**
     * Sets (as xml) the "WeatherImage" element
     */
    public void xsetWeatherImage(org.apache.xmlbeans.XmlString weatherImage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEATHERIMAGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WEATHERIMAGE$2);
            }
            target.set(weatherImage);
        }
    }
    
    /**
     * Unsets the "WeatherImage" element
     */
    public void unsetWeatherImage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WEATHERIMAGE$2, 0);
        }
    }
    
    /**
     * Gets the "MaxTemperatureF" element
     */
    public java.lang.String getMaxTemperatureF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXTEMPERATUREF$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MaxTemperatureF" element
     */
    public org.apache.xmlbeans.XmlString xgetMaxTemperatureF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAXTEMPERATUREF$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "MaxTemperatureF" element
     */
    public boolean isSetMaxTemperatureF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXTEMPERATUREF$4) != 0;
        }
    }
    
    /**
     * Sets the "MaxTemperatureF" element
     */
    public void setMaxTemperatureF(java.lang.String maxTemperatureF)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXTEMPERATUREF$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXTEMPERATUREF$4);
            }
            target.setStringValue(maxTemperatureF);
        }
    }
    
    /**
     * Sets (as xml) the "MaxTemperatureF" element
     */
    public void xsetMaxTemperatureF(org.apache.xmlbeans.XmlString maxTemperatureF)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAXTEMPERATUREF$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MAXTEMPERATUREF$4);
            }
            target.set(maxTemperatureF);
        }
    }
    
    /**
     * Unsets the "MaxTemperatureF" element
     */
    public void unsetMaxTemperatureF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXTEMPERATUREF$4, 0);
        }
    }
    
    /**
     * Gets the "MinTemperatureF" element
     */
    public java.lang.String getMinTemperatureF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINTEMPERATUREF$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MinTemperatureF" element
     */
    public org.apache.xmlbeans.XmlString xgetMinTemperatureF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MINTEMPERATUREF$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "MinTemperatureF" element
     */
    public boolean isSetMinTemperatureF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MINTEMPERATUREF$6) != 0;
        }
    }
    
    /**
     * Sets the "MinTemperatureF" element
     */
    public void setMinTemperatureF(java.lang.String minTemperatureF)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINTEMPERATUREF$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINTEMPERATUREF$6);
            }
            target.setStringValue(minTemperatureF);
        }
    }
    
    /**
     * Sets (as xml) the "MinTemperatureF" element
     */
    public void xsetMinTemperatureF(org.apache.xmlbeans.XmlString minTemperatureF)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MINTEMPERATUREF$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MINTEMPERATUREF$6);
            }
            target.set(minTemperatureF);
        }
    }
    
    /**
     * Unsets the "MinTemperatureF" element
     */
    public void unsetMinTemperatureF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MINTEMPERATUREF$6, 0);
        }
    }
    
    /**
     * Gets the "MaxTemperatureC" element
     */
    public java.lang.String getMaxTemperatureC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXTEMPERATUREC$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MaxTemperatureC" element
     */
    public org.apache.xmlbeans.XmlString xgetMaxTemperatureC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAXTEMPERATUREC$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "MaxTemperatureC" element
     */
    public boolean isSetMaxTemperatureC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXTEMPERATUREC$8) != 0;
        }
    }
    
    /**
     * Sets the "MaxTemperatureC" element
     */
    public void setMaxTemperatureC(java.lang.String maxTemperatureC)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXTEMPERATUREC$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXTEMPERATUREC$8);
            }
            target.setStringValue(maxTemperatureC);
        }
    }
    
    /**
     * Sets (as xml) the "MaxTemperatureC" element
     */
    public void xsetMaxTemperatureC(org.apache.xmlbeans.XmlString maxTemperatureC)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAXTEMPERATUREC$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MAXTEMPERATUREC$8);
            }
            target.set(maxTemperatureC);
        }
    }
    
    /**
     * Unsets the "MaxTemperatureC" element
     */
    public void unsetMaxTemperatureC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXTEMPERATUREC$8, 0);
        }
    }
    
    /**
     * Gets the "MinTemperatureC" element
     */
    public java.lang.String getMinTemperatureC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINTEMPERATUREC$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MinTemperatureC" element
     */
    public org.apache.xmlbeans.XmlString xgetMinTemperatureC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MINTEMPERATUREC$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "MinTemperatureC" element
     */
    public boolean isSetMinTemperatureC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MINTEMPERATUREC$10) != 0;
        }
    }
    
    /**
     * Sets the "MinTemperatureC" element
     */
    public void setMinTemperatureC(java.lang.String minTemperatureC)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINTEMPERATUREC$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINTEMPERATUREC$10);
            }
            target.setStringValue(minTemperatureC);
        }
    }
    
    /**
     * Sets (as xml) the "MinTemperatureC" element
     */
    public void xsetMinTemperatureC(org.apache.xmlbeans.XmlString minTemperatureC)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MINTEMPERATUREC$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MINTEMPERATUREC$10);
            }
            target.set(minTemperatureC);
        }
    }
    
    /**
     * Unsets the "MinTemperatureC" element
     */
    public void unsetMinTemperatureC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MINTEMPERATUREC$10, 0);
        }
    }
}
