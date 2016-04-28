package br.ufu.cti.estagio.br.ufu.cti.estagio.br.ufu.cti.estagio.dao;

import br.ufu.cti.estagio.br.ufu.cti.estagio.domain.Restaurante;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.*;

/**
 * Created by diego on 05/04/16.
 */
public interface RestauranteDAO extends CrudRepository <Restaurante , Integer>{

}
