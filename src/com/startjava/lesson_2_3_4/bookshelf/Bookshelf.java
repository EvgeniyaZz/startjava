package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    static final int MAX_QUANTITY_BOOKS = 10;
    private int quantityBooks;
    private int lengthShelf;

    private final Book[] books = new Book[MAX_QUANTITY_BOOKS];

    public int getQuantityBooks() {
        return quantityBooks;
    }

    public int getQuantityFreeShelf() {
        return (MAX_QUANTITY_BOOKS - quantityBooks);
    }

    public Book getBook(int index) {
        return books[index];
    }

    public int getLengthShelf() {
        return lengthShelf;
    }

    public void add(Book newBook) {
        books[quantityBooks] = newBook;
        newBook.setLengthInfo(newBook.toString().length());
        if(newBook.getLengthInfo() > lengthShelf) {
            lengthShelf = newBook.getLengthInfo();
        }
        quantityBooks++;
    }

    public int find(String inputDate) {
        for(int i = 0; i < quantityBooks; i++) {
            if(inputDate.equals(books[i].getTitle())) {
                return ++i;
            }
        }
        return 0;
    }

    public boolean delete(String inputDate) {
        for(int i = 0; i < quantityBooks; i++) {
            if(inputDate.equals(books[i].getTitle())) {
                if(lengthShelf == books[i].toString().length()) {
                    lengthShelf = 0;
                    for(int j = 0; j < quantityBooks; j++) {
                        if(j == i) {
                            continue;
                        }
                        if(books[j].toString().length() > lengthShelf) {
                            lengthShelf = books[j].toString().length();
                        }
                    }
                }
                System.arraycopy(books, i + 1, books, i, (quantityBooks - 1 - i));
                quantityBooks--;
                return true;
            }
        }
        return false;
    }

    public void clear() {
        Arrays.fill(books, 0, quantityBooks, null);
        quantityBooks = 0;
        lengthShelf = 0;
    }
}