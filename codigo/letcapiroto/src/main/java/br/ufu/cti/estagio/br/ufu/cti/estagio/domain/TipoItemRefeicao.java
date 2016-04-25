package br.ufu.cti.estagio.br.ufu.cti.estagio.domain;
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
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idItemRefeicao", nullable = false)
	private ItemRefeicao itemRefeicao;
	
	
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

	public ItemRefeicao getItemRefeicao() {
		return itemRefeicao;
	}

	public void setItemRefeicao(ItemRefeicao itemRefeicao) {
		this.itemRefeicao = itemRefeicao;
	}

	@Override
	public String toString() {
		return "TipoItemRefeicao [idTipoItemRefeicao=" + idTipoItemRefeicao + ", itemRefeicao=" + itemRefeicao
				+ ", descricao=" + descricao + "]";
	}

	
}