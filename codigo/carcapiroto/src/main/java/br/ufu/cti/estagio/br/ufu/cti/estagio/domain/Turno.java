package br.ufu.cti.estagio.br.ufu.cti.estagio.domain;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TURNO")
public class Turno {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idTurno;
	
	private Instant horaInicio;
	private Instant horaFim;
	private String nome;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idDataRefeicao", nullable = false)
	private DataRefeicao dataRefeicao;
	
	public Turno(Instant horaInicio, Instant horaFim, String nome) {
		super();
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
		this.nome = nome;
	}
	
	public Integer getIdTurno() {
		return idTurno;
	}
	public void setIdTurno(Integer idTurno) {
		this.idTurno = idTurno;
	}
	public Instant getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(Instant horaInicio) {
		this.horaInicio = horaInicio;
	}
	public Instant getHoraFim() {
		return horaFim;
	}
	public void setHoraFim(Instant horaFim) {
		this.horaFim = horaFim;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public DataRefeicao getDataRefeicao() {
		return dataRefeicao;
	}
	public void setDataRefeicao(DataRefeicao dataRefeicao) {
		this.dataRefeicao = dataRefeicao;
	}
	@Override
	public String toString() {
		return "Turno [idTurno=" + idTurno + ", horaInicio=" + horaInicio + ", horaFim=" + horaFim + ", nome=" + nome
				+ ", dataRefeicao=" + dataRefeicao + "]";
	}
	
	
	
}
