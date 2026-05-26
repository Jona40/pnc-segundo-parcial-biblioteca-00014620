package com.uca.pncsegundoparcialbiblioteca.domain.dtos;

import com.uca.pncsegundoparcialbiblioteca.domain.entities.Genre;
import jakarta.validation.constraints.*;
        import lombok.Data;
import java.time.LocalDate;

@Data
public class BookRequestDTO {
    @NotBlank(message = "El título es obligatorio")
    private String title;

    @NotBlank(message = "El autor es obligatorio")
    private String author;

    @NotBlank(message = "El ISBN es obligatorio")
    private String isbn;

    @NotNull(message = "El género es obligatorio")
    private Genre genre;

    @Min(value = 1, message = "Debe haber al menos 1 copia")
    private Integer totalCopies;

    @PastOrPresent(message = "La fecha no puede ser futura")
    private LocalDate publishedDate;

    private String description;
}



