package br.ufu.cti.estagio.br.ufu.cti.estagio.domain;

import java.time.Instant;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

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

	final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm");
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idTurno;
	
	private LocalTime horaInicio;
	private LocalTime horaFim;
	private String nome;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idDataRefeicao", nullable = false)
	private DataRefeicao dataRefeicao;
	
	public Turno(String horaInicio, String horaFim, String nome) {
		super();
		this.horaInicio = LocalTime.parse(horaInicio,TIME_FORMAT);
		this.horaFim = LocalTime.parse(horaFim,TIME_FORMAT);
		this.nome = nome;
	}
	
	public Integer getIdTurno() {
		return idTurno;
	}
	public void setIdTurno(Integer idTurno) {
		this.idTurno = idTurno;
	}
	public LocalTime getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(String horaInicio) {
		this.horaInicio = LocalTime.parse(horaInicio,TIME_FORMAT);
	}
	public LocalTime getHoraFim() {
		return horaFim;
	}
	public void setHoraFim(String horaFim) {
		this.horaFim = LocalTime.parse(horaFim,TIME_FORMAT);
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
