/*
 * An XML document type.
 * Localname: GetWeatherByPlaceNameResponse
 * Namespace: http://www.webservicex.net
 * Java type: net.webservicex.www.GetWeatherByPlaceNameResponseDocument
 *
 * Automatically generated - do not modify.
 */
package net.webservicex.www;


/**
 * A document containing one GetWeatherByPlaceNameResponse(@http://www.webservicex.net) element.
 *
 * This is a complex type.
 */
public interface GetWeatherByPlaceNameResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetWeatherByPlaceNameResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB0D46F44E5433E07C4BADF32815A46D8").resolveHandle("getweatherbyplacenameresponsed1f8doctype");
    
    /**
     * Gets the "GetWeatherByPlaceNameResponse" element
     */
    net.webservicex.www.GetWeatherByPlaceNameResponseDocument.GetWeatherByPlaceNameResponse getGetWeatherByPlaceNameResponse();
    
    /**
     * Sets the "GetWeatherByPlaceNameResponse" element
     */
    void setGetWeatherByPlaceNameResponse(net.webservicex.www.GetWeatherByPlaceNameResponseDocument.GetWeatherByPlaceNameResponse getWeatherByPlaceNameResponse);
    
    /**
     * Appends and returns a new empty "GetWeatherByPlaceNameResponse" element
     */
    net.webservicex.www.GetWeatherByPlaceNameResponseDocument.GetWeatherByPlaceNameResponse addNewGetWeatherByPlaceNameResponse();
    
    /**
     * An XML GetWeatherByPlaceNameResponse(@http://www.webservicex.net).
     *
     * This is a complex type.
     */
    public interface GetWeatherByPlaceNameResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetWeatherByPlaceNameResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB0D46F44E5433E07C4BADF32815A46D8").resolveHandle("getweatherbyplacenameresponsee30eelemtype");
        
        /**
         * Gets the "GetWeatherByPlaceNameResult" element
         */
        net.webservicex.www.WeatherForecasts getGetWeatherByPlaceNameResult();
        
        /**
         * Sets the "GetWeatherByPlaceNameResult" element
         */
        void setGetWeatherByPlaceNameResult(net.webservicex.www.WeatherForecasts getWeatherByPlaceNameResult);
        
        /**
         * Appends and returns a new empty "GetWeatherByPlaceNameResult" element
         */
        net.webservicex.www.WeatherForecasts addNewGetWeatherByPlaceNameResult();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static net.webservicex.www.GetWeatherByPlaceNameResponseDocument.GetWeatherByPlaceNameResponse newInstance() {
              return (net.webservicex.www.GetWeatherByPlaceNameResponseDocument.GetWeatherByPlaceNameResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static net.webservicex.www.GetWeatherByPlaceNameResponseDocument.GetWeatherByPlaceNameResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (net.webservicex.www.GetWeatherByPlaceNameResponseDocument.GetWeatherByPlaceNameResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.webservicex.www.GetWeatherByPlaceNameResponseDocument newInstance() {
          return (net.webservicex.www.GetWeatherByPlaceNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.webservicex.www.GetWeatherByPlaceNameResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.webservicex.www.GetWeatherByPlaceNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.webservicex.www.GetWeatherByPlaceNameResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetWeatherByPlaceNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.webservicex.www.GetWeatherByPlaceNameResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetWeatherByPlaceNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.webservicex.www.GetWeatherByPlaceNameResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetWeatherByPlaceNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.webservicex.www.GetWeatherByPlaceNameResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetWeatherByPlaceNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.webservicex.www.GetWeatherByPlaceNameResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetWeatherByPlaceNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.webservicex.www.GetWeatherByPlaceNameResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetWeatherByPlaceNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.webservicex.www.GetWeatherByPlaceNameResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetWeatherByPlaceNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.webservicex.www.GetWeatherByPlaceNameResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetWeatherByPlaceNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.webservicex.www.GetWeatherByPlaceNameResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetWeatherByPlaceNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.webservicex.www.GetWeatherByPlaceNameResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetWeatherByPlaceNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.webservicex.www.GetWeatherByPlaceNameResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetWeatherByPlaceNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.webservicex.www.GetWeatherByPlaceNameResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetWeatherByPlaceNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.webservicex.www.GetWeatherByPlaceNameResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetWeatherByPlaceNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.webservicex.www.GetWeatherByPlaceNameResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetWeatherByPlaceNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.webservicex.www.GetWeatherByPlaceNameResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.webservicex.www.GetWeatherByPlaceNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.webservicex.www.GetWeatherByPlaceNameResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.webservicex.www.GetWeatherByPlaceNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
