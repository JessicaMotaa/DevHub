package com.devhub.controllers;

import com.devhub.models.Artigo;
import com.devhub.services.ArtigosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/artigos")
public class ArtigosController {
    @Autowired
    private ArtigosService service;
    @GetMapping("/{id}")
    public ResponseEntity<Artigo> findById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }
}
