package com.Model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "transaction")
public class Transaction implements Serializable{

    public static final long serialVersionUID =1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long transaction_id;
    private long book_id;
    private long customer_id;
    private double price;
    private Date buy_date;
    @ManyToOne
    private Book book;
    @ManyToOne
    private Customer customer;

    public Transaction() {
    }

    public long getTransaction_id() {
        return transaction_id;
    }
    public void setTransaction_id(long transaction_id) {
        this.transaction_id = transaction_id;
    }
    public long getBook_id() {
        return book_id;
    }
    public void setBook_id(long book_id) {
        this.book_id = book_id;
    }
    public long getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(long customer_id) {
        this.customer_id = customer_id;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Date getBuy_date() {
        return buy_date;
    }
    public void setBuy_date(Date buy_date) {
        this.buy_date = buy_date;
    }
    public Book getBook() {
        return book;
    }
    public void setBook(Book book) {
        this.book = book;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Transaction(long transaction_id, long book_id, long customer_id, double price, Date buy_date, Book book,
            Customer customer) {
        this.transaction_id = transaction_id;
        this.book_id = book_id;
        this.customer_id = customer_id;
        this.price = price;
        this.buy_date = buy_date;
        this.book = book;
        this.customer = customer;
    }
  
    
}
