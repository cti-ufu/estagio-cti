package br.ufu.cti.estagio.br.ufu.cti.estagio.domain;



import javax.persistence.*;


@Entity
@Table(name = "TIPOITEMREFEICAO")
public class TipoItemRefeicao {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idTipoItemRefeicao;
	
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private ItemRefeicao itemRefeicao;
	
	
	private String descricao;
	
	public TipoItemRefeicao(){
		
	}
		
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

	public ItemRefeicao getItemRefeicao() {
		return itemRefeicao;
	}

	public void setItemRefeicao(ItemRefeicao itemRefeicao) {
		this.itemRefeicao = itemRefeicao;
	}

	
}