package br.com.syscode.syscode.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.syscode.syscode.domain.Job;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
	
	@Query(value = "SELECT * FROM job where idjob = ?1", nativeQuery = true)
	Optional<Job> findByIdJob(Long idjob);
	
	@Query(value = "SELECT titulo FROM job WHERE titulo  like %?1% ", nativeQuery=true)
	List<String> findAllbyTitulo (String titulo);
	
	

}
