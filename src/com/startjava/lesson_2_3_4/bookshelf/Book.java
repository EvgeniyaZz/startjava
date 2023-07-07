package com.startjava.lesson_2_3_4.bookshelf;

public class Book {

    private final String author;
    private final String title;
    private final int publishYear;
    private final int lengthInfo;
    private int position;

    public Book(String author, String title, int publishYear) {
        this.author = author;
        this.title = title;
        this.publishYear = publishYear;
        lengthInfo = toString().length();
    }

    public String getTitle() {
        return title;
    }

    public int getLengthInfo() {
        return lengthInfo;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public String toString() {
        return author + ", " + title + ", " + publishYear;
    }
}