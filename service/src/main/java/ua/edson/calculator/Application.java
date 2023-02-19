package ua.edson.calculator;


import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        while (true) {

            System.out.println("Введите два числа и одну из арифметических операций \"+\" \"-\" \"*\" \"/\" ");

            Scanner in = new Scanner(System.in);
            System.out.println("Для продолжения введите \"y\" Для завершения работы введите \"q\"");
            String button = in.next();

            if (button.equalsIgnoreCase("y")) {

                System.out.println("Введите первое число: ");
                Double a = in.nextDouble();

                System.out.println("Введите математический знак: ");
                String s = in.next();

                System.out.println("Введите второе число: ");
                Double b = in.nextDouble();

//        Calculator<Integer> sum = new IntegerCalculator();
//        Calculator<Integer> minus = new IntegerCalculator();
//        Calculator<Integer> multiply = new IntegerCalculator();
//        Calculator<Integer> division = new IntegerCalculator();

                Calculator<Double> sum = new DoubleCalculator();
                Calculator<Double> minus = new DoubleCalculator();
                Calculator<Double> multiply = new DoubleCalculator();
                Calculator<Double> division = new DoubleCalculator();

                if (s.equals("+")) {
                    System.out.println("Сумма чисел равна: " + sum.sum(a, b));
                } else if (s.equals("-")) {
                    System.out.println("Сумма чисел равна: " + minus.minus(a, b));
                } else if (s.equals("*")) {
                    System.out.println("Сумма чисел равна: " + multiply.multiply(a, b));
                } else if (s.equals("/")) {
                    System.out.println("Сумма чисел равна: " + division.division(a, b));
                } else {
                    System.out.println("Задана не верная арифметическая операция!!!");
                }

            } else if (button.equalsIgnoreCase("q")) {
                System.out.println("Работа завершена!");
                break;
            } else;
        }

        // Написать цикл for, идеально сделать его бесконечным.
        // В теле цикла вводить 2 числа и математический цикл. Высчитывать выражение.

//        for (; ;) {
//            System.out.println("Введите два числа и одну из арифметических операций \"+\" \"-\" \"*\" \"/\" ");
//
//            Scanner in = new Scanner(System.in);
//            System.out.println("Введите первое число: ");
//            Integer a = in.nextInt();
//
//            System.out.println("Введите математический знак: ");
//            String s = in.next();
//
//            System.out.println("Введите второе число: ");
//            Integer b = in.nextInt();
//            //System.out.print(a + s + b + "=");
//
//            //TODO: тут писать код
//
//            int add, subtract, multiply;
//            double devide;
//
//            add = a + b;
//            subtract = a - b;
//            multiply = a * b;
//            devide = (double) a / b;
//
//            if (s.equals("+")) {
//                System.out.println("Сумма чисел равна = " + add);
//            } else if (s.equals("-")) {
//                System.out.println("Разница чисел равна = " + subtract);
//            } else if (s.equals("*")) {
//                System.out.println("Умножение чисел равно = " + multiply);
//            } else if (s.equals("/")) {
//                System.out.println("Деление чисел равно = " + devide);
//            } else {
//                System.out.println("Задана не верная арифметическая операция!!!");
//            }
//        }

    }
}