package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static double calculate(String expression) {
        String[] mathElements = expression.split(" ");
        try {
            int num1 = Integer.parseInt(mathElements[0]);
            int num2 = Integer.parseInt(mathElements[2]);

            if(num1 <= 0 && num2 <= 0)
                throw new NumberFormatException();

            return switch(mathElements[1]) {
                case "+" -> Math.addExact(num1, num2);
                case "-" -> Math.subtractExact(num1, num2);
                case "*" -> Math.multiplyExact(num1, num2);
                case "/" -> (double) num1 / num2;
                case "^" -> Math.pow(num1, num2);
                case "%" -> num1 % num2;
                default -> {
                    System.out.println("Введенная математическая операция не поддерживается.");
                    yield 0;
                }
            };
        } catch (NumberFormatException e) {
            System.out.println("Введите корректные значения.");
            return 0;
        }
    }
}