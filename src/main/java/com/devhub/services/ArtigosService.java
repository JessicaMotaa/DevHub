package com.devhub.services;

import com.devhub.exceptions.classes.ResourceNotFoundException;
import com.devhub.entities.Artigo;
import com.devhub.mappers.ArtigosMapper;
import com.devhub.models.ArtigoDTO;
import com.devhub.repository.ArtigosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ArtigosService {

    @Autowired
    private ArtigosRepository artigosRepository;
    private final ArtigosMapper artigosMapper;

    public Optional<ArtigoDTO> findById(Long id) {
        Artigo artigo = artigosRepository.findById(id).get();
        return Optional.of(artigosMapper.entityToDto(artigo));

        //return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Não foi encontrado artigo com id "+id));
    }

    public ArtigoDTO saveNewArtigo(ArtigoDTO dto) {
        Artigo entidade = artigosMapper.dtoToEntity(dto);
        artigosRepository.save(entidade);
        return artigosMapper.entityToDto(entidade);
    }
}
