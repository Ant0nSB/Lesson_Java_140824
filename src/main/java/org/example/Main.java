package org.example;

import com.sun.source.tree.IfTree;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Напишите программу "Калькулятор",
//                производящую вычисления с двумя числами c дробной частью. 
//        Тип данных вводимых аргументов должен быть Double. 
//        Пользователь должен ввести с клавиатуры знак выполняемой
//        математической операции в формате строки, а затем программа должна
//        преобразовать введенную строку в значение переменной типа Char (получить из
//        строки первый символ методом string.charAt(0);).
//        Требуется произвести проверку введенных данных:
//        Если пользователь ввёл знак операции, отличный от +, -, *, / -
//                выводить сообщение о том, что указанная операция не поддерживается
//        программой.
//                Если пользователь хочет выполнить операцию деления и в качестве значения
//        второго аргумента ввёл значение 0, то программа должна вывести сообщение о том,
//        что на 0 делить нельзя.
//        В обеих ситуациях программа должна прекращать
//        Результат вычислений необходимо вывести с точностью до двух чисел после запятой
//        в формате <значение переменной argumentOne> <знак математической операции>
//        <значение переменной argumentTwo> = <значение переменной результата>.
//        Используйте операторы цикла для:
//        Реализации интерактивного меню. После завершения вычислений калькулятор должен спрашивать желает
//        ли пользователь выполнить еще вычисление. Если пользователь вводит "Y", то калькулятор
//        выполняет новый цикл работы - запрашивает значения аргументов и знак математической операции,
//        выполняет вычисления и выводит на экран ответ. После этого снова спрашивает желает ли пользователь
//        выполнить еще вычисление. Если пользователь вводит "N", то работа программы завершается.
//                Ввода корректного значения
//        Ввода корректного значения второго аргумента (знаменателя), если пользователь выбрал знак деления.
//        Если пользователь выбрал операцию деления и ввёл значение второго аргумента = 0,
//        то программа должна запрашивать ввод нового значения аргумента до тех пор,
//                пока оно не будет не равно нулю.
//        Аналогично программа должна повторно запрашивать ввод знака математической операции до тех пор,
//        пока он не будет введён корректно.
       Scanner scanner = new Scanner(System.in);
       scanner.useLocale(Locale.ENGLISH);
       String needNextCalc;
       do {
           char operation;
         do {
             System.out.println("Введите знак мат.операции (+,-,*,/,%): ");

             String operationInput = scanner.next();
              operation = operationInput.charAt(0);
         } while (operation != Constant.SIGN_PLUS && operation != Constant.SIGN_MINUS && operation != Constant.SIGN_MULTI
         && operation != Constant.SIGN_DIV && operation != Constant.SIGN_PROC);

        if ( operation != '+'&& operation != '-' && operation != '*'  && operation != '/' ){
            System.out.println("Операция не поддерживается");
           return;
        }
        System.out.println("Введите первое число :");
        double argumentOne = scanner.nextDouble();
        System.out.println("Введите второе число :");
        double argumentTwo = scanner.nextDouble();

        double res = 0;

        if ((operation == '/' || operation == '%') &&  argumentTwo == 0){
            System.out.println("Делитель не может иметь значение 0!");
            return;
        }
switch (operation){
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
       System.out.printf("%.2f %s %.2f = %.2f", argumentOne,operation,argumentTwo,res);
        do {
            System.out.println("Выполнить ещё ? (Y/N)");
            needNextCalc = scanner.next();
        } while (!Constant.ANS_YES.equalsIgnoreCase(needNextCalc) && !Constant.ANS_NO.equalsIgnoreCase(needNextCalc));

       }

       while (Constant.ANS_YES.equalsIgnoreCase(needNextCalc));







//      String yes = "Y";
//        String no = "N";
//        for (String  = 0; i < ; i++) {
//
//        }

    }
}


//  if (operation == '+'){
//            res = argumentOne + argumentTwo ;
//        } else if (operation == '-') {
//            res = argumentOne - argumentTwo;
//        } else if (operation == '*') {
//            res = argumentOne * argumentTwo;
//        } else if (operation == '/') {
//            if (argumentTwo == 0){
//                System.out.println("Делитель не может иметь значение 0!");
//                return;
//            }
//             res = argumentOne / argumentTwo;
//        }
//        System.out.printf("%.2f %s %.2f = %.2f", argumentOne,operation,argumentTwo,res);
//
//        Используйте оператор switch-case вместо оператора if-else при обработке введенной
//        математической операции. 
//        К списку арифметических операций, выполняемых калькулятором, добавьте поддержку
//        операции деления по модулю (%), возвращающую остаток от деления.
// double res = 0;