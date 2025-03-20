package org.example.osivdemo.repository;

import org.example.osivdemo.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {


//    @EntityGraph(attributePaths = "books")
//    Optional<Author> findById(long id);

//    @Query("""
//            SELECT a FROM Author a
//            JOIN FETCH a.books
//            WHERE a.id = :id
//            """)
//    Optional<Author> findByIdWithBooks(long id);
}
