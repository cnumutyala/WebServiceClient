/*
 * An XML document type.
 * Localname: GetWeatherByZipCodeResponse
 * Namespace: http://www.webservicex.net
 * Java type: net.webservicex.www.GetWeatherByZipCodeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package net.webservicex.www.impl;
/**
 * A document containing one GetWeatherByZipCodeResponse(@http://www.webservicex.net) element.
 *
 * This is a complex type.
 */
public class GetWeatherByZipCodeResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.GetWeatherByZipCodeResponseDocument
{
    
    public GetWeatherByZipCodeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETWEATHERBYZIPCODERESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.webservicex.net", "GetWeatherByZipCodeResponse");
    
    
    /**
     * Gets the "GetWeatherByZipCodeResponse" element
     */
    public net.webservicex.www.GetWeatherByZipCodeResponseDocument.GetWeatherByZipCodeResponse getGetWeatherByZipCodeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetWeatherByZipCodeResponseDocument.GetWeatherByZipCodeResponse target = null;
            target = (net.webservicex.www.GetWeatherByZipCodeResponseDocument.GetWeatherByZipCodeResponse)get_store().find_element_user(GETWEATHERBYZIPCODERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetWeatherByZipCodeResponse" element
     */
    public void setGetWeatherByZipCodeResponse(net.webservicex.www.GetWeatherByZipCodeResponseDocument.GetWeatherByZipCodeResponse getWeatherByZipCodeResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetWeatherByZipCodeResponseDocument.GetWeatherByZipCodeResponse target = null;
            target = (net.webservicex.www.GetWeatherByZipCodeResponseDocument.GetWeatherByZipCodeResponse)get_store().find_element_user(GETWEATHERBYZIPCODERESPONSE$0, 0);
            if (target == null)
            {
                target = (net.webservicex.www.GetWeatherByZipCodeResponseDocument.GetWeatherByZipCodeResponse)get_store().add_element_user(GETWEATHERBYZIPCODERESPONSE$0);
            }
            target.set(getWeatherByZipCodeResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetWeatherByZipCodeResponse" element
     */
    public net.webservicex.www.GetWeatherByZipCodeResponseDocument.GetWeatherByZipCodeResponse addNewGetWeatherByZipCodeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetWeatherByZipCodeResponseDocument.GetWeatherByZipCodeResponse target = null;
            target = (net.webservicex.www.GetWeatherByZipCodeResponseDocument.GetWeatherByZipCodeResponse)get_store().add_element_user(GETWEATHERBYZIPCODERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetWeatherByZipCodeResponse(@http://www.webservicex.net).
     *
     * This is a complex type.
     */
    public static class GetWeatherByZipCodeResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.GetWeatherByZipCodeResponseDocument.GetWeatherByZipCodeResponse
    {
        
        public GetWeatherByZipCodeResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETWEATHERBYZIPCODERESULT$0 = 
            new javax.xml.namespace.QName("http://www.webservicex.net", "GetWeatherByZipCodeResult");
        
        
        /**
         * Gets the "GetWeatherByZipCodeResult" element
         */
        public net.webservicex.www.WeatherForecasts getGetWeatherByZipCodeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.webservicex.www.WeatherForecasts target = null;
                target = (net.webservicex.www.WeatherForecasts)get_store().find_element_user(GETWEATHERBYZIPCODERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "GetWeatherByZipCodeResult" element
         */
        public void setGetWeatherByZipCodeResult(net.webservicex.www.WeatherForecasts getWeatherByZipCodeResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.webservicex.www.WeatherForecasts target = null;
                target = (net.webservicex.www.WeatherForecasts)get_store().find_element_user(GETWEATHERBYZIPCODERESULT$0, 0);
                if (target == null)
                {
                    target = (net.webservicex.www.WeatherForecasts)get_store().add_element_user(GETWEATHERBYZIPCODERESULT$0);
                }
                target.set(getWeatherByZipCodeResult);
            }
        }
        
        /**
         * Appends and returns a new empty "GetWeatherByZipCodeResult" element
         */
        public net.webservicex.www.WeatherForecasts addNewGetWeatherByZipCodeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.webservicex.www.WeatherForecasts target = null;
                target = (net.webservicex.www.WeatherForecasts)get_store().add_element_user(GETWEATHERBYZIPCODERESULT$0);
                return target;
            }
        }
    }
}
