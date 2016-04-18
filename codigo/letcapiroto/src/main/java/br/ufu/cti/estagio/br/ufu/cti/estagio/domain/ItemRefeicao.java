package br.ufu.cti.estagio.br.ufu.cti.estagio.domain;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "ITEMREFEICAO")
public class ItemRefeicao {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idItemRefeicao;
	private String descricao;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idRefeicao", nullable = false)
	private Refeicao refeicao;
	
	@OneToOne(mappedBy="itemRefeicao")
	private TipoItemRefeicao tipoItemRefeicao;
	
	
	
	
	public ItemRefeicao() {
		super();
		// TODO Auto-generated constructor stub
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

	public TipoItemRefeicao getTipoItemRefeicao() {
		return tipoItemRefeicao;
	}

	public void setTipoItemRefeicao(TipoItemRefeicao tipoItemRefeicao) {
		this.tipoItemRefeicao = tipoItemRefeicao;
	}

	public Refeicao getRefeicao() {
		return refeicao;
	}

	public void setRefeicao(Refeicao refeicao) {
		this.refeicao = refeicao;
	}

	

	
}
