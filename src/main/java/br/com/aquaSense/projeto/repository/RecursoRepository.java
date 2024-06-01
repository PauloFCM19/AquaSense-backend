package br.com.aquaSense.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aquaSense.projeto.entity.RecursoEntity;

public interface RecursoRepository extends JpaRepository<RecursoEntity, Long>{

}
