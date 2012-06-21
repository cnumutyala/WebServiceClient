/*
 * An XML document type.
 * Localname: GetWeatherByZipCode
 * Namespace: http://www.webservicex.net
 * Java type: net.webservicex.www.GetWeatherByZipCodeDocument
 *
 * Automatically generated - do not modify.
 */
package net.webservicex.www.impl;
/**
 * A document containing one GetWeatherByZipCode(@http://www.webservicex.net) element.
 *
 * This is a complex type.
 */
public class GetWeatherByZipCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.GetWeatherByZipCodeDocument
{
    
    public GetWeatherByZipCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETWEATHERBYZIPCODE$0 = 
        new javax.xml.namespace.QName("http://www.webservicex.net", "GetWeatherByZipCode");
    
    
    /**
     * Gets the "GetWeatherByZipCode" element
     */
    public net.webservicex.www.GetWeatherByZipCodeDocument.GetWeatherByZipCode getGetWeatherByZipCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetWeatherByZipCodeDocument.GetWeatherByZipCode target = null;
            target = (net.webservicex.www.GetWeatherByZipCodeDocument.GetWeatherByZipCode)get_store().find_element_user(GETWEATHERBYZIPCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetWeatherByZipCode" element
     */
    public void setGetWeatherByZipCode(net.webservicex.www.GetWeatherByZipCodeDocument.GetWeatherByZipCode getWeatherByZipCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetWeatherByZipCodeDocument.GetWeatherByZipCode target = null;
            target = (net.webservicex.www.GetWeatherByZipCodeDocument.GetWeatherByZipCode)get_store().find_element_user(GETWEATHERBYZIPCODE$0, 0);
            if (target == null)
            {
                target = (net.webservicex.www.GetWeatherByZipCodeDocument.GetWeatherByZipCode)get_store().add_element_user(GETWEATHERBYZIPCODE$0);
            }
            target.set(getWeatherByZipCode);
        }
    }
    
    /**
     * Appends and returns a new empty "GetWeatherByZipCode" element
     */
    public net.webservicex.www.GetWeatherByZipCodeDocument.GetWeatherByZipCode addNewGetWeatherByZipCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetWeatherByZipCodeDocument.GetWeatherByZipCode target = null;
            target = (net.webservicex.www.GetWeatherByZipCodeDocument.GetWeatherByZipCode)get_store().add_element_user(GETWEATHERBYZIPCODE$0);
            return target;
        }
    }
    /**
     * An XML GetWeatherByZipCode(@http://www.webservicex.net).
     *
     * This is a complex type.
     */
    public static class GetWeatherByZipCodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.GetWeatherByZipCodeDocument.GetWeatherByZipCode
    {
        
        public GetWeatherByZipCodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ZIPCODE$0 = 
            new javax.xml.namespace.QName("http://www.webservicex.net", "ZipCode");
        
        
        /**
         * Gets the "ZipCode" element
         */
        public java.lang.String getZipCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZIPCODE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ZipCode" element
         */
        public org.apache.xmlbeans.XmlString xgetZipCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZIPCODE$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "ZipCode" element
         */
        public boolean isSetZipCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ZIPCODE$0) != 0;
            }
        }
        
        /**
         * Sets the "ZipCode" element
         */
        public void setZipCode(java.lang.String zipCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZIPCODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ZIPCODE$0);
                }
                target.setStringValue(zipCode);
            }
        }
        
        /**
         * Sets (as xml) the "ZipCode" element
         */
        public void xsetZipCode(org.apache.xmlbeans.XmlString zipCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZIPCODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ZIPCODE$0);
                }
                target.set(zipCode);
            }
        }
        
        /**
         * Unsets the "ZipCode" element
         */
        public void unsetZipCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ZIPCODE$0, 0);
            }
        }
    }
}
