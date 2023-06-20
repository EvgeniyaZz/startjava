package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        int secretNum = 1 + (int) (Math.random() * 100);
        System.out.println("У каждого игрока по 10 попыток.");

        for(int i = 0; i < 10; i++) {
            enterNumber(player1);
            if(compare(player1, secretNum)) {
                break;
            }
            checkTry(player1);

            enterNumber(player2);
            if(compare(player2, secretNum)) {
                break;
            }
            checkTry(player2);
        }

        printTries(player1);
        System.out.println();
        printTries(player2);
        System.out.println();
        player1.clear();
        player2.clear();
    }

    private void enterNumber(Player player) {
        Scanner console = new Scanner(System.in);
        System.out.print(player.getName() + ", введите число: ");
        player.addNumber(console.nextInt());
    }

    private boolean compare(Player player, int secretNum) {
        if(player.getNumber() == secretNum) {
            System.out.println("Игрок " + player.getName() + " угадал число " +
                    player.getNumber() + " с " + player.getNumberTry() + " попытки.");
            return true;
        }
        if(player.getNumber() > secretNum) {
            System.out.println("число " + player.getNumber() + " больше того, " +
                    "что загадал компьютер");
        } else {
            System.out.println("число " + player.getNumber() + " меньше того, " +
                    "что загадал компьютер");
        }
        return false;
    }

    private void checkTry(Player player) {
        if(player.getNumberTry() == 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
    }

    private void printTries(Player player) {
        System.out.println("Числа которые ввел игрок " + player.getName());
        for(int number : player.getNumbers()) {
            System.out.print(number + " ");
        }
    }
}