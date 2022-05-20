package br.com.ifms.tads.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifms.tads.javabeans.Regra;
import br.com.ifms.tads.service.RegraService;

@RestController
@RequestMapping(value = "/api/regra/")
public class RegraResource {

	@Autowired
	RegraService service;

	@GetMapping(value = "listarTodos")
	public List<Regra> listAll() {
		return service.listAll();
	}

	@PostMapping(value = "salvar")
	public Regra salvar(Regra regra) {
		return service.addRegra(regra);
	}
	
	@DeleteMapping(value = "delete")
	public long delete(long id) {
		return service.delete(id);
	}

}
