package com.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2016-09-25T21:10:41.738+05:30
 * Generated source version: 3.1.7
 * 
 */
@WebServiceClient(name = "HelloWorldWSService", 
                  wsdlLocation = "file:/E:/Dropbox/Workspace/Webservices/HelloWorldClientApacheCXF/src/com/resources/HelloWorldService.wsdl",
                  targetNamespace = "http://service.com/") 
public class HelloWorldWSService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.com/", "HelloWorldWSService");
    public final static QName HelloWorldWSPort = new QName("http://service.com/", "HelloWorldWSPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/E:/Dropbox/Workspace/Webservices/HelloWorldClientApacheCXF/src/com/resources/HelloWorldService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(HelloWorldWSService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/E:/Dropbox/Workspace/Webservices/HelloWorldClientApacheCXF/src/com/resources/HelloWorldService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public HelloWorldWSService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HelloWorldWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloWorldWSService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public HelloWorldWSService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public HelloWorldWSService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public HelloWorldWSService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns HelloWorldWS
     */
    @WebEndpoint(name = "HelloWorldWSPort")
    public HelloWorldWS getHelloWorldWSPort() {
        return super.getPort(HelloWorldWSPort, HelloWorldWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloWorldWS
     */
    @WebEndpoint(name = "HelloWorldWSPort")
    public HelloWorldWS getHelloWorldWSPort(WebServiceFeature... features) {
        return super.getPort(HelloWorldWSPort, HelloWorldWS.class, features);
    }

}