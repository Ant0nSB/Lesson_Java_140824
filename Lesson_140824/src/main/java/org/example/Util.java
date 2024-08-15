package org.example;

import java.util.Scanner;

public class Util {
    private static Scanner scanner = new Scanner(System.in);

    public static char getOperation() {

        char operation;
        do {
            System.out.println("Введите знак мат.операции (+,-,*,/,%): ");

            String operationInput = scanner.next();
            operation = operationInput.charAt(0);
        } while (operation != Constant.SIGN_PLUS && operation != Constant.SIGN_MINUS && operation != Constant.SIGN_MULTI
                && operation != Constant.SIGN_DIV && operation != Constant.SIGN_PROC);
        return operation;
    }

    public static double getNum(boolean isCheck, char operation) {

        double argument;
        if (isCheck) {
            do {
                System.out.println("Введите число : ");
                argument = scanner.nextDouble();
            } while ((operation == '/' || operation == '%') && argument == 0);
        } else {
            System.out.println("Введите число : ");
            argument = scanner.nextDouble();
        }
        return argument;
    }

    public static double getResult(double argumentOne, double argumentTwo, char operation) {
        double res = 0;
        switch (operation) {
            case Constant.SIGN_PLUS:
                res = argumentOne + argumentTwo;
                break;
            case Constant.SIGN_MINUS:
                res = argumentOne - argumentTwo;
                break;
            case Constant.SIGN_MULTI:
                res = argumentOne * argumentTwo;
                break;
            case Constant.SIGN_DIV:

                res = argumentOne / argumentTwo;
                break;
            case Constant.SIGN_PROC:
                res = argumentOne % argumentTwo;
                break;
        }
        return res;
    }

    public static void printResult(double argumentOne, char operation, double argumentTwo, double res) {
        System.out.printf("%.2f %s %.2f = %.2f", argumentOne, operation, argumentTwo, res);
    }
}
