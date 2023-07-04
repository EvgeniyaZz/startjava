package com.startjava.lesson_2_3_4.bookshelf;

public class Book {

    private String author;
    private String title;
    private int publishYear;
    private int lengthInfo;

    public void setAuthor(String author) {
        this.author = author;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public void setLengthInfo(int length) {
        lengthInfo = length;
    }

    public int getLengthInfo() {
        return lengthInfo;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return author + ", " + title + ", " + publishYear;
    }
}