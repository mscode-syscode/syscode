package br.com.syscode.syscode.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.syscode.syscode.domain.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long>{
	//List<Empresa> findByEmpresa_nome(String empresa_nome);
	List<Empresa> findByCep(String cep);
    List<Empresa> findByBairro(String bairro);
    List<Empresa> findByEmpresa(String empresa);
}
