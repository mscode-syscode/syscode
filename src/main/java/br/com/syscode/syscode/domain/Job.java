package br.com.syscode.syscode.domain;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class Job implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="idjob")
	private Long idJob;
	@Column(name="codjob")
    private Integer codJob;
	@Column(name="estrategiaconcluidopor")
    private Integer estrategiaConcluidoPor;
 //   private Integer idStatusAtual;
    private String titulo;
    
	private String descricao;
    private boolean concluido;
    @Column(name="estrategiaconcluido")
    private boolean estrategiaConcluido;
    
//-----Transientes ------ //	    

    @Transient private String pd;
    @Transient private String ph;
    @Transient private String dataProposta;
	@Transient private String apresHoraProposta;
    @Transient private Integer idEmp;
    @Transient private Integer idContato;
    @Transient private Integer idJobEditar;
    @Transient private Integer codJobTransient;

//----- Datas ------ //	    
    @Column(name="propostadata")
    @Temporal(TemporalType.TIMESTAMP)private Date propostaData;
    @Column(name="aprespropostadata")
    @Temporal(TemporalType.TIMESTAMP)private Date apresPropostaData;
    @Column(name="criadoem")
    @Temporal(TemporalType.TIMESTAMP)private Calendar criadoEm;//Data de Criação do Job
    @Column(name="estrategiaconcluidodata")
    @Temporal(TemporalType.TIMESTAMP)private Calendar estrategiaConcluidoData;

//------- Relacionamentos -------//	    
    @ManyToOne
    @JoinColumn(name="idempresa")
    private Empresa idempresa;

	public Empresa getIdEmpresa() {
		return idempresa;
	}

	public void setIdEmpresa(Empresa idEmpresa) {
		this.idempresa = idEmpresa;
	}

	public Long getIdJob() {
		return idJob;
	}

	public void setIdJob(Long idJob) {
		this.idJob = idJob;
	}

	public Integer getCodJob() {
		return codJob;
	}

	public void setCodJob(Integer codJob) {
		this.codJob = codJob;
	}

	public Integer getEstrategiaConcluidoPor() {
		return estrategiaConcluidoPor;
	}

	public void setEstrategiaConcluidoPor(Integer estrategiaConcluidoPor) {
		this.estrategiaConcluidoPor = estrategiaConcluidoPor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isConcluido() {
		return concluido;
	}

	public void setConcluido(boolean concluido) {
		this.concluido = concluido;
	}

	public boolean isEstrategiaConcluido() {
		return estrategiaConcluido;
	}

	public void setEstrategiaConcluido(boolean estrategiaConcluido) {
		this.estrategiaConcluido = estrategiaConcluido;
	}

	public String getPd() {
		return pd;
	}

	public void setPd(String pd) {
		this.pd = pd;
	}

	public String getPh() {
		return ph;
	}

	public void setPh(String ph) {
		this.ph = ph;
	}

	public String getDataProposta() {
		return dataProposta;
	}

	public void setDataProposta(String dataProposta) {
		this.dataProposta = dataProposta;
	}

	public String getApresHoraProposta() {
		return apresHoraProposta;
	}

	public void setApresHoraProposta(String apresHoraProposta) {
		this.apresHoraProposta = apresHoraProposta;
	}

	public Integer getIdEmp() {
		return idEmp;
	}

	public void setIdEmp(Integer idEmp) {
		this.idEmp = idEmp;
	}

	public Integer getIdContato() {
		return idContato;
	}

	public void setIdContato(Integer idContato) {
		this.idContato = idContato;
	}

	public Integer getIdJobEditar() {
		return idJobEditar;
	}

	public void setIdJobEditar(Integer idJobEditar) {
		this.idJobEditar = idJobEditar;
	}

	public Integer getCodJobTransient() {
		return codJobTransient;
	}

	public void setCodJobTransient(Integer codJobTransient) {
		this.codJobTransient = codJobTransient;
	}

	public Date getPropostaData() {
		return propostaData;
	}

	public void setPropostaData(Date propostaData) {
		this.propostaData = propostaData;
	}

	public Date getApresPropostaData() {
		return apresPropostaData;
	}

	public void setApresPropostaData(Date apresPropostaData) {
		this.apresPropostaData = apresPropostaData;
	}

	public Calendar getCriadoEm() {
		return criadoEm;
	}

	public void setCriadoEm(Calendar criadoEm) {
		this.criadoEm = criadoEm;
	}

	public Calendar getEstrategiaConcluidoData() {
		return estrategiaConcluidoData;
	}

	public void setEstrategiaConcluidoData(Calendar estrategiaConcluidoData) {
		this.estrategiaConcluidoData = estrategiaConcluidoData;
	}

	/*public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}*/
    
    /*@OneToMany(mappedBy = "idJob")
    private List<JobStatus> jobStatus;*/
 
    
    /*@ManyToOne @JoinColumn(name="idStatusAtual") private JobStatus idStatusAtual; // Do tipo EAGER 
    
    
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idContatoResponsavel")
	private Contato contatos;
    
    @OneToMany(mappedBy = "idJob", cascade=CascadeType.REMOVE, fetch = FetchType.LAZY)
    private List<LocalEvento> localEvento;
    
    @OneToMany(mappedBy = "idJob")
    private List<Interno> idJOb;
    
    @OneToMany(mappedBy="AnexoIdOrigem", fetch = FetchType.LAZY)
    private List<Anexos> Anexos;

    @OneToMany(mappedBy="idOrigem", fetch = FetchType.LAZY)
	private List<Interacao> idOrigem;
	
    @OneToMany(mappedBy="idJob", fetch = FetchType.LAZY)
    private List<NotificaEquipe> notificaEquipe;
    
    @OneToMany(mappedBy = "idJob")
    private List<Lista> idJobLista;
*/    
//----- Fim Relacionamentos ------//
	
		
	
}
