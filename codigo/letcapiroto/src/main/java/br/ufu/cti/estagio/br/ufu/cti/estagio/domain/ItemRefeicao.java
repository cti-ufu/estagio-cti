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
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idTipoItemRefeicao", nullable = false)
	private TipoItemRefeicao tipoItemRefeicao;

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

	
	
	public ItemRefeicao(String descricao, List<RefeicaoTemItemRefeicao> refeicoesTemItensRefeicoes) {
		super();
		this.descricao = descricao;
		this.refeicoesTemItensRefeicoes = refeicoesTemItensRefeicoes;
	}

	

	
}
