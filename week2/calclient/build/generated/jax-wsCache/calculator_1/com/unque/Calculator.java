
package com.unque;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "calculator", targetNamespace = "http://unque.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Calculator {


    /**
     * 
     * @param num1
     * @param num2
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sub", targetNamespace = "http://unque.com/", className = "com.unque.Sub")
    @ResponseWrapper(localName = "subResponse", targetNamespace = "http://unque.com/", className = "com.unque.SubResponse")
    @Action(input = "http://unque.com/calculator/subRequest", output = "http://unque.com/calculator/subResponse")
    public int sub(
        @WebParam(name = "num1", targetNamespace = "")
        int num1,
        @WebParam(name = "num2", targetNamespace = "")
        int num2);

    /**
     * 
     * @param num1
     * @param num2
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "mul", targetNamespace = "http://unque.com/", className = "com.unque.Mul")
    @ResponseWrapper(localName = "mulResponse", targetNamespace = "http://unque.com/", className = "com.unque.MulResponse")
    @Action(input = "http://unque.com/calculator/mulRequest", output = "http://unque.com/calculator/mulResponse")
    public int mul(
        @WebParam(name = "num1", targetNamespace = "")
        int num1,
        @WebParam(name = "num2", targetNamespace = "")
        int num2);

    /**
     * 
     * @param num1
     * @param num2
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "div", targetNamespace = "http://unque.com/", className = "com.unque.Div")
    @ResponseWrapper(localName = "divResponse", targetNamespace = "http://unque.com/", className = "com.unque.DivResponse")
    @Action(input = "http://unque.com/calculator/divRequest", output = "http://unque.com/calculator/divResponse")
    public int div(
        @WebParam(name = "num1", targetNamespace = "")
        int num1,
        @WebParam(name = "num2", targetNamespace = "")
        int num2);

    /**
     * 
     * @param num1
     * @param num2
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getnum", targetNamespace = "http://unque.com/", className = "com.unque.Getnum")
    @ResponseWrapper(localName = "getnumResponse", targetNamespace = "http://unque.com/", className = "com.unque.GetnumResponse")
    @Action(input = "http://unque.com/calculator/getnumRequest", output = "http://unque.com/calculator/getnumResponse")
    public int getnum(
        @WebParam(name = "num1", targetNamespace = "")
        int num1,
        @WebParam(name = "num2", targetNamespace = "")
        int num2);

}
