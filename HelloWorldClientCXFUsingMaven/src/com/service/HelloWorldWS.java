package com.service;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2016-09-25T21:16:17.221+05:30
 * Generated source version: 3.1.7
 * 
 */
@WebService(targetNamespace = "http://service.com/", name = "HelloWorldWS")
@XmlSeeAlso({ObjectFactory.class})
public interface HelloWorldWS {

    @WebMethod
    @Action(input = "http://service.com/HelloWorldWS/sayHelloRequest", output = "http://service.com/HelloWorldWS/sayHelloResponse")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://service.com/", className = "com.service.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://service.com/", className = "com.service.SayHelloResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String sayHello();
}
