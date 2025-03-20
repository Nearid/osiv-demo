package org.example.osivdemo.mapper;

import org.example.osivdemo.dto.AuthorDto;
import org.example.osivdemo.dto.BookDto;
import org.example.osivdemo.entity.Author;
import org.springframework.stereotype.Component;

@Component
public class AuthorMapper {

    public AuthorDto toDto(Author author) {
        return AuthorDto
                .builder()
                .id(author.getId())
                .name(author.getFirstName() + " " + author.getLastName())
                .books(author.getBooks().stream()
                        .map(book -> BookDto
                                .builder()
                                .id(book.getId())
                                .name(book.getName())
                                .build())
                        .toList())
                .build();
    }
}
