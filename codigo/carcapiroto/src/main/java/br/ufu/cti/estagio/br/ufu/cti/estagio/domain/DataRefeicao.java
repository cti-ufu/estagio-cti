package br.ufu.cti.estagio.br.ufu.cti.estagio.domain;

import java.time.Instant;
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

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idDatRefeicao;
	
	private Instant data;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="dataRefeicao")
    private List<Refeicao> refeicoes;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="dataRefeicao")
	private List<Turno> turnos;
	
	public DataRefeicao(Instant data) {
		this.data = data;
	}

	public Integer getIdDatRefeicao() {
		return idDatRefeicao;
	}

	public void setIdDatRefeicao(Integer idDatRefeicao) {
		this.idDatRefeicao = idDatRefeicao;
	}

	public Instant getData() {
		return data;
	}

	public void setData(Instant data) {
		this.data = data;
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
		return "DataRefeicao [idDatRefeicao=" + idDatRefeicao + ", data=" + data + ", refeicoes=" + refeicoes
				+ ", turnos=" + turnos + "]";
	}
	
	
}
