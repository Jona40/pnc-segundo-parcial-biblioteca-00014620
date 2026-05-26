package com.uca.pncsegundoparcialbiblioteca.repository;

import com.uca.pncsegundoparcialbiblioteca.domain.entities.Book;
import com.uca.pncsegundoparcialbiblioteca.domain.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    boolean existsByTitleIgnoreCase(String title);
    boolean existsByIsbn(String isbn);
    List<Book> findByGenre(Genre genre);
    List<Book> findByAvailable(Boolean available);
    List<Book> findByGenreAndAvailable(Genre genre, Boolean available);
}