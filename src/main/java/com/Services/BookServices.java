package com.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Model.Book;
import com.Repo.BookRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class BookServices {

    @Autowired
    BookRepo bookRepo;
    
    public Book saveBook(Book book){
        return bookRepo.save(book);
    }

    public Book findById(long Id){
        return bookRepo.findById(Id).get();
    }

    public Iterable<Book> findAll(){
        return bookRepo.findAll();
    }
}
