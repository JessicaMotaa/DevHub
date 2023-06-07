package com.devhub.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Artigo {

    private static final long serialVersion = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "VARCHAR(255)")
    private String titulo;

    @Column(columnDefinition = "VARCHAR(255)")
    private String autor;

    @CreationTimestamp
    @DateTimeFormat(pattern="dd/MM/yyyy")
    private LocalDateTime dataCriacao;

    @UpdateTimestamp
    @DateTimeFormat(pattern="dd/MM/yyyy")
    private LocalDateTime dataAtualizacao;

    @Column(columnDefinition = "TEXT")
    private String corpo;

    @ManyToOne
    private Categoria categorias;

}