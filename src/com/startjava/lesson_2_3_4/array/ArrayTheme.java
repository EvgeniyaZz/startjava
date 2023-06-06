package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
        reverseElementArray();
        multiplyElementArray();
        deleteElementArray();
        showElementArray();
        generateElementArray();
        copyElementArray();
    }

    private static void reverseElementArray() {
        System.out.println("1. Реверс значений массива.");
        int[] numbers = {5, 2, 6, 1, 3, 7, 4};

        System.out.println("Исходный массив: ");
        showElementArray(numbers);

        int length = numbers.length;
        for(int i = 0; i < length / 2; i++) {
            int number = numbers[i];
            length--;
            numbers[i] = numbers[length];
            numbers[length] = number;
        }
        System.out.println("\nОбратный массив: ");
        showElementArray(numbers);
    }

    private static void showElementArray(int[] array) {
        for(int intArray : array) {
            System.out.print(intArray + " ");
        }
    }

    private static void multiplyElementArray() {
        System.out.println("\n\n2. Вывод произведения элементов массива.");
        int[] digits = new int[10];

        for(int i = 0; i < digits.length; i++) {
            digits[i] = i;
        }

        int result = 1;

        for(int i = 1; i < 9; i++) {
            result *= digits[i];
            System.out.print(i == 8 ? digits[i] + " = " + result : digits[i] + " * ");
        }

        System.out.println("\nЧисло с индексом 0 : " + digits[0] + ", число с индексом 9 : " + digits[9]);
    }

    private static void deleteElementArray() {
        System.out.println("\n3. Удаление элементов массива.");

        float[] floatNumbers = new float[15];
        int length = floatNumbers.length;

        for(int i = 0; i < length; i++) {
            floatNumbers[i] = (float) Math.random();
        }

        System.out.println("Исходный массив: ");
        showElementArray(floatNumbers);

        int quantityZero = 0;

        for(int i = 0; i < length; i++) {
            float floatArr = floatNumbers[length / 2];
            if(floatNumbers[i] > floatArr) {
                floatNumbers[i] = 0;
                quantityZero++;
            }
        }
        System.out.println("\nИзмененный массив: ");
        showElementArray(floatNumbers);

        System.out.println("\nКоличество обнуленных ячеек: " + quantityZero);
    }

    private static void showElementArray(float[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.printf("%6.3f" , array[i]);
            System.out.print(i == array.length / 2 ? "\n" : " ");
        }
    }

    private static void showElementArray() {
        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке.");

        char[] letters = new char[26];
        int length = letters.length;

        for(int i = 0; i < length; i++) {
            letters[i] = (char) ('A' + (char) i);
        }

        for(int i = 0; i < length; i++) {
            for(int k = 0; k <= i; k++) {
                System.out.print(letters[length - 1 - k]);
                System.out.print(i == k ? "\n" : "");
            }
        }
    }

    private static void generateElementArray() {
        System.out.println("\n5. Генерация уникальных чисел.");

        int[] uniqNumbers = new int[30];

        for(int i = 0; i < uniqNumbers.length; i++) {
            int intArr = 0;
            boolean same;
            do {
                same = false;
                intArr = (int) (Math.random() * 40 + 60);
                for(int k = 0; k < i; k++){
                    if(intArr == uniqNumbers[k]) {
                        same = true;
                        break;
                    }
                }
            } while(same);
            uniqNumbers[i] = intArr;
        }

        Arrays.sort(uniqNumbers);

        for(int i = 0; i < uniqNumbers.length; i++) {
            System.out.print(uniqNumbers[i]);
            System.out.print(i % 10 == 9 ? "\n" : " ");
        }
    }

    private static void copyElementArray() {
        System.out.println("\n6. Копирование не пустых строк.");

        String[] stringsOne = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};

        int quantitiString = 0;

        for(String stringArr : stringsOne) {
            if (!stringArr.isBlank()) {
                quantitiString += 1;
            }
        }

        String[] stringsTwo = new String[quantitiString];
        int indexStringsOne = 0;
        int indexStringsTwo = 0;
        quantitiString = 0;

        for(int i = 0; i < stringsOne.length; i++) {
            if(stringsOne[i].isBlank()) {
                System.arraycopy(stringsOne, indexStringsOne, stringsTwo, indexStringsTwo, quantitiString);
                indexStringsTwo += quantitiString;
                indexStringsOne += (quantitiString + 1);
                quantitiString = 0;
            } else {
                quantitiString += 1;
                if(i == (stringsOne.length - 1)) {
                    System.arraycopy(stringsOne, indexStringsOne, stringsTwo, indexStringsTwo, quantitiString);
                }
            }
        }

        System.out.println("Первый массив:");
        showElementArray(stringsOne);
        System.out.println("Второй массив:");
        showElementArray(stringsTwo);
    }

    private static void showElementArray(String[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(i == (array.length - 1) ? array[i] + ".\n" : array[i] + ", ");
        }
    }
}