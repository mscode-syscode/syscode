package br.com.syscode.syscode.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.syscode.syscode.domain.Empresa;
import br.com.syscode.syscode.domain.Lista;
import br.com.syscode.syscode.repository.ListaRepository;

@RestController
@RequestMapping("/lista")
public class ListaResources {
	
	private final Logger log = LoggerFactory.getLogger(Empresa.class);
	@Autowired
	ListaRepository listaRepository;
	
	@GetMapping
	public List<Lista> findAll(){
		log.info("Buscando todas as listas");
		List<Lista> listas = listaRepository.findAll();
		return listas;
	}
	
	@GetMapping("/nome")
	public List<Lista> findLista(@RequestParam String lista) {
		 List<Lista> lis =  listaRepository.findByLista(lista);
		 return lis;
	}
	
	
}
