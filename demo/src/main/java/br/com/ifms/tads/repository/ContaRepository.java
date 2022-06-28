package br.com.ifms.tads.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ifms.tads.javabeans.Conta;

public interface ContaRepository extends JpaRepository<Conta, Long>{

}
