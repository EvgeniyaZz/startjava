package com.startjava.lesson_1.base;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел\n");

        int nums = -10;
        int summa1 = 0;
        int summa2 = 0;
        do {
            if(nums % 2 == 0) {
            summa1 = summa1 + nums;
            } else {
                summa2 = summa2 + nums;
            }
            nums++;
        } while(nums <= 21);

        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + summa1 +
            ", а нечетных = " + summa2);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания\n");

        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = 0;
        int min = 0;

        if(num1 > num2 && num1 > num3) {
            max = num1;
            if(num2 > num3) {
                min = num3;
            } else {
                min = num2;
            }
        } else if(num2 > num1 && num2 > num3) {
            max = num2;
            if(num1 > num3) {
                min = num3;
            } else {
                min = num1;
            }
        } else if(num3 > num1 && num3 > num2) {
            max = num3;
            if(num1 > num2) {
                min = num2;
            } else {
                min = num1;
            }
        }
        for(int i = max; i >= min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр\n");

        int num = 1234;
        num1 = 0;
        int summa = 0;
        int qualityNum = 4;
        while(qualityNum >= 1) {
            num1 = num % 10;
            System.out.print(num1);
            summa += num1;
            num = num / 10;
            qualityNum--;
        }
        System.out.println("\n" + summa);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк\n");

        int k = 1;
        for(k = 1; k < 24; k += 2) {
            System.out.printf("%2d%s", k, k % 10 == 9 ? "\n" : " ");
        }
        while(k % 10 != 1) {
            System.out.printf("%2d%s", 0, " ");
            k +=2;
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность\n");

        num = 3242592;
        qualityNum = 7;
        int quality2 = 0;
        int numChange = num;
        while(qualityNum >=1 ) {
            num1 = numChange % 10;
            if(num1 == 2) {
                quality2++;
            }
            numChange = numChange / 10;
            qualityNum--;
        }
        if(quality2 / 2 == 0) {
            System.out.println("Число " + num + " содержит " + quality2 +
                " (четное) количество двоек");
        } else {
            System.out.println("Число " + num + " содержит " + quality2 +
                " (нечетное) количество двоек");
        }

        System.out.println("\n6. Отображение фигур в консоли\n");

        for(int i = 0; i < 5 ; i++) {
            System.out.println("**********");
        }

        int qualitySymbol = 5;
        String symbol = "#";
        while(qualitySymbol > 0) {
            System.out.printf("%s%n", symbol.repeat(qualitySymbol));
            qualitySymbol--;
        }

        qualitySymbol = 1;
        symbol = "$";
        do {
            System.out.printf("%s%n", symbol.repeat(qualitySymbol));
            qualitySymbol++;
        } while(qualitySymbol < 3);
        do {
            System.out.printf("%s%n", symbol.repeat(qualitySymbol));
            qualitySymbol--;
        } while(qualitySymbol > 0);

        System.out.println("\n7. Отображение ASCII-символов\n");

        System.out.printf("%3s%7s%n", "Dec", "Char");

        for(int i = 1; i <= 47; i += 2) {
            char symbol1 = (char) i;
            System.out.printf("%3s%7c%n", i, symbol1);
        }
        for(int i = 98; i <= 122; i += 2) {
            char symbol1 = (char) i;
            System.out.printf("%3s%7c%n", i, symbol1);
        }

        System.out.println("\n8. Проверка, является ли число палиндромом\n");

        num = 1234321;
        num1 = 0;
        num2 = 0;
        for(int i = 1; i <= 10000 ; i *= 100) {
            num1 = num % 10;
            num2 = num * i / 1000000 % 10;
            if (num1 != num2) {
                System.out.println("число не является палиндромом");
                break;
            }
            num = num / 10;
        }
        if(num1 == num2) {
            System.out.println("число является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым\n");

        nums = 123456;
        num = nums;
        num1 = 0;
        num2 = 0;
        summa1 = 0;
        summa2 = 0;
        for(int i = 1; i <= 3 ; i++) {
            num1 = num % 10;
            summa1 += num1;
            num = num / 10;
        }
        for(int i = 1; i <= 3 ; i++) {
            num2 = num % 10;
            summa2 += num2;
            num = num / 10;
        }
        System.out.println("Сумма цифр " + nums / 1000 + " = " + summa2);
        System.out.println("Сумма цифр " + nums % 1000 + " = " + summa1);
        if(summa1 == summa2) {
            System.out.println("Число " + nums + " является счастливым");
        } else {
            System.out.println("Число " + nums + " не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора\n");

        System.out.print("   |");
        for(int i = 2; i < 10; i++){
            System.out.printf("%3d", i);}
        System.out.printf("\n———|————————————————————————\n");
        for(int i = 2; i < 10; i++) {
            System.out.printf("%2d |", i);
            for(int j = 2; j < 10; j++){
                System.out.printf("%3d", j * i);
            }
            System.out.println("");
        }
    }
}