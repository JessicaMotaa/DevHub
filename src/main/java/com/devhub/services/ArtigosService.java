package com.devhub.services;

import com.devhub.exceptions.classes.ResourceNotFoundException;
import com.devhub.models.Artigo;
import com.devhub.repository.ArtigosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArtigosService {

    @Autowired
    private ArtigosRepository repository;

    public Artigo findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Não foi encontrado artigo com id "+id));
    }
}
