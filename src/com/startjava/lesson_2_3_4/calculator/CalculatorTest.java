package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String repeat = "yes";
        do {
            if(repeat.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                double result = Calculator.calculate(console.nextLine());
                show(result);
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            repeat = console.nextLine();
        } while(!repeat.equals("no"));
    }

    public static void show(double result) {
        System.out.printf(result % 1 == 0 ? "Результат: %.0f\n" : "Результат: %.3f\n", result);
    }
}