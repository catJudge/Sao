package com.company.task1.webService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface CalculateWebService {
    @WebMethod
    public double addition(double x, double y);

    @WebMethod
    public double subtraction(double x, double y);

    @WebMethod
    public double division(double x, double y);

    @WebMethod
    public double multiplication(double x, double y);
}
