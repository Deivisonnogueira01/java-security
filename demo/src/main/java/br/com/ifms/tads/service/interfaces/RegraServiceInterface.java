package br.com.ifms.tads.service.interfaces;

import java.util.List;

import br.com.ifms.tads.javabeans.Regra;

public interface RegraServiceInterface {
	
	Regra addRegra(Regra regra);
	
	long delete(long idRegra);
	
	Regra update(Regra regra);
	
	Regra findById(long id);
	
	List<Regra> listAll();
	
	
	
	

}
