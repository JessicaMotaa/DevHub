package com.devhub.controllers;

import com.devhub.entities.Artigo;
import com.devhub.exceptions.classes.ResourceNotFoundException;
import com.devhub.models.ArtigoDTO;
import com.devhub.services.ArtigosService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ArtigosController {

    private final static String ARTIGOS_PATH = "/artigos";
    private final static String ARTIGOS_ID_PATH = ARTIGOS_PATH + "/{id}";

    private final ArtigosService service;
    @GetMapping(value = ARTIGOS_ID_PATH)
    public ResponseEntity<ArtigoDTO> findById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(service.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Artigo não encontrado")),
                HttpStatus.OK);
    }

    @PostMapping(value = ARTIGOS_PATH)
    public ResponseEntity<ArtigoDTO> saveNewArtigo(@RequestBody @Validated ArtigoDTO dto) {
        return ResponseEntity.ok(service.saveNewArtigo(dto));
    }
}
