package br.com.ifms.tads.service.interfaces;

import java.util.List;

import br.com.ifms.tads.javabeans.Aluno;

public interface AlunoServiceInterface {
    
    
	Aluno addRegra(Aluno aluno);
	
	long delete(long idRegra);
	
	Aluno update(Aluno alunoUp);
	
	Aluno findById(long id);
	
	List<Aluno> listAll();
}
