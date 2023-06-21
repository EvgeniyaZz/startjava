package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(console.next());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(console.next());
        System.out.print("Введите имя третьего игрока: ");
        Player player3 = new Player(console.next());

        String repeat = "yes";
        do {
            if(repeat.equals("yes")) {
                System.out.println("Угадайте число, которое загадал компьютер");
                GuessNumber.play(player1, player2, player3);
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            repeat = console.next();
        } while(!repeat.equals("no"));
    }
}