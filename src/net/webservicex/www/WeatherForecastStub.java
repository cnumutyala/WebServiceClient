
/**
 * WeatherForecastStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:35 LKT)
 */
        package net.webservicex.www;

        

        /*
        *  WeatherForecastStub java implementation
        */

        
        public class WeatherForecastStub extends org.apache.axis2.client.Stub
        {
        protected org.apache.axis2.description.AxisOperation[] _operations;

        //hashmaps to keep the fault mapping
        private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
        private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
        private java.util.HashMap faultMessageMap = new java.util.HashMap();

        private static int counter = 0;

        private static synchronized String getUniqueSuffix(){
            // reset the counter if it is greater than 99999
            if (counter > 99999){
                counter = 0;
            }
            counter = counter + 1; 
            return Long.toString(System.currentTimeMillis()) + "_" + counter;
        }

    
    private void populateAxisService() throws org.apache.axis2.AxisFault {

     //creating the Service with a unique name
     _service = new org.apache.axis2.description.AxisService("WeatherForecast" + getUniqueSuffix());
     addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[2];
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.webservicex.net", "GetWeatherByPlaceName"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[0]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.webservicex.net", "GetWeatherByZipCode"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[1]=__operation;
            
        
        }

    //populates the faults
    private void populateFaults(){
         


    }

    /**
      *Constructor that takes in a configContext
      */

    public WeatherForecastStub(org.apache.axis2.context.ConfigurationContext configurationContext,
       java.lang.String targetEndpoint)
       throws org.apache.axis2.AxisFault {
         this(configurationContext,targetEndpoint,false);
   }


   /**
     * Constructor that takes in a configContext  and useseperate listner
     */
   public WeatherForecastStub(org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
         //To populate AxisService
         populateAxisService();
         populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,_service);
        
	
        configurationContext = _serviceClient.getServiceContext().getConfigurationContext();

        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
        
            //Set the soap version
            _serviceClient.getOptions().setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);
        
    
    }

    /**
     * Default Constructor
     */
    public WeatherForecastStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {
        
                    this(configurationContext,"http://www.webservicex.net/weatherforecast.asmx" );
                
    }

    /**
     * Default Constructor
     */
    public WeatherForecastStub() throws org.apache.axis2.AxisFault {
        
                    this("http://www.webservicex.net/weatherforecast.asmx" );
                
    }

    /**
     * Constructor taking the target endpoint
     */
    public WeatherForecastStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null,targetEndpoint);
    }



        
                    /**
                     * Auto generated method signature
                     * Get one week  weather forecast for a place name(USA)
                     * @see net.webservicex.www.WeatherForecast#GetWeatherByPlaceName
                     * @param getWeatherByPlaceName0
                    
                     */

                    

                            public  net.webservicex.www.GetWeatherByPlaceNameResponseDocument GetWeatherByPlaceName(

                            net.webservicex.www.GetWeatherByPlaceNameDocument getWeatherByPlaceName0)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
              _operationClient.getOptions().setAction("http://www.webservicex.net/GetWeatherByPlaceName");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getWeatherByPlaceName0,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.webservicex.net",
                                                    "GetWeatherByPlaceName")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             net.webservicex.www.GetWeatherByPlaceNameResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.webservicex.www.GetWeatherByPlaceNameResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * Get one week  weather forecast for a place name(USA)
                * @see net.webservicex.www.WeatherForecast#startGetWeatherByPlaceName
                    * @param getWeatherByPlaceName0
                
                */
                public  void startGetWeatherByPlaceName(

                 net.webservicex.www.GetWeatherByPlaceNameDocument getWeatherByPlaceName0,

                  final net.webservicex.www.WeatherForecastCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
             _operationClient.getOptions().setAction("http://www.webservicex.net/GetWeatherByPlaceName");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getWeatherByPlaceName0,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.webservicex.net",
                                                    "GetWeatherByPlaceName")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         net.webservicex.www.GetWeatherByPlaceNameResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultGetWeatherByPlaceName(
                                        (net.webservicex.www.GetWeatherByPlaceNameResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorGetWeatherByPlaceName(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
					
										            callback.receiveErrorGetWeatherByPlaceName(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorGetWeatherByPlaceName(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorGetWeatherByPlaceName(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorGetWeatherByPlaceName(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorGetWeatherByPlaceName(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorGetWeatherByPlaceName(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorGetWeatherByPlaceName(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorGetWeatherByPlaceName(f);
                                            }
									    } else {
										    callback.receiveErrorGetWeatherByPlaceName(f);
									    }
									} else {
									    callback.receiveErrorGetWeatherByPlaceName(f);
									}
								} else {
								    callback.receiveErrorGetWeatherByPlaceName(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorGetWeatherByPlaceName(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[0].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[0].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * Get one week weather forecast for a valid Zip Code(USA)
                     * @see net.webservicex.www.WeatherForecast#GetWeatherByZipCode
                     * @param getWeatherByZipCode2
                    
                     */

                    

                            public  net.webservicex.www.GetWeatherByZipCodeResponseDocument GetWeatherByZipCode(

                            net.webservicex.www.GetWeatherByZipCodeDocument getWeatherByZipCode2)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
              _operationClient.getOptions().setAction("http://www.webservicex.net/GetWeatherByZipCode");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getWeatherByZipCode2,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.webservicex.net",
                                                    "GetWeatherByZipCode")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             net.webservicex.www.GetWeatherByZipCodeResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (net.webservicex.www.GetWeatherByZipCodeResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * Get one week weather forecast for a valid Zip Code(USA)
                * @see net.webservicex.www.WeatherForecast#startGetWeatherByZipCode
                    * @param getWeatherByZipCode2
                
                */
                public  void startGetWeatherByZipCode(

                 net.webservicex.www.GetWeatherByZipCodeDocument getWeatherByZipCode2,

                  final net.webservicex.www.WeatherForecastCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
             _operationClient.getOptions().setAction("http://www.webservicex.net/GetWeatherByZipCode");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getWeatherByZipCode2,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.webservicex.net",
                                                    "GetWeatherByZipCode")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         net.webservicex.www.GetWeatherByZipCodeResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultGetWeatherByZipCode(
                                        (net.webservicex.www.GetWeatherByZipCodeResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorGetWeatherByZipCode(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
					
										            callback.receiveErrorGetWeatherByZipCode(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorGetWeatherByZipCode(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorGetWeatherByZipCode(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorGetWeatherByZipCode(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorGetWeatherByZipCode(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorGetWeatherByZipCode(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorGetWeatherByZipCode(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorGetWeatherByZipCode(f);
                                            }
									    } else {
										    callback.receiveErrorGetWeatherByZipCode(f);
									    }
									} else {
									    callback.receiveErrorGetWeatherByZipCode(f);
									}
								} else {
								    callback.receiveErrorGetWeatherByZipCode(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorGetWeatherByZipCode(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[1].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[1].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                


       /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
       private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
       return returnMap;
    }

    
    
    private javax.xml.namespace.QName[] opNameArray = null;
    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        

        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;   
            }
        }
        return false;
    }
     //http://www.webservicex.net/weatherforecast.asmx

            private  org.apache.axiom.om.OMElement  toOM(net.webservicex.www.GetWeatherByPlaceNameDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final net.webservicex.www.GetWeatherByPlaceNameDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(net.webservicex.www.GetWeatherByPlaceNameResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final net.webservicex.www.GetWeatherByPlaceNameResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(net.webservicex.www.GetWeatherByZipCodeDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final net.webservicex.www.GetWeatherByZipCodeDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(net.webservicex.www.GetWeatherByZipCodeResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final net.webservicex.www.GetWeatherByZipCodeResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.webservicex.www.GetWeatherByPlaceNameDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, net.webservicex.www.GetWeatherByZipCodeDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }

        public org.apache.xmlbeans.XmlObject fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{
        try{
        

            if (net.webservicex.www.GetWeatherByPlaceNameDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return net.webservicex.www.GetWeatherByPlaceNameDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return net.webservicex.www.GetWeatherByPlaceNameDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (net.webservicex.www.GetWeatherByPlaceNameResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return net.webservicex.www.GetWeatherByPlaceNameResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return net.webservicex.www.GetWeatherByPlaceNameResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (net.webservicex.www.GetWeatherByZipCodeDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return net.webservicex.www.GetWeatherByZipCodeDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return net.webservicex.www.GetWeatherByZipCodeDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (net.webservicex.www.GetWeatherByZipCodeResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return net.webservicex.www.GetWeatherByZipCodeResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return net.webservicex.www.GetWeatherByZipCodeResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        
        }catch(java.lang.Exception e){
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        return null;
        }

        
        
   }
   