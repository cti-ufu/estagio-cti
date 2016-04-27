package br.ufu.cti.estagio.br.ufu.cti.estagio.domain;


import java.util.Calendar;

import java.util.List;

import javax.persistence.*;

	@Entity
	@Table(name = "REFEICAO")
	public class Refeicao {
	

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer idRefeicao;
	    private String nome;
	    
	    @ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "idDataRefeicao", nullable = false)
	    private DataRefeicao dataRefeicao;
	   
	    @OneToMany(fetch=FetchType.LAZY, mappedBy="refeicao")
	    private List<RestauranteTemRef> restauranteTemRefs;     
	    		

		public Refeicao(String nome) {
			super();
			this.nome = nome;
		}


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


		public DataRefeicao getDataRefeicao() {
			return dataRefeicao;
		}


		public void setDataRefeicao(DataRefeicao dataRefeicao) {
			this.dataRefeicao = dataRefeicao;
		}


		public List<RestauranteTemRef> getRestauranteTemRefs() {
			return restauranteTemRefs;
		}


		public void setRestauranteTemRefs(List<RestauranteTemRef> restauranteTemRefs) {
			this.restauranteTemRefs = restauranteTemRefs;
		}


		@Override
		public String toString() {
			return "Refeicao [idRefeicao=" + idRefeicao + ", nome=" + nome + ", dataRefeicao=" + dataRefeicao
					+ ", restauranteTemRefs=" + restauranteTemRefs + "]";
		}
		
		
}
