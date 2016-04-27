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
@Table(name = "REFEICAO_TEM_ITEM")
public class RefeicaoTemItem {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idRefeicaoTemItem;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idRefeicao", nullable = false)
	private Refeicao refeicao;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idItemRefeicao", nullable = false)
	private ItemRefeicao itemRefeicao;
	
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
		return "RefeicaoTemItem [refeicao=" + refeicao + ", itemRefeicao=" + itemRefeicao + "]";
	}
	
	
}
