/*
 * XML Type:  ArrayOfWeatherData
 * Namespace: http://www.webservicex.net
 * Java type: net.webservicex.www.ArrayOfWeatherData
 *
 * Automatically generated - do not modify.
 */
package net.webservicex.www;


/**
 * An XML ArrayOfWeatherData(@http://www.webservicex.net).
 *
 * This is a complex type.
 */
public interface ArrayOfWeatherData extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArrayOfWeatherData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB0D46F44E5433E07C4BADF32815A46D8").resolveHandle("arrayofweatherdata1b46type");
    
    /**
     * Gets array of all "WeatherData" elements
     */
    net.webservicex.www.WeatherData[] getWeatherDataArray();
    
    /**
     * Gets ith "WeatherData" element
     */
    net.webservicex.www.WeatherData getWeatherDataArray(int i);
    
    /**
     * Returns number of "WeatherData" element
     */
    int sizeOfWeatherDataArray();
    
    /**
     * Sets array of all "WeatherData" element
     */
    void setWeatherDataArray(net.webservicex.www.WeatherData[] weatherDataArray);
    
    /**
     * Sets ith "WeatherData" element
     */
    void setWeatherDataArray(int i, net.webservicex.www.WeatherData weatherData);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "WeatherData" element
     */
    net.webservicex.www.WeatherData insertNewWeatherData(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "WeatherData" element
     */
    net.webservicex.www.WeatherData addNewWeatherData();
    
    /**
     * Removes the ith "WeatherData" element
     */
    void removeWeatherData(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.webservicex.www.ArrayOfWeatherData newInstance() {
          return (net.webservicex.www.ArrayOfWeatherData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.webservicex.www.ArrayOfWeatherData newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.webservicex.www.ArrayOfWeatherData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.webservicex.www.ArrayOfWeatherData parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.ArrayOfWeatherData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.webservicex.www.ArrayOfWeatherData parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.ArrayOfWeatherData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.webservicex.www.ArrayOfWeatherData parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.ArrayOfWeatherData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.webservicex.www.ArrayOfWeatherData parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.ArrayOfWeatherData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.webservicex.www.ArrayOfWeatherData parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.ArrayOfWeatherData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.webservicex.www.ArrayOfWeatherData parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.ArrayOfWeatherData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.webservicex.www.ArrayOfWeatherData parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.ArrayOfWeatherData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.webservicex.www.ArrayOfWeatherData parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.ArrayOfWeatherData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.webservicex.www.ArrayOfWeatherData parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.ArrayOfWeatherData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.webservicex.www.ArrayOfWeatherData parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.ArrayOfWeatherData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.webservicex.www.ArrayOfWeatherData parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.ArrayOfWeatherData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.webservicex.www.ArrayOfWeatherData parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.ArrayOfWeatherData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.webservicex.www.ArrayOfWeatherData parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.ArrayOfWeatherData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.webservicex.www.ArrayOfWeatherData parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.ArrayOfWeatherData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.webservicex.www.ArrayOfWeatherData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.webservicex.www.ArrayOfWeatherData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.webservicex.www.ArrayOfWeatherData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.webservicex.www.ArrayOfWeatherData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
