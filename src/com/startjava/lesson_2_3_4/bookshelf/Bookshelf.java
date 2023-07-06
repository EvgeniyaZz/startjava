package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    static final int CAPACITY = 10;
    private int quantityBooks;
    private int lengthShelf;

    private final Book[] books = new Book[CAPACITY];

    public int getQuantityBooks() {
        return quantityBooks;
    }

    public int getLengthShelf() {
        return lengthShelf;
    }

    public int getQuantityFreeShelf() {
        return (CAPACITY - quantityBooks);
    }

    public Book[] getBooks() {
        return Arrays.copyOfRange(books, 0, quantityBooks);
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