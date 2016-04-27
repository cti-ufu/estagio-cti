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
@Table(name = "RESTAURANTE_TEM_REF")
public class RestauranteTemRef {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idRestauranteTemRef;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idRestaurante", nullable = false)
	private Restaurante restaurante;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idRefeicao", nullable = false)
	private Refeicao refeicao;

	public Restaurante getRestaurante() {
		return restaurante;
	}

	public Integer getIdRestauranteTemRef() {
		return idRestauranteTemRef;
	}

	public void setIdRestauranteTemRef(Integer idRestauranteTemRef) {
		this.idRestauranteTemRef = idRestauranteTemRef;
	}

	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}

	public Refeicao getRefeicao() {
		return refeicao;
	}

	public void setRefeicao(Refeicao refeicao) {
		this.refeicao = refeicao;
	}

	@Override
	public String toString() {
		return "RestauranteTemRef [restaurante=" + restaurante + ", refeicao=" + refeicao + "]";
	}
	
	
}
