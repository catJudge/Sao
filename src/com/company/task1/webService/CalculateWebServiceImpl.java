package com.company.task1.webService;

import com.company.library.Calculate;

import javax.jws.WebService;

@WebService(endpointInterface = "com.company.task1.webService.CalculateWebService")
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
}
