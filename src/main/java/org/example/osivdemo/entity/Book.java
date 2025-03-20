package org.example.osivdemo.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;

@Entity
@Table(name = "book")
@Getter
public class Book {

    @Id
    private Long id;

    private String name;

    @Column(name = "publication_date")
    private LocalDate publicationDate;

    @ManyToOne(fetch = FetchType.LAZY)
    private Author author;
}

