package br.ufu.cti.estagio.br.ufu.cti.estagio.domain;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DATA_REFEICAO")
public class DataRefeicao {

	final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd/MM/YYYY");
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idDatRefeicao;
	
	private LocalDate data;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="dataRefeicao")
    private List<Refeicao> refeicoes;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="dataRefeicao")
	private List<Turno> turnos;
	
	public DataRefeicao(String data) {
		
		this.data = LocalDate.parse(data,DATE_FORMAT);
	}

	public Integer getIdDatRefeicao() {
		return idDatRefeicao;
	}

	public void setIdDatRefeicao(Integer idDatRefeicao) {
		this.idDatRefeicao = idDatRefeicao;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(String data) {
		this.data = LocalDate.parse(data,DATE_FORMAT);
	}

	public List<Refeicao> getRefeicoes() {
		return refeicoes;
	}

	public void setRefeicoes(List<Refeicao> refeicoes) {
		this.refeicoes = refeicoes;
	}

	public List<Turno> getTurnos() {
		return turnos;
	}

	public void setTurnos(List<Turno> turnos) {
		this.turnos = turnos;
	}

	@Override
	public String toString() {
		return "DataRefeicao [idDatRefeicao=" + idDatRefeicao + ", data=" + data.getDayOfWeek() + ", " + data + ", refeicoes=" + refeicoes
				+ ", turnos=" + turnos + "]";
	}
	
	
}
