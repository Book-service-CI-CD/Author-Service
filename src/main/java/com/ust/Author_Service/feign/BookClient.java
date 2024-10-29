package com.ust.Author_Service.feign;

import com.ust.Author_Service.dto.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "Book-Service", url = "http://book-sr:5959")
public interface BookClient {

    @GetMapping("/api/books/author/{bookAuthorId}")
    List<Book> getBooksByAuthorId(@PathVariable String bookAuthorId);
}
