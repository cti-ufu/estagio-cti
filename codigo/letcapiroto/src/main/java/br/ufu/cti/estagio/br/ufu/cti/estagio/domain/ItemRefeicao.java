package br.ufu.cti.estagio.br.ufu.cti.estagio.domain;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "ITEMREFEICAO")
public class ItemRefeicao {
	  
	
	/**
     * tabelas
     */
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idItemRefeicao;
	private String descricao;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy = "itemRefeicao")
    private List <RefeicaoTemItemRefeicao> refeicoesTemItensRefeicoes;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy = "itemRefeicao")
    private List <TipoItemRefeicao> TiposItensRefeicoes;

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

	public List<RefeicaoTemItemRefeicao> getRefeicoesTemItensRefeicoes() {
		return refeicoesTemItensRefeicoes;
	}

	public void setRefeicoesTemItensRefeicoes(List<RefeicaoTemItemRefeicao> refeicoesTemItensRefeicoes) {
		this.refeicoesTemItensRefeicoes = refeicoesTemItensRefeicoes;
	}

	
	public List<TipoItemRefeicao> getTiposItensRefeicoes() {
		return TiposItensRefeicoes;
	}

	public void setTiposItensRefeicoes(List<TipoItemRefeicao> tiposItensRefeicoes) {
		TiposItensRefeicoes = tiposItensRefeicoes;
	}
    
	
	public ItemRefeicao(String descricao, List<RefeicaoTemItemRefeicao> refeicoesTemItensRefeicoes) {
		super();
		this.descricao = descricao;
		this.refeicoesTemItensRefeicoes = refeicoesTemItensRefeicoes;
	}

	@Override
	public String toString() {
		return "ItemRefeicao [idItemRefeicao=" + idItemRefeicao + ", descricao=" + descricao
				+ ", refeicoesTemItensRefeicoes=" + refeicoesTemItensRefeicoes + ", TiposItensRefeicoes="
				+ TiposItensRefeicoes + "]";
	}
	

	
}
