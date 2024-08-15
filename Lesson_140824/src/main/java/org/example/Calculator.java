package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        String needNextCalc;
        char operation;
        double argumentOne;
        double argumentTwo;
        double res = 0;
        do {
            operation = Util.getOperation();
            argumentOne = Util.getNum(false, operation);
            argumentTwo = Util.getNum(true, operation);
            res = Util.getResult(argumentOne, argumentTwo, operation);
            Util.printResult(argumentOne, operation, argumentTwo, res);
            do {
                System.out.println("\nВыполнить ещё ? (Y/N)");
                needNextCalc = scanner.next();
            } while (!Constant.ANS_YES.equalsIgnoreCase(needNextCalc) && !Constant.ANS_NO.equalsIgnoreCase(needNextCalc));

        }

        while (Constant.ANS_YES.equalsIgnoreCase(needNextCalc));
    }

}
