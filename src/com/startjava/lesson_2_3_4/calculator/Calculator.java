package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public double calculate(String mathProblem) {
        String[] mathElements = mathProblem.split(" ");
        int num1 = Integer.parseInt(mathElements[0]);
        int num2 = Integer.parseInt(mathElements[2]);

        switch(mathElements[1]) {
            case "+":
                return Math.addExact(num1, num2);
            case "-":
                return Math.subtractExact(num1, num2);
            case "*":
                return Math.multiplyExact(num1, num2);
            case "/":
                return (double) num1 / num2;
            case "^":
                return Math.pow(num1, num2);
            case "%":
                return num1 % num2;
            default:
                System.out.println("Введенная математическая операция не поддерживается.");
                return 0;
        }
    }

    public void show(double result) {
        if (result % 1 == 0) {
            System.out.printf("Результат: %.0f\n", result);
        } else {
            System.out.printf("Результат: %.3f\n", result);
        }
    }
}