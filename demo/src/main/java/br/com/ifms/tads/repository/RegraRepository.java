package br.com.ifms.tads.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ifms.tads.javabeans.Regra;

public interface RegraRepository extends JpaRepository<Regra, Long>{

	Regra findById(long id);
	
}
