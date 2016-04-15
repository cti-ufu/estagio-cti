package br.ufu.cti.estagio.br.ufu.cti.estagio.domain;


import java.util.Date;
import java.util.List;

import javax.persistence.*;

	@Entity
	@Table(name = "REFEICAO")
	public class Refeicao {
	

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer idRefeicao;
	    private Date data;
	    
	    @ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "idTipoRefeicao", nullable = false)
	    private TipoRefeicao tipoRefeicao;
	   
	    @OneToMany(fetch=FetchType.LAZY, mappedBy="refeicao")
	    private List<ItemRefeicao> itensRefeicoes;     
	    		

		public Refeicao() {
			super();
		}

		public Integer getIdRefeicao() {
			return idRefeicao;
		}

		public void setIdRefeicao(Integer idRefeicao) {
			this.idRefeicao = idRefeicao;
		}

				
		public Date getData() {
			return data;
		}

		public void setData(Date data) {
			this.data = data;
		}

		public List<ItemRefeicao> getItensRefeicoes() {
			return itensRefeicoes;
		}

		public void setItensRefeicoes(List<ItemRefeicao> itensRefeicoes) {
			this.itensRefeicoes = itensRefeicoes;
		}

		@Override
		public String toString() {
			return "Refeicao [idRefeicao=" + idRefeicao + ", data=" + data + ", itensRefeicoes=" + itensRefeicoes + "]";
		}

		public TipoRefeicao getTipoRefeicao() {
			return tipoRefeicao;
		}

		public void setTipoRefeicao(TipoRefeicao tipoRefeicao) {
			this.tipoRefeicao = tipoRefeicao;
		}

		
}
