package br.ufu.cti.estagio.br.ufu.cti.estagio.domain;

import java.util.List;

import javax.persistence.*;

	@Entity
	@Table(name = "Refeicao")
	public class Refeicao {
	

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer idRefeicao;
	    
	    
	    private String dataRefeicao; //olhar essa data
	    
	    @ManyToMany
	    @JoinTable(name = "Refeicao_Restaurante", joinColumns = @JoinColumn(name = "refeicao_id"),
	    	inverseJoinColumns = @JoinColumn( name = "restaurante_id"))
	    private List<Restaurante> restaurantes;
	   
	    
	    public Refeicao (String dataRefeicao) {
	        this.dataRefeicao = dataRefeicao;
	        
	    }


	    public Integer getIdRefeicao() {
			return idRefeicao;
		}

		public void setIdRefeicao(Integer idRefeicao) {
			this.idRefeicao = idRefeicao;
		}

		public String getDataRefeicao() {
			return dataRefeicao;
		}

		public void setDataRefeicao(String dataRefeicao) {
			this.dataRefeicao = dataRefeicao;
		}

		
		
		@Override
	    public String toString() {
	        return "Refeica{" +
	                "idRefeicao= ' " + idRefeicao + '\'' +
	                ", dataRefeicao=" + dataRefeicao +
	                '}';
	    }

}
