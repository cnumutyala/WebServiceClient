/*
 * XML Type:  WeatherForecasts
 * Namespace: http://www.webservicex.net
 * Java type: net.webservicex.www.WeatherForecasts
 *
 * Automatically generated - do not modify.
 */
package net.webservicex.www;


/**
 * An XML WeatherForecasts(@http://www.webservicex.net).
 *
 * This is a complex type.
 */
public interface WeatherForecasts extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WeatherForecasts.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB0D46F44E5433E07C4BADF32815A46D8").resolveHandle("weatherforecasts1890type");
    
    /**
     * Gets the "Latitude" element
     */
    float getLatitude();
    
    /**
     * Gets (as xml) the "Latitude" element
     */
    org.apache.xmlbeans.XmlFloat xgetLatitude();
    
    /**
     * Sets the "Latitude" element
     */
    void setLatitude(float latitude);
    
    /**
     * Sets (as xml) the "Latitude" element
     */
    void xsetLatitude(org.apache.xmlbeans.XmlFloat latitude);
    
    /**
     * Gets the "Longitude" element
     */
    float getLongitude();
    
    /**
     * Gets (as xml) the "Longitude" element
     */
    org.apache.xmlbeans.XmlFloat xgetLongitude();
    
    /**
     * Sets the "Longitude" element
     */
    void setLongitude(float longitude);
    
    /**
     * Sets (as xml) the "Longitude" element
     */
    void xsetLongitude(org.apache.xmlbeans.XmlFloat longitude);
    
    /**
     * Gets the "AllocationFactor" element
     */
    float getAllocationFactor();
    
    /**
     * Gets (as xml) the "AllocationFactor" element
     */
    org.apache.xmlbeans.XmlFloat xgetAllocationFactor();
    
    /**
     * Sets the "AllocationFactor" element
     */
    void setAllocationFactor(float allocationFactor);
    
    /**
     * Sets (as xml) the "AllocationFactor" element
     */
    void xsetAllocationFactor(org.apache.xmlbeans.XmlFloat allocationFactor);
    
    /**
     * Gets the "FipsCode" element
     */
    java.lang.String getFipsCode();
    
    /**
     * Gets (as xml) the "FipsCode" element
     */
    org.apache.xmlbeans.XmlString xgetFipsCode();
    
    /**
     * True if has "FipsCode" element
     */
    boolean isSetFipsCode();
    
    /**
     * Sets the "FipsCode" element
     */
    void setFipsCode(java.lang.String fipsCode);
    
    /**
     * Sets (as xml) the "FipsCode" element
     */
    void xsetFipsCode(org.apache.xmlbeans.XmlString fipsCode);
    
    /**
     * Unsets the "FipsCode" element
     */
    void unsetFipsCode();
    
    /**
     * Gets the "PlaceName" element
     */
    java.lang.String getPlaceName();
    
    /**
     * Gets (as xml) the "PlaceName" element
     */
    org.apache.xmlbeans.XmlString xgetPlaceName();
    
    /**
     * True if has "PlaceName" element
     */
    boolean isSetPlaceName();
    
    /**
     * Sets the "PlaceName" element
     */
    void setPlaceName(java.lang.String placeName);
    
    /**
     * Sets (as xml) the "PlaceName" element
     */
    void xsetPlaceName(org.apache.xmlbeans.XmlString placeName);
    
    /**
     * Unsets the "PlaceName" element
     */
    void unsetPlaceName();
    
    /**
     * Gets the "StateCode" element
     */
    java.lang.String getStateCode();
    
    /**
     * Gets (as xml) the "StateCode" element
     */
    org.apache.xmlbeans.XmlString xgetStateCode();
    
    /**
     * True if has "StateCode" element
     */
    boolean isSetStateCode();
    
    /**
     * Sets the "StateCode" element
     */
    void setStateCode(java.lang.String stateCode);
    
    /**
     * Sets (as xml) the "StateCode" element
     */
    void xsetStateCode(org.apache.xmlbeans.XmlString stateCode);
    
    /**
     * Unsets the "StateCode" element
     */
    void unsetStateCode();
    
    /**
     * Gets the "Status" element
     */
    java.lang.String getStatus();
    
    /**
     * Gets (as xml) the "Status" element
     */
    org.apache.xmlbeans.XmlString xgetStatus();
    
    /**
     * True if has "Status" element
     */
    boolean isSetStatus();
    
    /**
     * Sets the "Status" element
     */
    void setStatus(java.lang.String status);
    
    /**
     * Sets (as xml) the "Status" element
     */
    void xsetStatus(org.apache.xmlbeans.XmlString status);
    
    /**
     * Unsets the "Status" element
     */
    void unsetStatus();
    
    /**
     * Gets the "Details" element
     */
    net.webservicex.www.ArrayOfWeatherData getDetails();
    
    /**
     * True if has "Details" element
     */
    boolean isSetDetails();
    
    /**
     * Sets the "Details" element
     */
    void setDetails(net.webservicex.www.ArrayOfWeatherData details);
    
    /**
     * Appends and returns a new empty "Details" element
     */
    net.webservicex.www.ArrayOfWeatherData addNewDetails();
    
    /**
     * Unsets the "Details" element
     */
    void unsetDetails();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.webservicex.www.WeatherForecasts newInstance() {
          return (net.webservicex.www.WeatherForecasts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.webservicex.www.WeatherForecasts newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.webservicex.www.WeatherForecasts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.webservicex.www.WeatherForecasts parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.WeatherForecasts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.webservicex.www.WeatherForecasts parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.WeatherForecasts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.webservicex.www.WeatherForecasts parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.WeatherForecasts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.webservicex.www.WeatherForecasts parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.WeatherForecasts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.webservicex.www.WeatherForecasts parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.WeatherForecasts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.webservicex.www.WeatherForecasts parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.WeatherForecasts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.webservicex.www.WeatherForecasts parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.WeatherForecasts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.webservicex.www.WeatherForecasts parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.WeatherForecasts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.webservicex.www.WeatherForecasts parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.WeatherForecasts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.webservicex.www.WeatherForecasts parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.WeatherForecasts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.webservicex.www.WeatherForecasts parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.WeatherForecasts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.webservicex.www.WeatherForecasts parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.WeatherForecasts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.webservicex.www.WeatherForecasts parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.WeatherForecasts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.webservicex.www.WeatherForecasts parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.WeatherForecasts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.webservicex.www.WeatherForecasts parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.webservicex.www.WeatherForecasts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.webservicex.www.WeatherForecasts parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.webservicex.www.WeatherForecasts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
