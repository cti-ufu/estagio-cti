package br.ufu.cti.estagio.br.ufu.cti.estagio.rest;

import org.springframework.web.bind.annotation.RestController;
import br.ufu.cti.estagio.br.ufu.cti.estagio.br.ufu.cti.estagio.dao.ItemRefeicaoDAO;
import br.ufu.cti.estagio.br.ufu.cti.estagio.domain.ItemRefeicao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


@RestController
public class ItemRefeicaoRest {
	@Autowired
    ItemRefeicaoDAO itemRefeicaoDAO;
	
	@RequestMapping("/buscarItemRefeicao")
    public List<ItemRefeicao> buscarItemRefeicao () {
    	
        List<ItemRefeicao> itemRefeicoes = new ArrayList<>();

        for (ItemRefeicao itemRefeicao : itemRefeicaoDAO.findAll()) {
        	itemRefeicoes.add(itemRefeicao);
        }

        return itemRefeicoes;

    }
}
