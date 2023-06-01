package com.devhub.repository;

import com.devhub.models.Artigo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtigosRepository extends JpaRepository<Artigo, Long> {
}
