package com.company.task1.client.console;

import com.company.library.Calculate;
import com.company.library.Helper;

public class MainConsole {

    public static void main(String[] args) {
        String input = Helper.Input();
        while (!input.equals("exit")) {
            String[] split = input.split(" ");
            double x = Double.valueOf(split[0]);
            double y = Double.valueOf(split[2]);
            switch (split[1]) {
                case "-":
                    System.out.println(Calculate.subtraction(x, y));
                    break;
                case "+":
                    System.out.println(Calculate.addition(x, y));
                    break;
                case "*":
                    System.out.println(Calculate.multiplication(x, y));
                    break;
                case "/":
                    System.out.println(Calculate.division(x, y));
                    break;
            }
            input = Helper.Input();
        }
    }

}
