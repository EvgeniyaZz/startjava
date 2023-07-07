package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    static final int CAPACITY = 10;
    private final Book[] books = new Book[CAPACITY];
    private int quantityBooks;
    private int lengthShelf;

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
        return Arrays.copyOf(books, quantityBooks);
    }

    public void add(Book newBook) {
        books[quantityBooks] = newBook;
        newBook.setPosition(++quantityBooks);
        setLengthShelf(newBook);
    }

    public Book find(String title) {
        for(int i = 0; i < quantityBooks; i++) {
            if(title.equals(books[i].getTitle())) {
                return books[i];
            }
        }
        return null;
    }

    public boolean delete(String title) {
        for(int i = 0; i < quantityBooks; i++) {
            if(title.equals(books[i].getTitle())) {
                if(lengthShelf == books[i].toString().length()) {
                    lengthShelf = 0;
                    for(int j = 0; j < quantityBooks; j++) {
                        if(j == i) {
                            continue;
                        }
                        setLengthShelf(books[j]);
                    }
                }
                for(int j = quantityBooks - 1; j > i; j--) {
                    books[j].setPosition(books[j].getPosition() - 1);
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

    private void setLengthShelf(Book book) {
        if(book.getLengthInfo() > lengthShelf) {
            lengthShelf = book.getLengthInfo();
        }
    }
}