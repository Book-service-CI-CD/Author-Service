package com.ust.Author_Service.service;

import com.ust.Author_Service.dto.Book;
import com.ust.Author_Service.dto.Response;
import com.ust.Author_Service.feign.BookClient;
import com.ust.Author_Service.model.Author;
import com.ust.Author_Service.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    BookClient bookClient;

    public Author addAuthor(Author author) {
        return authorRepository.save(author);
    }

    public Response getBooks(String authorId) {
        Author author=authorRepository.findById(authorId).orElse(null);
        List<Book> bookList=bookClient.getBooksByAuthorId(authorId) ;

        Response response = new Response();
        response.setAuthor(author);
        response.setBooks(bookList);
        return response;
    }
}
