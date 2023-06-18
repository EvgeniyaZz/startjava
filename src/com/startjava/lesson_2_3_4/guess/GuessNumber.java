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
        Scanner console = new Scanner(System.in);
        int secretNum = 1 + (int) (Math.random() * 100);
        System.out.println("У каждого игрока по 10 попыток.");
        for(int i = 0; i < 10; i++) {
            System.out.print(player1.getName() + ", введите число: ");
            player1.setNumber(console.nextInt());
            player1.setNumberPlayer(i);
            player1.setNumberTry(i + 1);

            if(player1.getNumber() == secretNum) {
                System.out.println("Игрок " + player1.getName() + " угадал число " +
                        player1.getNumber() + " с " + player1.getNumberTry() + " попытки.");
                break;
            }

            compare(player1, secretNum);
            endTry(player1);

            System.out.print(player2.getName() + ", введите число: ");
            player2.setNumber(console.nextInt());
            player2.setNumberPlayer(i);
            player2.setNumberTry(i + 1);

            if(player2.getNumber() == secretNum) {
                System.out.println("Игрок " + player2.getName() + " угадал число " +
                        player2.getNumber() + " с " + player2.getNumberTry() + " попытки.");
                break;
            }

            compare(player2, secretNum);
            endTry(player2);
        }
        player1.setCopyNumbersPlayer();
        player2.setCopyNumbersPlayer();
        System.out.println("Числа которые ввел игрок " + player1.getName());
        show(player1.getCopyNumbersPlayer());
        System.out.println("Числа которые ввел игрок " + player2.getName());
        show(player2.getCopyNumbersPlayer());
        player1.clearNumbersPlayer();
        player2.clearNumbersPlayer();
    }

    private void compare(Player player, int secretNum) {
        if(player1.getNumber() > secretNum) {
            System.out.println("число " + player.getNumber() + " больше того, " +
                    "что загадал компьютер");
        } else {
            System.out.println("число " + player.getNumber() + " меньше того, " +
                    "что загадал компьютер");
        }
    }

    private void endTry(Player player) {
        if(player.getNumberTry() == 10) {
            System.out.println("У " + player2.getName() + " закончились попытки");
        }
    }

    private void show(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(i != (array.length - 1) ? " " : "\n");
        }
    }
}