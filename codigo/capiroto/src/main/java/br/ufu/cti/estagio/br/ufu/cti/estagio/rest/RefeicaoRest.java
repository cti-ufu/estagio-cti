package br.ufu.cti.estagio.br.ufu.cti.estagio.rest;

import br.ufu.cti.estagio.br.ufu.cti.estagio.br.ufu.cti.estagio.dao.RefeicaoDAO;
import br.ufu.cti.estagio.br.ufu.cti.estagio.domain.Refeicao;
import org.springframework.beans.factory.annotation.Autowired;
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
	
    @RequestMapping("/buscarCardapioRestaurante")
    public List<Refeicao> buscarCardapioRestaurante () {
    	
        List<Refeicao> refeicoes = new ArrayList<>();

        for (Refeicao refeicao : refeicaoDAO.findAll()) {
        	refeicoes.add(refeicao);
        }

        return refeicoes;

    }
   
    

 }
    
 

