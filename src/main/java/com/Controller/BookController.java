package com.Controller;

import com.Services.BookServices;

import com.Model.Book;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookServices bookServices;

    @PostMapping
    public Book save(@RequestBody Book book){
        return bookServices.saveBook(book);
    }

    @GetMapping
    public Iterable<Book> findAll(){
        return bookServices.findAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Book> findById(Long id){
        return bookServices.findById(id);
    }
}
