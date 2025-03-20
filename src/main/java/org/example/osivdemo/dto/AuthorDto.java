package org.example.osivdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class AuthorDto {

    private Long id;
    private String name;
    private List<BookDto> books = new ArrayList<>();
}
