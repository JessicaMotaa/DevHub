package com.devhub.models;

import jakarta.persistence.*;
import lombok.*;

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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    private String autor;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAtualizacao;
    private String corpo;

    @ManyToOne
    private Categoria categorias;

}