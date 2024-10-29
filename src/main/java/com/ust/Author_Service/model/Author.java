package com.ust.Author_Service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "authors")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Author {
    @Id
    public String authorId;
    public String authorName;
    public String emailId;
}
