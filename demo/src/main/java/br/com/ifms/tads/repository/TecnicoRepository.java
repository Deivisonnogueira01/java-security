package br.com.ifms.tads.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ifms.tads.javabeans.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Long> {
    
}
