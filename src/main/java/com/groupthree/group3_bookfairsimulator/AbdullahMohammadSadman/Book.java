package com.groupthree.group3_bookfairsimulator.AbdullahMohammadSadman;

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private double price;
    private int quantity;
    private String genre;

    private int totalSales;

    public int getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(int totalSales) {
        this.totalSales = totalSales;
    }

    protected static ArrayList<Book> bookList = new ArrayList<>();

    public Book() {
    }

    public Book(String title, String author, double price, int quantity, String genre) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
        this.genre = genre;
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
                '}';
    }
}
