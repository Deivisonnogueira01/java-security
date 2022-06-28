package br.com.ifms.tads.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.ifms.tads.javabeans.Regra;
//import br.com.ifms.tads.repository.RegraRepository;
import br.com.ifms.tads.service.interfaces.RegraServiceInterface;

@Service
public class RegraService implements RegraServiceInterface{

	//@Autowired
//	RegraRepository repository;
	
	
	@Override
	public Regra addRegra(Regra regra) {
		
		
		//return repository.save(regra);
		return null;
	}

	@Override
	public long delete(long idRegra) {
		
		
		
		
		return 0;
	}

	@Override
	public Regra update(Regra regra) {
		
		return null;
	//	return repository.save(regra);
		
	}

	@Override
	public Regra findById(long id) {
	//	return repository.findById(id);
	return null;
	}

	@Override
	public List<Regra> listAll() {
		//return repository.findAll();
		return null;
	}

	
	
	
	
	
	
	
}
