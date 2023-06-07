package com.devhub.repository;

import com.devhub.entities.Artigo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtigosRepository extends JpaRepository<Artigo, Long> {
}
