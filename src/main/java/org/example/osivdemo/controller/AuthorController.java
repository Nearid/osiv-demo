package org.example.osivdemo.controller;

import lombok.RequiredArgsConstructor;
import org.example.osivdemo.dto.AuthorDto;
import org.example.osivdemo.mapper.AuthorMapper;
import org.example.osivdemo.service.AuthorService;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authors")
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorService authorService;
    private final AuthorMapper authorMapper;

    @GetMapping("/{authorId}")
    @Transactional
    public ResponseEntity<AuthorDto> getById(@PathVariable Long authorId) {
        return ResponseEntity.of(
                authorService.findById(authorId)
                        .map(authorMapper::toDto)
        );
    }
}
