package br.com.ifms.tads.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ifms.tads.javabeans.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{

}
