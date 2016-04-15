package br.ufu.cti.estagio.br.ufu.cti.estagio.rest;

import br.ufu.cti.estagio.br.ufu.cti.estagio.br.ufu.cti.estagio.dao.RestauranteDAO;
import br.ufu.cti.estagio.br.ufu.cti.estagio.domain.Restaurante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by diego on 05/04/16.
 */
@RestController
public class RestauranteRest {

    @Autowired
    RestauranteDAO restauranteDAO;

    @RequestMapping("/buscarTodosRestaurantes")
    public List<Restaurante> buscarTodosRestaurantes () {

        List<Restaurante> restaurantes = new ArrayList<>();

        for (Restaurante restaurante : restauranteDAO.findAll()) {
            restaurantes.add(restaurante);
        }

        return restaurantes;

    }
    
    @RequestMapping("/adicionarRestaurante/{nomeRestaurante}/{enderecoRestaurante}")
    public void adicionarRestaurante (@PathVariable("nomeRestaurante") String nomeRestaurante,
    												@PathVariable("enderecoRestaurante") String enderecoRestaurante) {

    	restauranteDAO.save(new Restaurante(nomeRestaurante, enderecoRestaurante));

    }
}
