package br.ufu.cti.estagio.br.ufu.cti.estagio.domain;

import java.util.List;

import javax.persistence.*;

/**
 * Created by diego on 05/04/16.
 */

@Entity
@Table(name = "TIPO_REFEICAO")
public class TipoRefeicao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idTipoRefeicao;
    
    private String nomeTipoRefeicao;
    private String horario;
    
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idRestaurante", nullable = false)
    private Restaurante restaurante;
    
    @OneToMany(fetch=FetchType.LAZY, mappedBy = "tipoRefeicao")
    private List<Refeicao> refeicoes;
    
    public TipoRefeicao(){
    	
    }
    
  

    public TipoRefeicao(String nomeTipoRefeicao, String horario) {
        this.horario = horario;
        this.nomeTipoRefeicao = nomeTipoRefeicao;
    }

    public String getEnderecoTipoRefeicao() {
        return horario;
    }

    public void setEnderecoTipoRefeicao(String horario) {
        this.horario = horario;
    }

    public Integer getIdTipoRefeicao() {
        return idTipoRefeicao;
    }

    public void setIdTipoRefeicao(Integer idTipoRefeicao) {
        this.idTipoRefeicao = idTipoRefeicao;
    }

    public String getNomeTipoRefeicao() {
        return nomeTipoRefeicao;
    }

    public void setNomeTipoRefeicao(String nomeTipoRefeicao) {
        this.nomeTipoRefeicao = nomeTipoRefeicao;
    }

	

	public List<Refeicao> getRefeicoes() {
		return refeicoes;
	}

	public void setRefeicoes(List<Refeicao> refeicoes) {
		this.refeicoes = refeicoes;
	}
	
	@Override
	public String toString() {
		return "TipoRefeicao [idTipoRefeicao=" + idTipoRefeicao + ", nomeTipoRefeicao=" + nomeTipoRefeicao
				+ ", horario=" + horario + "]";
	}

	public Restaurante getRestaurante() {
		return restaurante;
	}

	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}
    
}
