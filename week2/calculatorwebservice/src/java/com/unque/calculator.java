/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unque;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author mouni
 */
@WebService(serviceName = "calculator")
public class calculator {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getnum")
    public int getnum(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        int sum=num1+num2;
        return sum;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "sub")
    public int sub(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
       int res=num1-num2;
       return res;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "mul")
    public int mul(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        int res=num1*num2;
        return res;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "div")
    public int div(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        int res=num1/num2;
        return res;
    }

    /**
     * This is a sample web service operation
     */
}
