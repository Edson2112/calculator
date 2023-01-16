package ua.edson.calculator;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        System.out.println("Введите два числа и одну из арифметических операций \"+\" \"-\" \"*\" \"/\" ");

        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        Integer a = in.nextInt();

        System.out.println("Введите математический знак: ");
        String s = in.next();

        System.out.println("Введите второе число: ");
        Integer b = in.nextInt();
        //System.out.print(a + s + b + "=");

        //TODO: тут писать код

        int add, subtract, multiply;
        double devide;

        add = a + b;
        subtract = a - b;
        multiply = a * b;
        devide = (double) a / b;

        if (s.equals("+")) {
            System.out.println("Сумма чисел равна = " + add);
        } else if (s.equals("-")) {
            System.out.println("Разница чисел равна = " + subtract);
        } else if (s.equals("*")) {
            System.out.println("Умножение чисел равно = " + multiply);
        } else if (s.equals("/")) {
            System.out.println("Деление чисел равно = " + devide);
        } else {
            System.out.println("Задана не верная арифметическая операция!!!");
        }

    }
}
