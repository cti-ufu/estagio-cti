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

		public List<RestauranteTemRefeicao> getRestaurantesTemRefeicoes() {
			return restaurantesTemRefeicoes;
		}

		public void setRestaurantesTemRefeicoes(List<RestauranteTemRefeicao> restaurantesTemRefeicoes) {
			this.restaurantesTemRefeicoes = restaurantesTemRefeicoes;
		}

		public List<RefeicaoTemItemRefeicao> getRefeicoesTemItensRefeicoes() {
			return refeicoesTemItensRefeicoes;
		}

		public void setRefeicoesTemItensRefeicoes(List<RefeicaoTemItemRefeicao> refeicoesTemItensRefeicoes) {
			this.refeicoesTemItensRefeicoes = refeicoesTemItensRefeicoes;
		}

		public DataRefeicao getDataRefeicao() {
			return dataRefeicao;
		}

		public void setDataRefeicao(DataRefeicao dataRefeicao) {
			this.dataRefeicao = dataRefeicao;
		}

		public Refeicao(String nome, List<RestauranteTemRefeicao> restaurantesTemRefeicoes,
				List<RefeicaoTemItemRefeicao> refeicoesTemItensRefeicoes, DataRefeicao dataRefeicao) {
			super();
			this.nome = nome;
			this.restaurantesTemRefeicoes = restaurantesTemRefeicoes;
			this.refeicoesTemItensRefeicoes = refeicoesTemItensRefeicoes;
			this.dataRefeicao = dataRefeicao;
		}

		@Override
		public String toString() {
			return "Refeicao [idRefeicao=" + idRefeicao + ", nome=" + nome + ", restaurantesTemRefeicoes="
					+ restaurantesTemRefeicoes + ", refeicoesTemItensRefeicoes=" + refeicoesTemItensRefeicoes
					+ ", dataRefeicao=" + dataRefeicao + "]";
		}
	    
	    
	    
	 
		

		
		
}
