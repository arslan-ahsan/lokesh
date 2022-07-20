package com.example.firstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;


    @GetMapping("/getallbooks")
    public List<BookEntity> getallbooks(){
        return bookRepository.findAll();
    }

    @PostMapping("/addbook")
    public String addBook(@RequestBody BookEntity book){
        bookRepository.save(book);
        return "new Book Saved";
    }

    @DeleteMapping("/deletebook")
    public String deleteBook(@RequestBody BookEntity book){
        bookRepository.delete(book);
        return "deleted Successfully";
    }

}
