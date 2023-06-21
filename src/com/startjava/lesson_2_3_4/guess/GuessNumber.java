package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    public static void play(Player... players) {
        System.out.println("Бросаем жребий:");
        int length = players.length;
        for(int i = 0; i < length; i++) {
            int firstPlayer = (int) (Math.random() * (length - i));
            if(firstPlayer < length - 1) {
                Player player = players[length - 1 - i];
                players[length - 1 - i] = players[firstPlayer];
                players[firstPlayer] = player;
            }
            System.out.println((i + 1) + "й ходит игрок " + players[length - 1 - i].getName());
        }

        for(int i = 0; i < 3; i++) {
            int secretNum = 1 + (int) (Math.random() * 100);
            System.out.println("Раунд " + (i + 1) + "\nУ каждого игрока по 10 попыток.");
            for(int j = 0; j < 10; j++) {
                enterNumber(players[2]);
                if(compare(players[2], secretNum)) {
                    break;
                }
                checkTry(players[2]);

                enterNumber(players[1]);
                if(compare(players[1], secretNum)) {
                    break;
                }
                checkTry(players[1]);

                enterNumber(players[0]);
                if(compare(players[0], secretNum)) {
                    break;
                }
                checkTry(players[0]);
            }
            printTries(players[2]);
            System.out.println();
            printTries(players[1]);
            System.out.println();
            printTries(players[0]);
            System.out.println();
        }
        win(players);
        players[2].clear();
        players[1].clear();
        players[0].clear();
    }

    private static void enterNumber(Player player) {
        Scanner console = new Scanner(System.in);
        do {
            System.out.print(player.getName() + ", введите число: ");
            if(player.addNumber(console.nextInt())) {
                break;
            }
            System.out.println("Ошибка, введенное число должно быть в полуинтервале (0, 100]");
        } while(true);
    }

    private static boolean compare(Player player, int secretNum) {
        if(player.getNumber() == secretNum) {
            System.out.println("Игрок " + player.getName() + " угадал число " +
                    player.getNumber() + " с " + player.getNumberTry() + " попытки.");
            player.setQuantityWins();
            return true;
        }
        System.out.print("число " + player.getNumber());
        System.out.print(player.getNumber() > secretNum ? " больше" : " меньше");
        System.out.println(" того, что загадал компьютер");
        return false;
    }

    private static void checkTry(Player player) {
        if(player.getNumberTry() == 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
    }

    private static void printTries(Player player) {
        System.out.println("Числа которые ввел игрок " + player.getName());
        for(int number : player.getNumbers()) {
            System.out.print(number + " ");
        }
    }

    private static void win(Player[] players) {
        for(int i = 0; i < players.length; i++) {
            if(players[i].getQuantityWins() > 1) {
                System.out.println("По результатам 3х раундов победил игрок " + players[i].getName());
                break;
            }
            if(i == players.length - 1) {
                System.out.println("По результатам 3х раундов - ничья");
            }
        }
    }
}