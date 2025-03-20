package org.example.osivdemo.dto;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class BookDto {

    private Long id;
    private String name;
}
