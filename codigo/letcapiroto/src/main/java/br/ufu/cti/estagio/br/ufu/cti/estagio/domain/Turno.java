package br.ufu.cti.estagio.br.ufu.cti.estagio.domain;
import java.time.Instant;

import javax.persistence.*;

	@Entity
	@Table(name = "TURNO")
	public class Turno {
	
		  /**
	     * TABELAS
	     */
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer idTurno;
	    
	    private Instant horaInicio;
	    private Instant horaFim;
	    
	    private String nome;
	    
	    @ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "idDataRefeicao", nullable = false)
	    private DataRefeicao dataRefeicao;
	    
	    
	    
	    
	    public Turno(){
	    }

		public Integer getIdTurno() {
			return idTurno;
		}

		public void setIdTuno(Integer idTurno) {
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
		
		
		
		public Turno( Instant horaInicio, Instant horaFim, String nome) {
			
			
			this.horaInicio = horaInicio;
			this.horaFim = horaFim;
			this.nome = nome;
		}

		@Override
		public String toString() {
			return "Turno [idTurno=" + idTurno + ", horaInicio=" + horaInicio + ", horaFim=" + horaFim + ", nome=" + nome
					+ "]";
		}


		

		

		
		
}
