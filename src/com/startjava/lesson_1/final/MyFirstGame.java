package com.startjava.lesson_1.final;

import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numComputer = 1 + (int) (Math.random() * 100);
        int numPlayer;
        System.out.println("Угадайте число, которое загадал компьютер");
        do {
            System.out.print("Введите число: ");
            numPlayer = console.nextInt();
            if(numComputer < numPlayer) {
                System.out.print("число " + numPlayer + " больше того, что загадал компьютер\n");
            } else if(numComputer > numPlayer) {
                System.out.print("число " + numPlayer + " меньше того, что загадал компьютер\n");
            }
        } while (numComputer != numPlayer);
        System.out.print("Вы победили!");
    }
}