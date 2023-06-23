package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        GuessNumber game = new GuessNumber();

        Player[] players = new Player[3];
        for(int i = 0; i < players.length; i++) {
            System.out.print("Введите имя " + (i + 1) + "го игрока: ");
            players[i] = new Player(console.next());
        }

        String repeat = "yes";
        do {
            if(repeat.equals("yes")) {
                System.out.println("Угадайте число, которое загадал компьютер");
                game.play(players);
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            repeat = console.next();
        } while(!repeat.equals("no"));
    }
}