package br.ufu.cti.estagio.br.ufu.cti.estagio.domain;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "TIPOITEMREFEICAO")
public class TipoItemRefeicao {
	
	  /**
     * tabelas
     */
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idTipoItemRefeicao;
	
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy = "tipoItemRefeicao")
    private List <ItemRefeicao> itensRefeicoes;
	
	private String descricao;
	
	
	  /**
     * construtor
     */
	public TipoItemRefeicao(){
		
	}
		
	public TipoItemRefeicao(String descricao) {
		super();
		this.descricao = descricao;
	}
	
	  /**
     * Get's e Set's
     */
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

	@Override
	public String toString() {
		return "TipoItemRefeicao [idTipoItemRefeicao=" + idTipoItemRefeicao + ", itensRefeicoes=" + itensRefeicoes
				+ ", descricao=" + descricao + "]";
	}

	
	


	
}