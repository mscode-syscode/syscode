package br.com.syscode.syscode.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.syscode.syscode.domain.Job;
import br.com.syscode.syscode.repository.JobRepository;

@RestController
@RequestMapping("/job")
public class JobResources {
	
	@Autowired
	JobRepository jobRepository;
	
	@GetMapping
	public List<Job> findAll(){
		System.out.println();
		List<Job> listaJobs = jobRepository.findAll();
		return listaJobs;
	}
	
	@GetMapping("/jobs")
	public Optional<Job> findId(@RequestParam Long id) {
		System.out.println("ID: " +id);
		Optional<Job> job =  jobRepository.findByIdJob(id);
		return job;
	}
	
	
	@GetMapping("/titulo")
	public List<String> findTitulo(@RequestParam String titulo) {
		System.out.println("Buscando ...");
		List<String> busca = jobRepository.findAllbyTitulo(titulo);
		return busca;
	}
	
	
}
