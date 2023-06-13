package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Calculator calculator = new Calculator();

        String repeat = "yes";
        do {
            if(repeat.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                double result = calculator.calculate(console.nextLine());
                calculator.show(result);
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            repeat = console.nextLine();
        } while(!repeat.equals("no"));
    }
}