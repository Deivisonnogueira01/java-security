package br.com.ifms.tads.resource;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifms.tads.javabeans.Aluno;
import br.com.ifms.tads.service.AlunoService;

@RestController
@RequestMapping(value="/api")
public class AlunoResource {

	@Autowired
	AlunoService service;
	
	
@GetMapping(value= "/mensagem")
@PreAuthorize("hasRole('ADMIN') ")
public String mensagem() {
	
	
	return "Ola";
	
} 
	
	@GetMapping(value = "/new-aluno")
public Aluno somar(@RequestBody Aluno aluno){ 
		
		return service.addAluno(aluno);
		
	}
	
	@PostMapping(value = "/salvar")
	@ResponseBody
	public ResponseEntity<?> saveAluno(@Valid @RequestBody Aluno aluno){
		return new ResponseEntity<>(service.addAluno(aluno), HttpStatus.CREATED);
			
		}
	
	@DeleteMapping(path = "/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> delete(@PathVariable Long id){
		//existeAluno(id);
		service.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
