package br.ufu.cti.estagio.br.ufu.cti.estagio.domain;
import javax.persistence.*;


@Entity
@Table(name = "TipoItemRefeicao")
public class TipoItemRefeicao {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idTipoItemRefeicao;
	
	private String Descricao;
}