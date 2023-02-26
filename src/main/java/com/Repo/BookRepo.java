package com.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Model.Book;

public interface BookRepo extends JpaRepository<Book, Long>{
    
}
