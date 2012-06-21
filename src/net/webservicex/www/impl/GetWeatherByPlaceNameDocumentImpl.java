/*
 * An XML document type.
 * Localname: GetWeatherByPlaceName
 * Namespace: http://www.webservicex.net
 * Java type: net.webservicex.www.GetWeatherByPlaceNameDocument
 *
 * Automatically generated - do not modify.
 */
package net.webservicex.www.impl;
/**
 * A document containing one GetWeatherByPlaceName(@http://www.webservicex.net) element.
 *
 * This is a complex type.
 */
public class GetWeatherByPlaceNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.GetWeatherByPlaceNameDocument
{
    
    public GetWeatherByPlaceNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETWEATHERBYPLACENAME$0 = 
        new javax.xml.namespace.QName("http://www.webservicex.net", "GetWeatherByPlaceName");
    
    
    /**
     * Gets the "GetWeatherByPlaceName" element
     */
    public net.webservicex.www.GetWeatherByPlaceNameDocument.GetWeatherByPlaceName getGetWeatherByPlaceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetWeatherByPlaceNameDocument.GetWeatherByPlaceName target = null;
            target = (net.webservicex.www.GetWeatherByPlaceNameDocument.GetWeatherByPlaceName)get_store().find_element_user(GETWEATHERBYPLACENAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetWeatherByPlaceName" element
     */
    public void setGetWeatherByPlaceName(net.webservicex.www.GetWeatherByPlaceNameDocument.GetWeatherByPlaceName getWeatherByPlaceName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetWeatherByPlaceNameDocument.GetWeatherByPlaceName target = null;
            target = (net.webservicex.www.GetWeatherByPlaceNameDocument.GetWeatherByPlaceName)get_store().find_element_user(GETWEATHERBYPLACENAME$0, 0);
            if (target == null)
            {
                target = (net.webservicex.www.GetWeatherByPlaceNameDocument.GetWeatherByPlaceName)get_store().add_element_user(GETWEATHERBYPLACENAME$0);
            }
            target.set(getWeatherByPlaceName);
        }
    }
    
    /**
     * Appends and returns a new empty "GetWeatherByPlaceName" element
     */
    public net.webservicex.www.GetWeatherByPlaceNameDocument.GetWeatherByPlaceName addNewGetWeatherByPlaceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetWeatherByPlaceNameDocument.GetWeatherByPlaceName target = null;
            target = (net.webservicex.www.GetWeatherByPlaceNameDocument.GetWeatherByPlaceName)get_store().add_element_user(GETWEATHERBYPLACENAME$0);
            return target;
        }
    }
    /**
     * An XML GetWeatherByPlaceName(@http://www.webservicex.net).
     *
     * This is a complex type.
     */
    public static class GetWeatherByPlaceNameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.GetWeatherByPlaceNameDocument.GetWeatherByPlaceName
    {
        
        public GetWeatherByPlaceNameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PLACENAME$0 = 
            new javax.xml.namespace.QName("http://www.webservicex.net", "PlaceName");
        
        
        /**
         * Gets the "PlaceName" element
         */
        public java.lang.String getPlaceName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLACENAME$0, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PLACENAME$0, 0);
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
                return get_store().count_elements(PLACENAME$0) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLACENAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PLACENAME$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PLACENAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PLACENAME$0);
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
                get_store().remove_element(PLACENAME$0, 0);
            }
        }
    }
}
