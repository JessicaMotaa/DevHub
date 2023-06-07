package com.devhub.mappers;

import com.devhub.entities.Artigo;
import com.devhub.models.ArtigoDTO;
import org.mapstruct.Mapper;

@Mapper
public interface ArtigosMapper {

    ArtigoDTO entityToDto(Artigo entity);
    Artigo dtoToEntity(ArtigoDTO dto);

}
