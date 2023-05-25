package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Calculator calculator = new Calculator();

        String repeat;
        do {
            System.out.print("Введите первое число: ");
            calculator.setNum1(console.nextInt());
            System.out.print("Введите знак математической операции: ");
            calculator.setSign(console.next().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setNum2(console.nextInt());
            System.out.println("Результат: " + calculator.calculate());
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                repeat = console.next();
            } while((!repeat.equals("yes")) && (!repeat.equals("no")));
        } while(repeat.equals("yes"));
    }
}