package com.startjava.lesson_2_3_4.bookshelf;

public class Book {

    private final String author;
    private final String title;
    private final int publishYear;
    private int lengthInfo;

    public Book(String author, String title, int publishYear) {
        this.author = author;
        this.title = title;
        this.publishYear = publishYear;
    }

    public void setLengthInfo(int length) {
        lengthInfo = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLengthInfo() {
        return lengthInfo;
    }

    public String toString() {
        return author + ", " + title + ", " + publishYear;
    }
}