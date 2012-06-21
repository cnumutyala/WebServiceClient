/*
 * An XML document type.
 * Localname: GetWeatherByZipCodeResponse
 * Namespace: http://www.webservicex.net
 * Java type: net.webservicex.www.GetWeatherByZipCodeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package net.webservicex.www;


/**
 * A document containing one GetWeatherByZipCodeResponse(@http://www.webservicex.net) element.
 *
 * This is a complex type.
 */
public interface GetWeatherByZipCodeResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetWeatherByZipCodeResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB0D46F44E5433E07C4BADF32815A46D8").resolveHandle("getweatherbyzipcoderesponseef7cdoctype");
    
    /**
     * Gets the "GetWeatherByZipCodeResponse" element
     */
    net.webservicex.www.GetWeatherByZipCodeResponseDocument.GetWeatherByZipCodeResponse getGetWeatherByZipCodeResponse();
    
    /**
     * Sets the "GetWeatherByZipCodeResponse" element
     */
    void setGetWeatherByZipCodeResponse(net.webservicex.www.GetWeatherByZipCodeResponseDocument.GetWeatherByZipCodeResponse getWeatherByZipCodeResponse);
    
    /**
     * Appends and returns a new empty "GetWeatherByZipCodeResponse" element
     */
    net.webservicex.www.GetWeatherByZipCodeResponseDocument.GetWeatherByZipCodeResponse addNewGetWeatherByZipCodeResponse();
    
    /**
     * An XML GetWeatherByZipCodeResponse(@http://www.webservicex.net).
     *
     * This is a complex type.
     */
    public interface GetWeatherByZipCodeResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetWeatherByZipCodeResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB0D46F44E5433E07C4BADF32815A46D8").resolveHandle("getweatherbyzipcoderesponse1856elemtype");
        
        /**
         * Gets the "GetWeatherByZipCodeResult" element
         */
        net.webservicex.www.WeatherForecasts getGetWeatherByZipCodeResult();
        
        /**
         * Sets the "GetWeatherByZipCodeResult" element
         */
        void setGetWeatherByZipCodeResult(net.webservicex.www.WeatherForecasts getWeatherByZipCodeResult);
        
        /**
         * Appends and returns a new empty "GetWeatherByZipCodeResult" element
         */
        net.webservicex.www.WeatherForecasts addNewGetWeatherByZipCodeResult();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static net.webservicex.www.GetWeatherByZipCodeResponseDocument.GetWeatherByZipCodeResponse newInstance() {
              return (net.webservicex.www.GetWeatherByZipCodeResponseDocument.GetWeatherByZipCodeResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static net.webservicex.www.GetWeatherByZipCodeResponseDocument.GetWeatherByZipCodeResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (net.webservicex.www.GetWeatherByZipCodeResponseDocument.GetWeatherByZipCodeResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.webservicex.www.GetWeatherByZipCodeResponseDocument newInstance() {
          return (net.webservicex.www.GetWeatherByZipCodeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.webservicex.www.GetWeatherByZipCodeResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.webservicex.www.GetWeatherByZipCodeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.webservicex.www.GetWeatherByZipCodeResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetWeatherByZipCodeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.webservicex.www.GetWeatherByZipCodeResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetWeatherByZipCodeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.webservicex.www.GetWeatherByZipCodeResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetWeatherByZipCodeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.webservicex.www.GetWeatherByZipCodeResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetWeatherByZipCodeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.webservicex.www.GetWeatherByZipCodeResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetWeatherByZipCodeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.webservicex.www.GetWeatherByZipCodeResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetWeatherByZipCodeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.webservicex.www.GetWeatherByZipCodeResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetWeatherByZipCodeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.webservicex.www.GetWeatherByZipCodeResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetWeatherByZipCodeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.webservicex.www.GetWeatherByZipCodeResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetWeatherByZipCodeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.webservicex.www.GetWeatherByZipCodeResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetWeatherByZipCodeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.webservicex.www.GetWeatherByZipCodeResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetWeatherByZipCodeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.webservicex.www.GetWeatherByZipCodeResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetWeatherByZipCodeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.webservicex.www.GetWeatherByZipCodeResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetWeatherByZipCodeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.webservicex.www.GetWeatherByZipCodeResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetWeatherByZipCodeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.webservicex.www.GetWeatherByZipCodeResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.webservicex.www.GetWeatherByZipCodeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.webservicex.www.GetWeatherByZipCodeResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.webservicex.www.GetWeatherByZipCodeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
