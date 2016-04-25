package br.ufu.cti.estagio.br.ufu.cti.estagio.domain;
import java.time.Instant;
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
	    
	    private Instant date;
	    
	    @OneToMany(fetch=FetchType.LAZY, mappedBy = "dataRefeicao")
	    private List <Refeicao> refeicoes;
	    
	    @OneToMany(fetch=FetchType.LAZY, mappedBy = "dataRefeicao")
	    private List <Turno> turnos;
	    
	    
		public Instant getDate() {
			return date;
		}

		public void setDate(Instant date) {
			this.date = date;
		}

		public DataRefeicao(Instant date) {
			super();
			this.date = date;
		}

		@Override
		public String toString() {
			return "DataRefeicao [idDataRefeicao=" + idDataRefeicao + ", date=" + date + "]";
		}
	    
	    
	   
		
		
		
}
