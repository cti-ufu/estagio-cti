package br.ufu.cti.estagio.br.ufu.cti.estagio.domain;


import java.util.List;
import javax.persistence.*;


@Entity
@Table(name = "TIPO_ITEM_REFEICAO")
public class TipoItemRefeicao {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idTipoItemRefeicao;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="tipoItemRefeicao")
	private List<ItemRefeicao> itemsRefeicao;
	
	
	private String descricao;
		
	public TipoItemRefeicao(String descricao) {
		super();
		this.descricao = descricao;
	}

	public Integer getIdTipoItemRefeicao() {
		return idTipoItemRefeicao;
	}

	public void setIdTipoItemRefeicao(Integer idTipoItemRefeicao) {
		this.idTipoItemRefeicao = idTipoItemRefeicao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<ItemRefeicao> getItemsRefeicao() {
		return itemsRefeicao;
	}

	public void setItemsRefeicao(List<ItemRefeicao> itemsRefeicao) {
		this.itemsRefeicao = itemsRefeicao;
	}

	@Override
	public String toString() {
		return "TipoItemRefeicao [idTipoItemRefeicao=" + idTipoItemRefeicao + ", itemsRefeicao=" + itemsRefeicao
				+ ", descricao=" + descricao + "]";
	}

	

	
}