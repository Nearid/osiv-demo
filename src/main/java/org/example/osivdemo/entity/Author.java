package org.example.osivdemo.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "author")
@Getter
public class Author {

    @Id
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "birthdate")
    private LocalDate birthDate;

    @OneToMany(mappedBy = "author")
    private List<Book> books = new ArrayList<>();
}
