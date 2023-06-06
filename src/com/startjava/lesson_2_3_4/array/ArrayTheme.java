package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
        reverseElementsArray();
        multiplyElementsArray();
        deleteElementsArray();
        showElementsArray();
        generateElementsArray();
        copyElementsArray();
    }

    private static void reverseElementsArray() {
        System.out.println("1. Реверс значений массива.");
        int[] numbers = {5, 2, 6, 1, 3, 7, 4};

        System.out.println("Исходный массив: ");
        show(numbers);

        int length = numbers.length;
        for(int i = 0; i <= length / 2; i++) {
            int number = numbers[i];
            numbers[i] = numbers[--length];
            numbers[length] = number;
        }
        System.out.println("\nОбратный массив: ");
        show(numbers);
    }

    private static void show(int[] array) {
        for(int intArray : array) {
            System.out.print(intArray + " ");
        }
    }

    private static void multiplyElementsArray() {
        System.out.println("\n\n2. Вывод произведения элементов массива.");
        int[] multipliers = new int[10];
        int length = multipliers.length;

        for(int i = 0; i < length; i++) {
            multipliers[i] = i;
        }

        int result = 1;
        for(int i = 1; i < length - 1; i++) {
            result *= multipliers[i];
            System.out.print(multipliers[i]);
            System.out.print(i != (length - 2) ?  " * " : " = " + result);
        }

        System.out.println("\nЧисло с индексом 0 : " + multipliers[0] + ", число с индексом 9 : " + multipliers[9]);
    }

    private static void deleteElementsArray() {
        System.out.println("\n3. Удаление элементов массива.");

        float[] randomFloats = new float[15];
        int length = randomFloats.length;

        for(int i = 0; i < length; i++) {
            randomFloats[i] = (float) Math.random();
        }

        System.out.println("Исходный массив: ");
        show(randomFloats);

        int quantityZero = 0;
        float middleCellValue = randomFloats[length / 2];
        for(int i = 0; i < length; i++) {
            if(randomFloats[i] > middleCellValue) {
                randomFloats[i] = 0;
                quantityZero++;
            }
        }
        System.out.println("\nИзмененный массив: ");
        show(randomFloats);

        System.out.println("\nКоличество обнуленных ячеек: " + quantityZero);
    }

    private static void show(float[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.printf("%6.3f" , array[i]);
            System.out.print(i == array.length / 2 ? "\n" : " ");
        }
    }

    private static void showElementsArray() {
        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке.");

        char[] alphabet = new char[26];
        int length = alphabet.length;

        for(char i = 0; i < length; i++) {
            alphabet[i] = (char) ('A' + i);
        }

        for(int i = 0; i < length; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(alphabet[length - 1 - j]);
                System.out.print(i == j ? "\n" : "");
            }
        }
    }

    private static void generateElementsArray() {
        System.out.println("\n5. Генерация уникальных чисел.");

        int[] uniqueNumbers = new int[30];

        for(int i = 0; i < uniqueNumbers.length; i++) {
            int intArr = 0;
            boolean notUnique;
            do {
                notUnique = false;
                intArr = (int) (Math.random() * 40 + 60);
                for(int j = 0; j < i; j++) {
                    if(intArr == uniqueNumbers[j]) {
                        notUnique = true;
                        break;
                    }
                }
            } while(notUnique);
            uniqueNumbers[i] = intArr;
        }

        Arrays.sort(uniqueNumbers);

        for(int i = 0; i < uniqueNumbers.length; i++) {
            System.out.print(uniqueNumbers[i]);
            System.out.print(i % 10 == 9 ? "\n" : " ");
        }
    }

    private static void copyElementsArray() {
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
        show(stringsOne);
        System.out.println("Второй массив:");
        show(stringsTwo);
    }

    private static void show(String[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(i == (array.length - 1) ? array[i] + ".\n" : array[i] + ", ");
        }
    }
}