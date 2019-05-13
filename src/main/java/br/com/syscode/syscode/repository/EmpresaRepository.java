package br.com.syscode.syscode.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.syscode.syscode.domain.Empresa;
import java.lang.String;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long>{
	//List<Empresa> findByEmpresa_nome(String empresa_nome);
	List<Empresa> findByCep(String cep);
    List<Empresa> findByBairro(String bairro);
    Optional<Empresa> findByEmpresa(String empresa);
}
