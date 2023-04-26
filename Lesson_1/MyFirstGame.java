import java.util.Scanner;
import java.lang.Math;

public class MyFirstGame {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int a = 1 + (int) (Math.random() * 100);
        int b;
        System.out.println("Угадайте число, которое загадал компьютер");
        do {
            System.out.print("Введите число: ");
            b = userInput.nextInt();
            if(a == b) {
                System.out.print("Вы победили! ");
            } else {
                if (a < b) {
                    System.out.print("число " + b + " больше того, что загадал компьютер\n");
                } else {
                    System.out.print("число " + b + " меньше того, что загадал компьютер\n");
                }
            }
        } while (a != b);
    }
}