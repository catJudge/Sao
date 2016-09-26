package com.company.task3.webService;

import com.company.library.Calculate;
import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

import javax.jws.WebService;

@WebService(endpointInterface = "com.company.task3.webService.CalculateWebService")
public class CalculateWebServiceImpl implements CalculateWebService {

    @Override
    public double addition(double x, double y) {
        return Calculate.addition(x, y);
    }

    @Override
    public double subtraction(double x, double y) {
        return Calculate.subtraction(x, y);
    }

    @Override
    public double division(double x, double y) {
        return Calculate.division(x, y);
    }

    @Override
    public double multiplication(double x, double y) {
        return Calculate.multiplication(x, y);
    }

    @Override
    public void printCol(double x, double y) {
        System.out.println("print");
        System.out.println(x);
        System.out.println(y);
    }

    @Override
    public void printRow(double x, double y) {
        System.out.println("print");
        System.out.println(x + " " + y);
    }
}
