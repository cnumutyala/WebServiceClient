

/**
 * WeatherForecastTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:35 LKT)
 */
    package net.webservicex.www;

    /*
     *  WeatherForecastTest Junit test case
    */

    public class WeatherForecastTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testGetWeatherByPlaceName() throws java.lang.Exception{

        net.webservicex.www.WeatherForecastStub stub =
                    new net.webservicex.www.WeatherForecastStub();//the default implementation should point to the right endpoint

           net.webservicex.www.GetWeatherByPlaceNameDocument getWeatherByPlaceName8=
                                                        (net.webservicex.www.GetWeatherByPlaceNameDocument)getTestObject(net.webservicex.www.GetWeatherByPlaceNameDocument.class);
                    // TODO : Fill in the getWeatherByPlaceName8 here
                
                        assertNotNull(stub.GetWeatherByPlaceName(
                        getWeatherByPlaceName8));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartGetWeatherByPlaceName() throws java.lang.Exception{
            net.webservicex.www.WeatherForecastStub stub = new net.webservicex.www.WeatherForecastStub();
             net.webservicex.www.GetWeatherByPlaceNameDocument getWeatherByPlaceName8=
                                                        (net.webservicex.www.GetWeatherByPlaceNameDocument)getTestObject(net.webservicex.www.GetWeatherByPlaceNameDocument.class);
                    // TODO : Fill in the getWeatherByPlaceName8 here
                

                stub.startGetWeatherByPlaceName(
                         getWeatherByPlaceName8,
                    new tempCallbackN1000C()
                );
              


        }

        private class tempCallbackN1000C  extends net.webservicex.www.WeatherForecastCallbackHandler{
            public tempCallbackN1000C(){ super(null);}

            public void receiveResultGetWeatherByPlaceName(
                         net.webservicex.www.GetWeatherByPlaceNameResponseDocument result
                            ) {
                
            }

            public void receiveErrorGetWeatherByPlaceName(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testGetWeatherByZipCode() throws java.lang.Exception{

        net.webservicex.www.WeatherForecastStub stub =
                    new net.webservicex.www.WeatherForecastStub();//the default implementation should point to the right endpoint

           net.webservicex.www.GetWeatherByZipCodeDocument getWeatherByZipCode10=
                                                        (net.webservicex.www.GetWeatherByZipCodeDocument)getTestObject(net.webservicex.www.GetWeatherByZipCodeDocument.class);
                    // TODO : Fill in the getWeatherByZipCode10 here
                
                        assertNotNull(stub.GetWeatherByZipCode(
                        getWeatherByZipCode10));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartGetWeatherByZipCode() throws java.lang.Exception{
            net.webservicex.www.WeatherForecastStub stub = new net.webservicex.www.WeatherForecastStub();
             net.webservicex.www.GetWeatherByZipCodeDocument getWeatherByZipCode10=
                                                        (net.webservicex.www.GetWeatherByZipCodeDocument)getTestObject(net.webservicex.www.GetWeatherByZipCodeDocument.class);
                    // TODO : Fill in the getWeatherByZipCode10 here
                

                stub.startGetWeatherByZipCode(
                         getWeatherByZipCode10,
                    new tempCallbackN10032()
                );
              


        }

        private class tempCallbackN10032  extends net.webservicex.www.WeatherForecastCallbackHandler{
            public tempCallbackN10032(){ super(null);}

            public void receiveResultGetWeatherByZipCode(
                         net.webservicex.www.GetWeatherByZipCodeResponseDocument result
                            ) {
                
            }

            public void receiveErrorGetWeatherByZipCode(java.lang.Exception e) {
                fail();
            }

        }
      
        //Create the desired XmlObject and provide it as the test object
        public  org.apache.xmlbeans.XmlObject getTestObject(java.lang.Class type) throws java.lang.Exception{
        java.lang.reflect.Method creatorMethod = null;
                if (org.apache.xmlbeans.XmlObject.class.isAssignableFrom(type)){
                    Class[] declaredClasses = type.getDeclaredClasses();
                    for (int i = 0; i < declaredClasses.length; i++) {
                        Class declaredClass = declaredClasses[i];
                        if (declaredClass.getName().endsWith("$Factory")){
                            creatorMethod = declaredClass.getMethod("newInstance",null);
                            break;
                        }

                    }
                }
                if (creatorMethod!=null){
                    return  (org.apache.xmlbeans.XmlObject)creatorMethod.invoke(null,null);
                }else{
                    throw new java.lang.Exception("Creator not found!");
                }

        }

         

    }
    