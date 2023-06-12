package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Calculator calculator = new Calculator();

        String repeat = "yes";
        do {
            if(repeat.equals("yes")) {
                console.nextLine();
                System.out.print("Введите математическое выражение: ");
                calculator.setMathProblem(console.nextLine());
                double result = calculator.calculate();
                if (result % 1 == 0) {
                    System.out.printf("Результат: %.0f\n", result);
                } else {
                    System.out.printf("Результат: %.3f\n", result);
                }
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            repeat = console.next();
        } while(!repeat.equals("no"));
    }
}