package br.ufu.cti.estagio.br.ufu.cti.estagio.domain;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

	@Entity
	@Table(name = "DATAREFEICAO")
	public class DataRefeicao {
	
		  /**
	     * TABELAS
	     */
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer idDataRefeicao;
	    
	    private LocalDate date;
	    
	    @OneToMany(fetch=FetchType.LAZY, mappedBy = "dataRefeicao")
	    private List <Refeicao> refeicoes;
	    
	    @OneToMany(fetch=FetchType.LAZY, mappedBy = "dataRefeicao")
	    private List <Turno> turnos;
	    
	       

		public Integer getIdDataRefeicao() {
			return idDataRefeicao;
		}


		public void setIdDataRefeicao(Integer idDataRefeicao) {
			this.idDataRefeicao = idDataRefeicao;
		}


		public LocalDate getDate() {
			return date;
		}


		public void setDate(LocalDate date) {
			this.date = date;
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

		
		public DataRefeicao(LocalDate date) {
			super();
			this.date = date;
			
		}


		@Override
		public String toString() {
			return "DataRefeicao [idDataRefeicao=" + idDataRefeicao + ", date=" + date + ", refeicoes=" + refeicoes
					+ ", turnos=" + turnos + "]";
		}
		
		



		
	   
		
		
		
}
