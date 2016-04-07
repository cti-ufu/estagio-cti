package br.ufu.cti.estagio.br.ufu.cti.estagio.domain;

import javax.persistence.*;

@Entity
@Table(name = "ItemRefeicao")
public class ItemRefeicao {
	 	
		@Id
	 	@GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer idItemRefeicao;
	    private String descricao;
	    
	    //criaumconstrutor
	    
		public Integer getIdItemRefeicao() {
			return idItemRefeicao;
		}
		public void setIdItemRefeicao(Integer idItemRefeicao) {
			this.idItemRefeicao = idItemRefeicao;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
	
}
