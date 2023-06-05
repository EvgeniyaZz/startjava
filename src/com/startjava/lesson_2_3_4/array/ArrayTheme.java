package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

import java.lang.String;

public class ArrayTheme {

    public static void main(String[] args) {
        reverse();
        multiplication();
        deleteElement();
        showElementArray();
        generate();
        copy();
    }

    private static void reverse() {
        System.out.println("1. Реверс значений массива.");
        int[] numbers = {5, 2, 6, 1, 3, 7, 4};

        System.out.println("Исходный массив: ");
        showArray(numbers);

        int length = numbers.length;
        for(int i = 0; i < length / 2; i++) {
            int number = numbers[i];
            numbers[i] = numbers[length - 1 - i];
            numbers[length - 1 - i] = number;
        }
        System.out.println("\nОбратный массив: ");
        showArray(numbers);
    }

    private static void showArray(int[] array) {
        for(int intArray : array) {
            System.out.print(intArray + " ");
        }
    }

    private static void multiplication() {
        System.out.println("\n\n2. Вывод произведения элементов массива.");
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int result = 1;

        for(int i = 1; i < 9; i++) {
            result *= numbers[i];
            System.out.print(numbers[i]);
            System.out.print(i == 8 ? " = " + result : " * ");
        }

        System.out.println("\nЧисло с индексом 0 : " + numbers[0] + ", число с индексом 9 : " + numbers[9]);
    }

    private static void deleteElement() {
        System.out.println("\n3. Удаление элементов массива.");

        float[] array = new float[15];
        int length = array.length;

        for(int i = 0; i < length; i++) {
            array[i] = (float) Math.random();
        }

        int middleIndex = length / 2;
        float floatArr = array[middleIndex];

        System.out.println("Исходный массив: ");
        showArray(array);

        int quantityZero = 0;

        for(int i = 0; i < length; i++) {
            if(array[i] > floatArr) {
                array[i] = 0;
                quantityZero += 1;
            }
        }
        System.out.println("\nИзмененный массив: ");
        showArray(array);

        System.out.println("\nКоличество обнуленных ячеек: " + quantityZero);
    }

    private static void showArray(float[] array) {
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

    private static void generate() {
        System.out.println("\n5. Генерация уникальных чисел.");

        int[] array = new int[30];

        for(int i = 0; i < array.length; i++) {
            int intArr = 0;
            boolean same;
            do {
                same = false;
                intArr = (int) (Math.random() * 40 + 60);
                for(int k = 0; k < i; k++){
                    if(intArr == array[k]) {
                        same = true;
                        break;
                    }
                }
            } while(same);
            array[i] = intArr;
        }

        Arrays.sort(array);

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(i % 10 == 9 ? "\n" : " ");
        }
    }

    private static void copy() {
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
        showArray(stringsOne);
        System.out.println("Второй массив:");
        showArray(stringsTwo);
    }

    private static void showArray(String[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(i == (array.length - 1) ? array[i] + ".\n" : array[i] + ", ");
        }
    }
}