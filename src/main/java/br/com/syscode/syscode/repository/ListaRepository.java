package br.com.syscode.syscode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.syscode.syscode.domain.Lista;
import java.lang.String;
import java.util.List;

@Repository
public interface ListaRepository extends JpaRepository<Lista, Long>{
		List<Lista> findByLista(String lista); 
}
