package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Scanner;

public class Control {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Bookshelf bookshelf = new Bookshelf();
        do {
            printBookshelf(bookshelf);
            printMenu();
            if (select(bookshelf, console, console.nextLine()).equals("5")) {
                break;
            }
            System.out.print("Для продолжения работы нажмите Enter");
            console.nextLine();
        } while(true);
    }

    private static void printBookshelf(Bookshelf bookshelf) {
        if(bookshelf.getQuantityBooks() != 0) {
            System.out.println("В шкафу " + bookshelf.getQuantityBooks() + " книги и свободно " +
                    bookshelf.getQuantityFreeShelf() + " полок");
            for(Book book : bookshelf.getBooks()) {
                System.out.print("|");
                System.out.print(book);
                System.out.println(" ".repeat((bookshelf.getLengthShelf() - book.getLengthInfo())) +
                        "|\n|" + "-".repeat(bookshelf.getLengthShelf()) + "|");
            }
            if(bookshelf.getQuantityBooks() < Bookshelf.CAPACITY) {
                System.out.println("|" + " ".repeat(bookshelf.getLengthShelf()) + "|");
            }
        } else {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
        }
    }

    private static void printMenu() {
        System.out.print("""
                               Меню:
                               1. Добавить новую книгу
                               2. Найти книгу
                               3. Удалить книгу
                               4. Очистить шкаф
                               5. Завершить
                               """);
        System.out.print("Введите 1, 2, 3, 4 или 5: ");
    }

    private static String select(Bookshelf bookshelf, Scanner console, String input) {
        switch(input) {
            case "1" -> addBook(bookshelf, console);
            case "2" -> findBook(bookshelf, console);
            case "3" -> deleteBook(bookshelf, console);
            case "4" -> {
                bookshelf.clear();
                System.out.println("Шкаф освобожден от книг");
            }
            default -> {
                if(!input.equals("5")) {
                    System.out.println("Введенного пункта нет");
                }
            }
        }
        return input;
    }

    private static void addBook(Bookshelf bookshelf, Scanner console) {
        if(bookshelf.getQuantityBooks() < Bookshelf.CAPACITY) {
            System.out.print("Введите автора: ");
            String author = console.nextLine();
            System.out.print("Введите название книги: ");
            String title = console.nextLine();
            System.out.print("Введите год издания: ");
            int publishYear = Integer.parseInt(console.nextLine());
            Book newBook = new Book(author, title, publishYear);
            bookshelf.add(newBook);
            System.out.println("Книга добавлена");
        } else {
            System.out.println("Книга не может быть добавлена, т.к. в шкафу нет места.");
        }
    }

    private static void findBook(Bookshelf bookshelf, Scanner console) {
        System.out.print("Введите название книги: ");
        int numberShelf = bookshelf.find(console.nextLine());
        if(numberShelf != 0) {
            System.out.println("Книга на " + numberShelf + " полке");
        } else {
            System.out.println("Книга не найдена");
        }
    }

    private static void deleteBook(Bookshelf bookshelf, Scanner console) {
        System.out.print("Введите название книги: ");
        if(bookshelf.delete(console.nextLine())) {
            System.out.println("Книга удалена");
        } else {
            System.out.println("Книга не была удалена, т.к. не найдена");
        }
    }
}