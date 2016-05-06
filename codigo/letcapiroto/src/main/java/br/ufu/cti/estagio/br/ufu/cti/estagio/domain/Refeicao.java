package br.ufu.cti.estagio.br.ufu.cti.estagio.domain;
import java.util.List;

import javax.persistence.*;

	@Entity
	@Table(name = "REFEICAO")
	public class Refeicao {
	
		  /**
	     * TABELAS
	     */
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer idRefeicao;
	    
	    private String nome;
	    
	    @OneToMany(fetch=FetchType.LAZY, mappedBy = "refeicao")
	    private List<RestauranteTemRefeicao> restaurantesTemRefeicoes ;
	    
	    @OneToMany(fetch=FetchType.LAZY, mappedBy = "refeicao")
	    private List<RefeicaoTemItemRefeicao> refeicoesTemItensRefeicoes ;
	    
	    @ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "idDataRefeicao", nullable = false)
	    private DataRefeicao dataRefeicao;

		public Integer getIdRefeicao() {
			return idRefeicao;
		}

		public void setIdRefeicao(Integer idRefeicao) {
			this.idRefeicao = idRefeicao;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		

		public Refeicao(String nome) {
			super();
			this.nome = nome;
			
		}

		@Override
		public String toString() {
			return "Refeicao [idRefeicao=" + idRefeicao + ", nome=" + nome + ", restaurantesTemRefeicoes="
					+ restaurantesTemRefeicoes + ", refeicoesTemItensRefeicoes=" + refeicoesTemItensRefeicoes
					+ ", dataRefeicao=" + dataRefeicao + "]";
		}

		


		

		
		
}
