package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        GuessNumber game = new GuessNumber(create());

        String repeat = "yes";
        do {
            if(repeat.equals("yes")) {
                System.out.println("Угадайте число, которое загадал компьютер");
                game.play();
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            repeat = console.next();
        } while(!repeat.equals("no"));
    }

    private static Player[] create() {
        Scanner console = new Scanner(System.in);

        Player[] players = new Player[GuessNumber.QUANTITY_PLAYERS];
        for(int i = 0; i < GuessNumber.QUANTITY_PLAYERS; i++) {
            System.out.print("Введите имя " + (i + 1) + "го игрока: ");
            players[i] = new Player(console.next());
        }
        return players;
    }
}