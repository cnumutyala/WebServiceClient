/*
 * XML Type:  WeatherForecasts
 * Namespace: http://www.webservicex.net
 * Java type: net.webservicex.www.WeatherForecasts
 *
 * Automatically generated - do not modify.
 */
package net.webservicex.www.impl;
/**
 * An XML WeatherForecasts(@http://www.webservicex.net).
 *
 * This is a complex type.
 */
public class WeatherForecastsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.WeatherForecasts
{
    
    public WeatherForecastsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LATITUDE$0 = 
        new javax.xml.namespace.QName("http://www.webservicex.net", "Latitude");
    private static final javax.xml.namespace.QName LONGITUDE$2 = 
        new javax.xml.namespace.QName("http://www.webservicex.net", "Longitude");
    private static final javax.xml.namespace.QName ALLOCATIONFACTOR$4 = 
        new javax.xml.namespace.QName("http://www.webservicex.net", "AllocationFactor");
    private static final javax.xml.namespace.QName FIPSCODE$6 = 
        new javax.xml.namespace.QName("http://www.webservicex.net", "FipsCode");
    private static final javax.xml.namespace.QName PLACENAME$8 = 
        new javax.xml.namespace.QName("http://www.webservicex.net", "PlaceName");
    private static final javax.xml.namespace.QName STATECODE$10 = 
        new javax.xml.namespace.QName("http://www.webservicex.net", "StateCode");
    private static final javax.xml.namespace.QName STATUS$12 = 
        new javax.xml.namespace.QName("http://www.webservicex.net", "Status");
    private static final javax.xml.namespace.QName DETAILS$14 = 
        new javax.xml.namespace.QName("http://www.webservicex.net", "Details");
    
    
    /**
     * Gets the "Latitude" element
     */
    public float getLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$0, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "Latitude" element
     */
    public org.apache.xmlbeans.XmlFloat xgetLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(LATITUDE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Latitude" element
     */
    public void setLatitude(float latitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LATITUDE$0);
            }
            target.setFloatValue(latitude);
        }
    }
    
    /**
     * Sets (as xml) the "Latitude" element
     */
    public void xsetLatitude(org.apache.xmlbeans.XmlFloat latitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(LATITUDE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(LATITUDE$0);
            }
            target.set(latitude);
        }
    }
    
    /**
     * Gets the "Longitude" element
     */
    public float getLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$2, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "Longitude" element
     */
    public org.apache.xmlbeans.XmlFloat xgetLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(LONGITUDE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Longitude" element
     */
    public void setLongitude(float longitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LONGITUDE$2);
            }
            target.setFloatValue(longitude);
        }
    }
    
    /**
     * Sets (as xml) the "Longitude" element
     */
    public void xsetLongitude(org.apache.xmlbeans.XmlFloat longitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(LONGITUDE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(LONGITUDE$2);
            }
            target.set(longitude);
        }
    }
    
    /**
     * Gets the "AllocationFactor" element
     */
    public float getAllocationFactor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALLOCATIONFACTOR$4, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "AllocationFactor" element
     */
    public org.apache.xmlbeans.XmlFloat xgetAllocationFactor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(ALLOCATIONFACTOR$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AllocationFactor" element
     */
    public void setAllocationFactor(float allocationFactor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALLOCATIONFACTOR$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALLOCATIONFACTOR$4);
            }
            target.setFloatValue(allocationFactor);
        }
    }
    
    /**
     * Sets (as xml) the "AllocationFactor" element
     */
    public void xsetAllocationFactor(org.apache.xmlbeans.XmlFloat allocationFactor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(ALLOCATIONFACTOR$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(ALLOCATIONFACTOR$4);
            }
            target.set(allocationFactor);
        }
    }
    
    /**
     * Gets the "FipsCode" element
     */
    public java.lang.String getFipsCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIPSCODE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FipsCode" element
     */
    public org.apache.xmlbeans.XmlString xgetFipsCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIPSCODE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "FipsCode" element
     */
    public boolean isSetFipsCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FIPSCODE$6) != 0;
        }
    }
    
    /**
     * Sets the "FipsCode" element
     */
    public void setFipsCode(java.lang.String fipsCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIPSCODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIPSCODE$6);
            }
            target.setStringValue(fipsCode);
        }
    }
    
    /**
     * Sets (as xml) the "FipsCode" element
     */
    public void xsetFipsCode(org.apache.xmlbeans.XmlString fipsCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIPSCODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FIPSCODE$6);
            }
            target.set(fipsCode);
        }
    }
    
    /**
     * Unsets the "FipsCode" element
     */
    public void unsetFipsCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FIPSCODE$6, 0);
        }
    }
    
    /**
     * Gets the "PlaceName" element
     */
    public java.lang.String getPlaceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLACENAME$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PlaceName" element
     */
    public org.apache.xmlbeans.XmlString xgetPlaceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PLACENAME$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "PlaceName" element
     */
    public boolean isSetPlaceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLACENAME$8) != 0;
        }
    }
    
    /**
     * Sets the "PlaceName" element
     */
    public void setPlaceName(java.lang.String placeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLACENAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PLACENAME$8);
            }
            target.setStringValue(placeName);
        }
    }
    
    /**
     * Sets (as xml) the "PlaceName" element
     */
    public void xsetPlaceName(org.apache.xmlbeans.XmlString placeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PLACENAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PLACENAME$8);
            }
            target.set(placeName);
        }
    }
    
    /**
     * Unsets the "PlaceName" element
     */
    public void unsetPlaceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLACENAME$8, 0);
        }
    }
    
    /**
     * Gets the "StateCode" element
     */
    public java.lang.String getStateCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATECODE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "StateCode" element
     */
    public org.apache.xmlbeans.XmlString xgetStateCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATECODE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "StateCode" element
     */
    public boolean isSetStateCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATECODE$10) != 0;
        }
    }
    
    /**
     * Sets the "StateCode" element
     */
    public void setStateCode(java.lang.String stateCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATECODE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATECODE$10);
            }
            target.setStringValue(stateCode);
        }
    }
    
    /**
     * Sets (as xml) the "StateCode" element
     */
    public void xsetStateCode(org.apache.xmlbeans.XmlString stateCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATECODE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATECODE$10);
            }
            target.set(stateCode);
        }
    }
    
    /**
     * Unsets the "StateCode" element
     */
    public void unsetStateCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATECODE$10, 0);
        }
    }
    
    /**
     * Gets the "Status" element
     */
    public java.lang.String getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Status" element
     */
    public org.apache.xmlbeans.XmlString xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "Status" element
     */
    public boolean isSetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUS$12) != 0;
        }
    }
    
    /**
     * Sets the "Status" element
     */
    public void setStatus(java.lang.String status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$12);
            }
            target.setStringValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "Status" element
     */
    public void xsetStatus(org.apache.xmlbeans.XmlString status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUS$12);
            }
            target.set(status);
        }
    }
    
    /**
     * Unsets the "Status" element
     */
    public void unsetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUS$12, 0);
        }
    }
    
    /**
     * Gets the "Details" element
     */
    public net.webservicex.www.ArrayOfWeatherData getDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.ArrayOfWeatherData target = null;
            target = (net.webservicex.www.ArrayOfWeatherData)get_store().find_element_user(DETAILS$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Details" element
     */
    public boolean isSetDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DETAILS$14) != 0;
        }
    }
    
    /**
     * Sets the "Details" element
     */
    public void setDetails(net.webservicex.www.ArrayOfWeatherData details)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.ArrayOfWeatherData target = null;
            target = (net.webservicex.www.ArrayOfWeatherData)get_store().find_element_user(DETAILS$14, 0);
            if (target == null)
            {
                target = (net.webservicex.www.ArrayOfWeatherData)get_store().add_element_user(DETAILS$14);
            }
            target.set(details);
        }
    }
    
    /**
     * Appends and returns a new empty "Details" element
     */
    public net.webservicex.www.ArrayOfWeatherData addNewDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.ArrayOfWeatherData target = null;
            target = (net.webservicex.www.ArrayOfWeatherData)get_store().add_element_user(DETAILS$14);
            return target;
        }
    }
    
    /**
     * Unsets the "Details" element
     */
    public void unsetDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DETAILS$14, 0);
        }
    }
}
