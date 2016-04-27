package br.ufu.cti.estagio.br.ufu.cti.estagio.domain;

import javax.persistence.*;

@Entity
@Table(name = "ITEM_REF")
public class ItemRef {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idItemRef;

	public Integer getIdItemRef() {
		return idItemRef;
	}

	public void setIdItemRef(Integer idItemRef) {
		this.idItemRef = idItemRef;
	}
	
	
}
