/*
 * An XML document type.
 * Localname: GetWeatherByPlaceName
 * Namespace: http://www.webservicex.net
 * Java type: net.webservicex.www.GetWeatherByPlaceNameDocument
 *
 * Automatically generated - do not modify.
 */
package net.webservicex.www;


/**
 * A document containing one GetWeatherByPlaceName(@http://www.webservicex.net) element.
 *
 * This is a complex type.
 */
public interface GetWeatherByPlaceNameDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetWeatherByPlaceNameDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB0D46F44E5433E07C4BADF32815A46D8").resolveHandle("getweatherbyplacenamebaf9doctype");
    
    /**
     * Gets the "GetWeatherByPlaceName" element
     */
    net.webservicex.www.GetWeatherByPlaceNameDocument.GetWeatherByPlaceName getGetWeatherByPlaceName();
    
    /**
     * Sets the "GetWeatherByPlaceName" element
     */
    void setGetWeatherByPlaceName(net.webservicex.www.GetWeatherByPlaceNameDocument.GetWeatherByPlaceName getWeatherByPlaceName);
    
    /**
     * Appends and returns a new empty "GetWeatherByPlaceName" element
     */
    net.webservicex.www.GetWeatherByPlaceNameDocument.GetWeatherByPlaceName addNewGetWeatherByPlaceName();
    
    /**
     * An XML GetWeatherByPlaceName(@http://www.webservicex.net).
     *
     * This is a complex type.
     */
    public interface GetWeatherByPlaceName extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetWeatherByPlaceName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB0D46F44E5433E07C4BADF32815A46D8").resolveHandle("getweatherbyplacename0710elemtype");
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static net.webservicex.www.GetWeatherByPlaceNameDocument.GetWeatherByPlaceName newInstance() {
              return (net.webservicex.www.GetWeatherByPlaceNameDocument.GetWeatherByPlaceName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static net.webservicex.www.GetWeatherByPlaceNameDocument.GetWeatherByPlaceName newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (net.webservicex.www.GetWeatherByPlaceNameDocument.GetWeatherByPlaceName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.webservicex.www.GetWeatherByPlaceNameDocument newInstance() {
          return (net.webservicex.www.GetWeatherByPlaceNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.webservicex.www.GetWeatherByPlaceNameDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.webservicex.www.GetWeatherByPlaceNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.webservicex.www.GetWeatherByPlaceNameDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetWeatherByPlaceNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.webservicex.www.GetWeatherByPlaceNameDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetWeatherByPlaceNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.webservicex.www.GetWeatherByPlaceNameDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetWeatherByPlaceNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.webservicex.www.GetWeatherByPlaceNameDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetWeatherByPlaceNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.webservicex.www.GetWeatherByPlaceNameDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetWeatherByPlaceNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.webservicex.www.GetWeatherByPlaceNameDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetWeatherByPlaceNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.webservicex.www.GetWeatherByPlaceNameDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetWeatherByPlaceNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.webservicex.www.GetWeatherByPlaceNameDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetWeatherByPlaceNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.webservicex.www.GetWeatherByPlaceNameDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetWeatherByPlaceNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.webservicex.www.GetWeatherByPlaceNameDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.webservicex.www.GetWeatherByPlaceNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.webservicex.www.GetWeatherByPlaceNameDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetWeatherByPlaceNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.webservicex.www.GetWeatherByPlaceNameDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetWeatherByPlaceNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.webservicex.www.GetWeatherByPlaceNameDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetWeatherByPlaceNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.webservicex.www.GetWeatherByPlaceNameDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.webservicex.www.GetWeatherByPlaceNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.webservicex.www.GetWeatherByPlaceNameDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.webservicex.www.GetWeatherByPlaceNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.webservicex.www.GetWeatherByPlaceNameDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.webservicex.www.GetWeatherByPlaceNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
