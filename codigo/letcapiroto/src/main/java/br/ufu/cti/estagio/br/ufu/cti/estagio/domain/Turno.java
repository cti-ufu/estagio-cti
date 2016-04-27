package br.ufu.cti.estagio.br.ufu.cti.estagio.domain;
import java.time.Instant;
import java.time.LocalTime;

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
	    
	    private Instant hora = Instant.now();
	    private LocalTime horaInicio;
	    private LocalTime horaFim;
	    private String nome;
	    
	    @ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "idDataRefeicao", nullable = false)
	    private DataRefeicao dataRefeicao;

		public Integer getIdTurno() {
			return idTurno;
		}

		public void setIdTurno(Integer idTurno) {
			this.idTurno = idTurno;
		}

		public Instant getHora() {
			return hora;
		}

		public void setHora(Instant hora) {
			this.hora = hora;
		}

		public LocalTime getHoraInicio() {
			return horaInicio;
		}

		public void setHoraInicio(LocalTime horaInicio) {
			this.horaInicio = horaInicio;
		}

		public LocalTime getHoraFim() {
			return horaFim;
		}

		public void setHoraFim(LocalTime horaFim) {
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

		public Turno(LocalTime horaInicio, LocalTime horaFim, String nome) {
			super();
			
			this.horaInicio = horaInicio;
			this.horaFim = horaFim;
			this.nome = nome;
			
		}

		@Override
		public String toString() {
			return "Turno [idTurno=" + idTurno + ", hora=" + hora + ", horaInicio=" + horaInicio + ", horaFim="
					+ horaFim + ", nome=" + nome + ", dataRefeicao=" + dataRefeicao + "]";
		}
   	    
	    
	    	    
	    


		

		

		
		
}
