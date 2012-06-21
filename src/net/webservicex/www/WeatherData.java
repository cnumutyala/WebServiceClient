/*
 * XML Type:  WeatherData
 * Namespace: http://www.webservicex.net
 * Java type: net.webservicex.www.WeatherData
 *
 * Automatically generated - do not modify.
 */
package net.webservicex.www;


/**
 * An XML WeatherData(@http://www.webservicex.net).
 *
 * This is a complex type.
 */
public interface WeatherData extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WeatherData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB0D46F44E5433E07C4BADF32815A46D8").resolveHandle("weatherdatad4c8type");
    
    /**
     * Gets the "Day" element
     */
    java.lang.String getDay();
    
    /**
     * Gets (as xml) the "Day" element
     */
    org.apache.xmlbeans.XmlString xgetDay();
    
    /**
     * True if has "Day" element
     */
    boolean isSetDay();
    
    /**
     * Sets the "Day" element
     */
    void setDay(java.lang.String day);
    
    /**
     * Sets (as xml) the "Day" element
     */
    void xsetDay(org.apache.xmlbeans.XmlString day);
    
    /**
     * Unsets the "Day" element
     */
    void unsetDay();
    
    /**
     * Gets the "WeatherImage" element
     */
    java.lang.String getWeatherImage();
    
    /**
     * Gets (as xml) the "WeatherImage" element
     */
    org.apache.xmlbeans.XmlString xgetWeatherImage();
    
    /**
     * True if has "WeatherImage" element
     */
    boolean isSetWeatherImage();
    
    /**
     * Sets the "WeatherImage" element
     */
    void setWeatherImage(java.lang.String weatherImage);
    
    /**
     * Sets (as xml) the "WeatherImage" element
     */
    void xsetWeatherImage(org.apache.xmlbeans.XmlString weatherImage);
    
    /**
     * Unsets the "WeatherImage" element
     */
    void unsetWeatherImage();
    
    /**
     * Gets the "MaxTemperatureF" element
     */
    java.lang.String getMaxTemperatureF();
    
    /**
     * Gets (as xml) the "MaxTemperatureF" element
     */
    org.apache.xmlbeans.XmlString xgetMaxTemperatureF();
    
    /**
     * True if has "MaxTemperatureF" element
     */
    boolean isSetMaxTemperatureF();
    
    /**
     * Sets the "MaxTemperatureF" element
     */
    void setMaxTemperatureF(java.lang.String maxTemperatureF);
    
    /**
     * Sets (as xml) the "MaxTemperatureF" element
     */
    void xsetMaxTemperatureF(org.apache.xmlbeans.XmlString maxTemperatureF);
    
    /**
     * Unsets the "MaxTemperatureF" element
     */
    void unsetMaxTemperatureF();
    
    /**
     * Gets the "MinTemperatureF" element
     */
    java.lang.String getMinTemperatureF();
    
    /**
     * Gets (as xml) the "MinTemperatureF" element
     */
    org.apache.xmlbeans.XmlString xgetMinTemperatureF();
    
    /**
     * True if has "MinTemperatureF" element
     */
    boolean isSetMinTemperatureF();
    
    /**
     * Sets the "MinTemperatureF" element
     */
    void setMinTemperatureF(java.lang.String minTemperatureF);
    
    /**
     * Sets (as xml) the "MinTemperatureF" element
     */
    void xsetMinTemperatureF(org.apache.xmlbeans.XmlString minTemperatureF);
    
    /**
     * Unsets the "MinTemperatureF" element
     */
    void unsetMinTemperatureF();
    
    /**
     * Gets the "MaxTemperatureC" element
     */
    java.lang.String getMaxTemperatureC();
    
    /**
     * Gets (as xml) the "MaxTemperatureC" element
     */
    org.apache.xmlbeans.XmlString xgetMaxTemperatureC();
    
    /**
     * True if has "MaxTemperatureC" element
     */
    boolean isSetMaxTemperatureC();
    
    /**
     * Sets the "MaxTemperatureC" element
     */
    void setMaxTemperatureC(java.lang.String maxTemperatureC);
    
    /**
     * Sets (as xml) the "MaxTemperatureC" element
     */
    void xsetMaxTemperatureC(org.apache.xmlbeans.XmlString maxTemperatureC);
    
    /**
     * Unsets the "MaxTemperatureC" element
     */
    void unsetMaxTemperatureC();
    
    /**
     * Gets the "MinTemperatureC" element
     */
    java.lang.String getMinTemperatureC();
    
    /**
     * Gets (as xml) the "MinTemperatureC" element
     */
    org.apache.xmlbeans.XmlString xgetMinTemperatureC();
    
    /**
     * True if has "MinTemperatureC" element
     */
    boolean isSetMinTemperatureC();
    
    /**
     * Sets the "MinTemperatureC" element
     */
    void setMinTemperatureC(java.lang.String minTemperatureC);
    
    /**
     * Sets (as xml) the "MinTemperatureC" element
     */
    void xsetMinTemperatureC(org.apache.xmlbeans.XmlString minTemperatureC);
    
    /**
     * Unsets the "MinTemperatureC" element
     */
    void unsetMinTemperatureC();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.webservicex.www.WeatherData newInstance() {
          return (net.webservicex.www.WeatherData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.webservicex.www.WeatherData newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.webservicex.www.WeatherData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.webservicex.www.WeatherData parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.WeatherData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.webservicex.www.WeatherData parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.WeatherData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.webservicex.www.WeatherData parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.WeatherData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.webservicex.www.WeatherData parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.WeatherData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.webservicex.www.WeatherData parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.WeatherData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.webservicex.www.WeatherData parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.WeatherData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.webservicex.www.WeatherData parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.WeatherData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.webservicex.www.WeatherData parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.WeatherData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.webservicex.www.WeatherData parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.WeatherData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.webservicex.www.WeatherData parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.WeatherData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.webservicex.www.WeatherData parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.WeatherData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.webservicex.www.WeatherData parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.WeatherData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.webservicex.www.WeatherData parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.WeatherData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.webservicex.www.WeatherData parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.WeatherData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.webservicex.www.WeatherData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.webservicex.www.WeatherData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.webservicex.www.WeatherData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.webservicex.www.WeatherData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
