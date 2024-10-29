package com.ust.Author_Service.controller;

import com.ust.Author_Service.dto.Book;
import com.ust.Author_Service.dto.Response;
import com.ust.Author_Service.model.Author;
import com.ust.Author_Service.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @PostMapping
    public Author addAuthor(@RequestBody Author author){
        return authorService.addAuthor(author);
    }

    @GetMapping("/{authorId}")
    public Response getBooks(@PathVariable String authorId){
        return authorService.getBooks(authorId);
    }
}

