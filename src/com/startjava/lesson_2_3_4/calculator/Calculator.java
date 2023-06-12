package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private String mathProblem;

    public void setMathProblem(String mathProblem) {
        this.mathProblem = mathProblem;
    }

    public double calculate() {
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
}