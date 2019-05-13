package br.com.syscode.syscode.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Lista implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idlista;
	private String lista;
	private String listacod;
	
	// ----- job	
	private BigDecimal margempadrao;
	private BigDecimal administracao;
	private BigDecimal subtotalcusto;
	private BigDecimal subtotalvendanaoincideimposto;
	private BigDecimal subtotalvendaincideimposto;
	private BigDecimal administracaovalor;
	private BigDecimal impostovalor;
	private BigDecimal valortotal;
	private BigDecimal listabvfornecedorvalor;
	
	private Integer concluido;	
	private Integer revisao;		
	private Integer numcenariogalderma;
	private String observacoes;
	private String formapagamento;
	private String infoconsolidadogalderma;
	private BigDecimal feereduzido;

	
	@Temporal(TemporalType.TIMESTAMP) private Calendar datacriacao;
	@Temporal(TemporalType.TIMESTAMP) private Calendar dataaprovacao;
	@Temporal(TemporalType.TIMESTAMP) private Calendar datadoevento;
	
	
	public Integer getConcluido() {
		return concluido;
	}
	public void setConcluido(Integer concluido) {
		this.concluido = concluido;
	}
	public Integer getRevisao() {
		return revisao;
	}
	public void setRevisao(Integer revisao) {
		this.revisao = revisao;
	}
	public Integer getNumcenariogalderma() {
		return numcenariogalderma;
	}
	public void setNumcenariogalderma(Integer numcenariogalderma) {
		this.numcenariogalderma = numcenariogalderma;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public String getFormapagamento() {
		return formapagamento;
	}
	public void setFormapagamento(String formapagamento) {
		this.formapagamento = formapagamento;
	}
	public String getInfoconsolidadogalderma() {
		return infoconsolidadogalderma;
	}
	public void setInfoconsolidadogalderma(String infoconsolidadogalderma) {
		this.infoconsolidadogalderma = infoconsolidadogalderma;
	}
	
	public BigDecimal getFeereduzido() {
		return feereduzido;
	}
	public void setFeereduzido(BigDecimal feereduzido) {
		this.feereduzido = feereduzido;
	}
	public BigDecimal getListabvfornecedorvalor() {
		return listabvfornecedorvalor;
	}
	public void setListabvfornecedorvalor(BigDecimal listabvfornecedorvalor) {
		this.listabvfornecedorvalor = listabvfornecedorvalor;
	}
	public BigDecimal getAdministracaovalor() {
		return administracaovalor;
	}
	public void setAdministracaovalor(BigDecimal administracaovalor) {
		this.administracaovalor = administracaovalor;
	}
	public BigDecimal getImpostovalor() {
		return impostovalor;
	}
	public void setImpostovalor(BigDecimal impostovalor) {
		this.impostovalor = impostovalor;
	}
	public BigDecimal getValortotal() {
		return valortotal;
	}
	public void setValortotal(BigDecimal valortotal) {
		this.valortotal = valortotal;
	}
	public Calendar getDatacriacao() {
		return datacriacao;
	}
	public void setDatacriacao(Calendar datacriacao) {
		this.datacriacao = datacriacao;
	}
	public Calendar getDataaprovacao() {
		return dataaprovacao;
	}
	public void setDataaprovacao(Calendar dataaprovacao) {
		this.dataaprovacao = dataaprovacao;
	}
	public Calendar getDatadoevento() {
		return datadoevento;
	}
	public void setDatadoevento(Calendar datadoevento) {
		this.datadoevento = datadoevento;
	}
	public BigDecimal getMargempadrao() {
		return margempadrao;
	}
	public void setMargempadrao(BigDecimal margempadrao) {
		this.margempadrao = margempadrao;
	}
	public BigDecimal getAdministracao() {
		return administracao;
	}
	public void setAdministracao(BigDecimal administracao) {
		this.administracao = administracao;
	}
	public BigDecimal getSubtotalcusto() {
		return subtotalcusto;
	}
	public void setSubtotalcusto(BigDecimal subtotalcusto) {
		this.subtotalcusto = subtotalcusto;
	}
	public BigDecimal getSubtotalvendanaoincideimposto() {
		return subtotalvendanaoincideimposto;
	}
	public void setSubtotalvendanaoincideimposto(BigDecimal subtotalvendanaoincideimposto) {
		this.subtotalvendanaoincideimposto = subtotalvendanaoincideimposto;
	}
	public BigDecimal getSubtotalvendaincideimposto() {
		return subtotalvendaincideimposto;
	}
	public void setSubtotalvendaincideimposto(BigDecimal subtotalvendaincideimposto) {
		this.subtotalvendaincideimposto = subtotalvendaincideimposto;
	}
	public Long getIdlista() {
		return idlista;
	}
	public void setIdlista(Long idlista) {
		this.idlista = idlista;
	}
	public String getListacod() {
		return listacod;
	}
	public void setListacod(String listacod) {
		this.listacod = listacod;
	}
	public String getLista() {
		return lista;
	}
	public void setLista(String lista) {
		this.lista = lista;
	}
}
