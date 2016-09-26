package com.company.task3.webService;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.WebFault;

@WebService
@WebFault
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface CalculateWebService {
    @WebMethod
    double addition(double x, double y);

    @WebMethod
    double subtraction(double x, double y);

    @WebMethod
    double division(double x, double y);

    @WebMethod
    double multiplication(double x, double y);

    @WebMethod
    @Oneway
    void printCol(double x, double y);

    @WebMethod
    void printRow(double x, double y);

}
