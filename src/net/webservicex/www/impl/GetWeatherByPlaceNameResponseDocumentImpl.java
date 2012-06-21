/*
 * An XML document type.
 * Localname: GetWeatherByPlaceNameResponse
 * Namespace: http://www.webservicex.net
 * Java type: net.webservicex.www.GetWeatherByPlaceNameResponseDocument
 *
 * Automatically generated - do not modify.
 */
package net.webservicex.www.impl;
/**
 * A document containing one GetWeatherByPlaceNameResponse(@http://www.webservicex.net) element.
 *
 * This is a complex type.
 */
public class GetWeatherByPlaceNameResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.GetWeatherByPlaceNameResponseDocument
{
    
    public GetWeatherByPlaceNameResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETWEATHERBYPLACENAMERESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.webservicex.net", "GetWeatherByPlaceNameResponse");
    
    
    /**
     * Gets the "GetWeatherByPlaceNameResponse" element
     */
    public net.webservicex.www.GetWeatherByPlaceNameResponseDocument.GetWeatherByPlaceNameResponse getGetWeatherByPlaceNameResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetWeatherByPlaceNameResponseDocument.GetWeatherByPlaceNameResponse target = null;
            target = (net.webservicex.www.GetWeatherByPlaceNameResponseDocument.GetWeatherByPlaceNameResponse)get_store().find_element_user(GETWEATHERBYPLACENAMERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetWeatherByPlaceNameResponse" element
     */
    public void setGetWeatherByPlaceNameResponse(net.webservicex.www.GetWeatherByPlaceNameResponseDocument.GetWeatherByPlaceNameResponse getWeatherByPlaceNameResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetWeatherByPlaceNameResponseDocument.GetWeatherByPlaceNameResponse target = null;
            target = (net.webservicex.www.GetWeatherByPlaceNameResponseDocument.GetWeatherByPlaceNameResponse)get_store().find_element_user(GETWEATHERBYPLACENAMERESPONSE$0, 0);
            if (target == null)
            {
                target = (net.webservicex.www.GetWeatherByPlaceNameResponseDocument.GetWeatherByPlaceNameResponse)get_store().add_element_user(GETWEATHERBYPLACENAMERESPONSE$0);
            }
            target.set(getWeatherByPlaceNameResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetWeatherByPlaceNameResponse" element
     */
    public net.webservicex.www.GetWeatherByPlaceNameResponseDocument.GetWeatherByPlaceNameResponse addNewGetWeatherByPlaceNameResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.webservicex.www.GetWeatherByPlaceNameResponseDocument.GetWeatherByPlaceNameResponse target = null;
            target = (net.webservicex.www.GetWeatherByPlaceNameResponseDocument.GetWeatherByPlaceNameResponse)get_store().add_element_user(GETWEATHERBYPLACENAMERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetWeatherByPlaceNameResponse(@http://www.webservicex.net).
     *
     * This is a complex type.
     */
    public static class GetWeatherByPlaceNameResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.webservicex.www.GetWeatherByPlaceNameResponseDocument.GetWeatherByPlaceNameResponse
    {
        
        public GetWeatherByPlaceNameResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETWEATHERBYPLACENAMERESULT$0 = 
            new javax.xml.namespace.QName("http://www.webservicex.net", "GetWeatherByPlaceNameResult");
        
        
        /**
         * Gets the "GetWeatherByPlaceNameResult" element
         */
        public net.webservicex.www.WeatherForecasts getGetWeatherByPlaceNameResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.webservicex.www.WeatherForecasts target = null;
                target = (net.webservicex.www.WeatherForecasts)get_store().find_element_user(GETWEATHERBYPLACENAMERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "GetWeatherByPlaceNameResult" element
         */
        public void setGetWeatherByPlaceNameResult(net.webservicex.www.WeatherForecasts getWeatherByPlaceNameResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.webservicex.www.WeatherForecasts target = null;
                target = (net.webservicex.www.WeatherForecasts)get_store().find_element_user(GETWEATHERBYPLACENAMERESULT$0, 0);
                if (target == null)
                {
                    target = (net.webservicex.www.WeatherForecasts)get_store().add_element_user(GETWEATHERBYPLACENAMERESULT$0);
                }
                target.set(getWeatherByPlaceNameResult);
            }
        }
        
        /**
         * Appends and returns a new empty "GetWeatherByPlaceNameResult" element
         */
        public net.webservicex.www.WeatherForecasts addNewGetWeatherByPlaceNameResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.webservicex.www.WeatherForecasts target = null;
                target = (net.webservicex.www.WeatherForecasts)get_store().add_element_user(GETWEATHERBYPLACENAMERESULT$0);
                return target;
            }
        }
    }
}
