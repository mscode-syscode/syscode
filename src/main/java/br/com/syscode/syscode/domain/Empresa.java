package br.com.syscode.syscode.domain;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Empresa implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_empresa;
	private String endereco;
	private String bairro;
	private String cep;
	private String cidade;
	private String uf;
	private String telefone;
	private String telefone_desc;
	private String email;
	private String email_desc;
	private boolean habilitado;
	private boolean cliente;
	private boolean fornecedor;
	private boolean prospect;
	private String obs;
	private String origem;
	private String razao_social;
	private String CNPJ;
	private String logotipo;
	private String descricao;
	private String empresa;

	@Temporal(TemporalType.TIMESTAMP)
	private Calendar data_cadastro;
	
	
	public String getEmpresanome() {
		return empresa;
	}
	public void setEmpresanome(String empresanome) {
		this.empresa = empresanome;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public Long getId_empresa() {
		return id_empresa;
	}
	public void setId_empresa(Long id_empresa) {
		this.id_empresa = id_empresa;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getTelefone_desc() {
		return telefone_desc;
	}
	public void setTelefone_desc(String telefone_desc) {
		this.telefone_desc = telefone_desc;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail_desc() {
		return email_desc;
	}
	public void setEmail_desc(String email_desc) {
		this.email_desc = email_desc;
	}
	public boolean isHabilitado() {
		return habilitado;
	}
	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}
	public boolean isCliente() {
		return cliente;
	}
	public void setCliente(boolean cliente) {
		this.cliente = cliente;
	}
	public boolean isFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(boolean fornecedor) {
		this.fornecedor = fornecedor;
	}
	public boolean isProspect() {
		return prospect;
	}
	public void setProspect(boolean prospect) {
		this.prospect = prospect;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getRazao_social() {
		return razao_social;
	}
	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	public String getLogotipo() {
		return logotipo;
	}
	public void setLogotipo(String logotipo) {
		this.logotipo = logotipo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Calendar getData_cadastro() {
		return data_cadastro;
	}
	public void setData_cadastro(Calendar data_cadastro) {
		this.data_cadastro = data_cadastro;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CNPJ == null) ? 0 : CNPJ.hashCode());
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((cep == null) ? 0 : cep.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + (cliente ? 1231 : 1237);
		result = prime * result + ((data_cadastro == null) ? 0 : data_cadastro.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((email_desc == null) ? 0 : email_desc.hashCode());
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + (fornecedor ? 1231 : 1237);
		result = prime * result + (habilitado ? 1231 : 1237);
		result = prime * result + ((id_empresa == null) ? 0 : id_empresa.hashCode());
		result = prime * result + ((logotipo == null) ? 0 : logotipo.hashCode());
		result = prime * result + ((obs == null) ? 0 : obs.hashCode());
		result = prime * result + ((origem == null) ? 0 : origem.hashCode());
		result = prime * result + (prospect ? 1231 : 1237);
		result = prime * result + ((razao_social == null) ? 0 : razao_social.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		result = prime * result + ((telefone_desc == null) ? 0 : telefone_desc.hashCode());
		result = prime * result + ((uf == null) ? 0 : uf.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		if (CNPJ == null) {
			if (other.CNPJ != null)
				return false;
		} else if (!CNPJ.equals(other.CNPJ))
			return false;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (cep == null) {
			if (other.cep != null)
				return false;
		} else if (!cep.equals(other.cep))
			return false;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (cliente != other.cliente)
			return false;
		if (data_cadastro == null) {
			if (other.data_cadastro != null)
				return false;
		} else if (!data_cadastro.equals(other.data_cadastro))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (email_desc == null) {
			if (other.email_desc != null)
				return false;
		} else if (!email_desc.equals(other.email_desc))
			return false;
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (fornecedor != other.fornecedor)
			return false;
		if (habilitado != other.habilitado)
			return false;
		if (id_empresa == null) {
			if (other.id_empresa != null)
				return false;
		} else if (!id_empresa.equals(other.id_empresa))
			return false;
		if (logotipo == null) {
			if (other.logotipo != null)
				return false;
		} else if (!logotipo.equals(other.logotipo))
			return false;
		if (obs == null) {
			if (other.obs != null)
				return false;
		} else if (!obs.equals(other.obs))
			return false;
		if (origem == null) {
			if (other.origem != null)
				return false;
		} else if (!origem.equals(other.origem))
			return false;
		if (prospect != other.prospect)
			return false;
		if (razao_social == null) {
			if (other.razao_social != null)
				return false;
		} else if (!razao_social.equals(other.razao_social))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		if (telefone_desc == null) {
			if (other.telefone_desc != null)
				return false;
		} else if (!telefone_desc.equals(other.telefone_desc))
			return false;
		if (uf == null) {
			if (other.uf != null)
				return false;
		} else if (!uf.equals(other.uf))
			return false;
		return true;
	}
}
