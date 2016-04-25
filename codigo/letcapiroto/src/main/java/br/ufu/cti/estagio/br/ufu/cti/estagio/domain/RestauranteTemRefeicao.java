package br.ufu.cti.estagio.br.ufu.cti.estagio.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "RESTAURANTEREFEICAO")
public class RestauranteTemRefeicao {
		
		
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "idRestaurante", nullable = false)
		private Restaurante restaurante;
		
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "idRefeicao", nullable = false)
		private Refeicao refeicao;
		
		
		public RestauranteTemRefeicao(){
			
		}
		public RestauranteTemRefeicao(Restaurante restaurante, Refeicao Refeicao) {
			super();
			this.restaurante = restaurante;
			this.refeicao = Refeicao;
		}



		public Restaurante getRestaurante() {
			return restaurante;
		}



		public void setRestaurante(Restaurante restaurante) {
			this.restaurante = restaurante;
		}



		public Refeicao getTipoRefeicao() {
			return refeicao;
		}



		public void setRefeicao(Refeicao refeicao) {
			this.refeicao = refeicao;
		}



		@Override
		public String toString() {
			return "RestauranteTemTipoRefeicao [restaurante=" + restaurante + ", refeicao=" + refeicao + "]";
		}
		
}
