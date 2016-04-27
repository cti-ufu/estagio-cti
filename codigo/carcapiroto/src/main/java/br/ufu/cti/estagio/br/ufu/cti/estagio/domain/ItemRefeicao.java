package br.ufu.cti.estagio.br.ufu.cti.estagio.domain;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "ITEM_REFEICAO")
public class ItemRefeicao {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idItemRefeicao;
	
	private String descricao;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="itemRefeicao")
    private List<RefeicaoTemItem> refeicaoTemItem;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idTipoItemRefeicao", nullable = false)
    private TipoItemRefeicao tipoItemRefeicao;
		
	public ItemRefeicao(String descricao) {
		super();
		// TODO Auto-generated constructor stub
		this.descricao = descricao;
	}

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

	public List<RefeicaoTemItem> getRefeicaoTemItem() {
		return refeicaoTemItem;
	}

	public void setRefeicaoTemItem(List<RefeicaoTemItem> refeicaoTemItem) {
		this.refeicaoTemItem = refeicaoTemItem;
	}

	public TipoItemRefeicao getTipoItemRefeicao() {
		return tipoItemRefeicao;
	}

	public void setTipoItemRefeicao(TipoItemRefeicao tipoItemRefeicao) {
		this.tipoItemRefeicao = tipoItemRefeicao;
	}

	@Override
	public String toString() {
		return "ItemRefeicao [idItemRefeicao=" + idItemRefeicao + ", descricao=" + descricao + ", refeicaoTemItem="
				+ refeicaoTemItem + ", tipoItemRefeicao=" + tipoItemRefeicao + "]";
	}

	
	
	
}
