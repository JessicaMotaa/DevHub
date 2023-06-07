package com.devhub.models;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalDateTime;

@Data
public class ArtigoDTO {

    private Integer id;
    @NotNull
    @NotEmpty
    private String titulo;
    @NotNull
    @NotEmpty
    private String autor;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAtualizacao;
    private String corpo;

}
