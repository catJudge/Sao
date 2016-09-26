package com.company.task1.client.consoleWebService;


import com.company.library.Helper;
import com.company.task1.webService.CalculateWebService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class MainConsoleWebService {

    private static CalculateWebService hello;

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:1986/calculate?wsdl");
        QName qname = new QName("http://webService.task1.company.com/", "CalculateWebServiceImplService");
        Service service = Service.create(url, qname);
        hello = service.getPort(CalculateWebService.class);
        String input = Helper.Input();
        while (!input.equals("exit")) {
            String[] split = input.split(" ");
            double x = Double.valueOf(split[0]);
            double y = Double.valueOf(split[2]);
            switch (split[1]) {
                case "-":
                    System.out.println(hello.subtraction(x, y));
                    break;
                case "+":
                    System.out.println(hello.addition(x, y));
                    break;
                case "*":
                    System.out.println(hello.multiplication(x, y));
                    break;
                case "/":
                    System.out.println(hello.division(x, y));
                    break;
            }
            input = Helper.Input();
        }
    }
}
