package com.uca.pncsegundoparcialbiblioteca.controller;

import jakarta.persistence.*;
        import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "books")
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String title;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false, unique = true)
    private String isbn;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Genre genre;

    private Integer totalCopies;
    private Integer availableCopies;
    private Boolean available;
    private LocalDate publishedDate;
    private String description;
}

