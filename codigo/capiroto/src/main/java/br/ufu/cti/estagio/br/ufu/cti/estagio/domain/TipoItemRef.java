package br.ufu.cti.estagio.br.ufu.cti.estagio.domain;

import javax.persistence.*;

@Entity
@Table(name = "ITEM_REF")
public class TipoItemRef {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idTipoItemRef;
	
	private String descricao;

	public Integer getIdTipoItemRef() {
		return idTipoItemRef;
	}

	public void setIdTipoItemRef(Integer idTipoItemRef) {
		this.idTipoItemRef = idTipoItemRef;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
