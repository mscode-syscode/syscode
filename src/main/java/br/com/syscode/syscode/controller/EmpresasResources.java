package br.com.syscode.syscode.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.cj.exceptions.DataConversionException;

import br.com.syscode.syscode.domain.Empresa;
import br.com.syscode.syscode.repository.EmpresaRepository;

@RestController
@RequestMapping("/empresas")
public class EmpresasResources {

	private final Logger log = LoggerFactory.getLogger(Empresa.class);
	
	@Autowired
	EmpresaRepository empresaRepository;
	
	@GetMapping
	public List<Empresa> findAll() throws SQLException{
		List<Empresa> empresas = new ArrayList<>();
		try {
			log.info("Listando todas as Empresas.");
			empresas =  empresaRepository.findAll();
		} catch (DataConversionException e) {
			System.out.println("Ocorreu um erro aqui: " + e);
		}
		return empresas;
	}

	@GetMapping("/{id}")
	public  ResponseEntity<Optional<Empresa>> find(@PathVariable Long id){
		log.info("Consultando Empresa pelo id: "+ id);
		
		Optional<Empresa> empresas = empresaRepository.findById(id) ;
		return empresas != null ? ResponseEntity.ok(empresas) : ResponseEntity.notFound().build();
	}
	
	@GetMapping("/empresa/nome")
	public  List<Empresa> findNome(@RequestParam("empresa") String empresa){
	 	
		System.out.println(empresa);
		List<Empresa> empresaNome = empresaRepository.findByEmpresa(empresa); 
		
	 	for (Empresa empresa2 : empresaNome) {
			System.out.println(empresa2.getEmpresa());
		}
	 	return empresaNome;
	}
	
	@GetMapping("/empresa/bairro")
	@ResponseBody
	public  List<Empresa> findbairro(@RequestParam("bairro") String bairro){
		List<Empresa> empresaNome = empresaRepository.findByBairro(bairro); 
		return empresaNome;
	}
	
	@PostMapping
	public void saveEmpresa(@RequestBody Empresa empresa) {
		log.info("Persistindo a empresa: " + empresa.getEmpresa());
		empresaRepository.save(empresa);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteEmpresa(@PathVariable Long id) {
		log.info("Deletando empresa com o id:" + id);
		empresaRepository.deleteById(id);
	}
	
	
}
