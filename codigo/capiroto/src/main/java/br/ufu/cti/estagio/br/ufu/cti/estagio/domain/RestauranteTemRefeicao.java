package br.ufu.cti.estagio.br.ufu.cti.estagio.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "RESTAURANTETEMREFEICAO")
public class RestauranteTemRefeicao {
	
		private Restaurante restaurante;
		private TipoRefeicao tipoRefeicao;
		
}
