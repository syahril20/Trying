package com.Model.Controller;

import com.Services.BookServices;

import com.Model.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookServices bookServices;
    
    public Book save(@RequestBody Book book){
        return bookServices.saveBook(book);
    }

}
