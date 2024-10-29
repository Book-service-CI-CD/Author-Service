package com.ust.Author_Service.dto;

import com.ust.Author_Service.model.Author;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response {
    public Author author;
    public List<Book> books;
}
