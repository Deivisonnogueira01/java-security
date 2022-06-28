package br.com.ifms.tads.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
	public double subtrair(@RequestParam double n1, @RequestParam double n2){ 
			
			return n1 - n2;
			
		}
	
	
}
