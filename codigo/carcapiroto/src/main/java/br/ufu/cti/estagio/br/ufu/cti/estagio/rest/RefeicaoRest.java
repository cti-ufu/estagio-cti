package br.ufu.cti.estagio.br.ufu.cti.estagio.rest;

import br.ufu.cti.estagio.br.ufu.cti.estagio.br.ufu.cti.estagio.dao.RefeicaoDAO;
import br.ufu.cti.estagio.br.ufu.cti.estagio.br.ufu.cti.estagio.dao.RestauranteDAO;
import br.ufu.cti.estagio.br.ufu.cti.estagio.domain.Refeicao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
public class RefeicaoRest {
	
	@Autowired
    RefeicaoDAO refeicaoDAO;
	
	@Autowired
	RestauranteDAO restauranteDAO;
	
	@RequestMapping("/buscarCardapioRestaurante/{idRestaurante}")
    public List<Refeicao> buscarCardapioRestaurante (@PathVariable("idRestaurante") Integer idRestaurante) {

        List<Refeicao> ref = new ArrayList<>();

        for (Refeicao refeicao : refeicaoDAO.findAll()) {
            if(Restaurante rest =  == )
        }

        return refeicoes;

    }
   
    

 }
    
 

