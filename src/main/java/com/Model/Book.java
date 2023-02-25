package com.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "book")
public class Book implements Serializable{

    public static final long serialVersionUID =1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long book_id;
    private String book_name;
    private String author;
    private double price;
    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private List<Transaction> transaction = new ArrayList<>();

    public Book(List<Transaction> transaction) {
        this.transaction = transaction;
    }
    public List<Transaction> getTransaction() {
        return transaction;
    }
    public void setTransaction(List<Transaction> transaction) {
        this.transaction = transaction;
    }
    public long getBook_id() {
        return book_id;
    }
    public void setBook_id(long book_id) {
        this.book_id = book_id;
    }
    public String getBook_name() {
        return book_name;
    }
    public void setBook_name(String book_name) {
        this.book_name = book_name;
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
    public Book(long book_id, String book_name, String author, double price) {
        this.book_id = book_id;
        this.book_name = book_name;
        this.author = author;
        this.price = price;
    }

    
}
