package com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman;

import javafx.scene.control.DatePicker;

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private double price;
    private int quantity;
    private String genre;
    private DatePicker date;
    private String time;
    private String location;

    public Book(String title, String author, double price, int quantity, String genre, DatePicker date, String time, String location) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
        this.genre = genre;
        this.date = date;
        this.time = time;
        this.location = location;
    }

    public static ArrayList<Book> bookList = new ArrayList<>();

    public Book() {
    }

    public Book(String title, String author, double price, int quantity, String genre) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
        this.genre = genre;
    }

    public DatePicker getDate() {
        return date;
    }

    public void setDate(DatePicker date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static ArrayList<Book> getBookList() {
        return bookList;
    }

    public static void setBookList(ArrayList<Book> bookList) {
        Book.bookList = bookList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", genre='" + genre + '\'' +
                ", date=" + date +
                ", time='" + time + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
