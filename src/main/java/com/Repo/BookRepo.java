package com.Repo;

import org.springframework.data.repository.CrudRepository;

import com.Model.Book;

public interface BookRepo extends CrudRepository<Book, Long>{
    
}
