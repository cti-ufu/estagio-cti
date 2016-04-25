package br.ufu.cti.estagio.br.ufu.cti.estagio.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "REFEICAOTEMITEMREFEICAO")
public class RefeicaoTemItemRefeicao {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private Integer idRefeicaoTemItemRefeicao;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idRefeicao", nullable = false)
	private Refeicao refeicao;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idItemRefeicao", nullable = false)
	private ItemRefeicao itemRefeicao;
	
	
	
	public RefeicaoTemItemRefeicao(){
		
	}
	
	
	public RefeicaoTemItemRefeicao(Refeicao refeicao, ItemRefeicao itemRefeicao) {
		super();
		this.refeicao = refeicao;
		this.itemRefeicao = itemRefeicao;
	}
	public Refeicao getRefeicao() {
		return refeicao;
	}
	public void setRefeicao(Refeicao refeicao) {
		this.refeicao = refeicao;
	}
	public ItemRefeicao getItemRefeicao() {
		return itemRefeicao;
	}
	public void setItemRefeicao(ItemRefeicao itemRefeicao) {
		this.itemRefeicao = itemRefeicao;
	}




	@Override
	public String toString() {
		return "RefeicaoTemItemRefeicao [idRefeicaoTemItemRefeicao=" + idRefeicaoTemItemRefeicao + ", refeicao="
				+ refeicao + ", itemRefeicao=" + itemRefeicao + "]";
	}
	
	
	
}
