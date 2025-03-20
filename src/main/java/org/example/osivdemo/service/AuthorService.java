package org.example.osivdemo.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.osivdemo.entity.Author;
import org.example.osivdemo.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class AuthorService {

    private final AuthorRepository authorRepository;

//    @Transactional(readOnly = true)
    public Optional<Author> findById(Long id)  {
        return authorRepository.findById(id);
    }
}
